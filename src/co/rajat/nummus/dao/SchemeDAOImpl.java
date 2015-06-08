package co.rajat.nummus.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import co.rajat.fulcrum.dal.MongoDAL;
import co.rajat.nummus.constants.NummusConstants;
import co.rajat.nummus.constants.PropertyConstants;
import co.rajat.nummus.exceptions.DAOException;
import co.rajat.nummus.info.Scheme;
import co.rajat.nummus.info.SchemeParameter;
import co.rajat.nummus.info.SchemePrice;

public class SchemeDAOImpl implements SchemeDAO
{
    @Override
    public Scheme getSchemeById(String schemeId) throws DAOException
    {
        List<Scheme> lstSchemes = searchSchemes(SchemeParameter.ID, schemeId);
        return lstSchemes.get(0);
    }

    @Override
    public List<Scheme> getSchemesByIds(List<String> schemeIds) throws DAOException
    {
        List<Scheme> lstSchemes = new ArrayList<Scheme>();
        try
        {
            for (String schemeId : schemeIds)
            {
                List<Scheme> searchResult = searchSchemes(SchemeParameter.ID, schemeId);
                if (searchResult.size() > 0)
                {
                    lstSchemes.addAll(searchResult);
                }
            }
        }
        catch (DAOException ignore)
        {
            // Ignored. Throw only if none of the IDs return results.
        }
        if (lstSchemes.size() > 0)
        {
            return lstSchemes;
        }
        else
        {
            // None of the IDs return results.
            throw new DAOException("No schemes found.");
        }
    }

    @Override
    public List<Scheme> searchSchemes(SchemeParameter param, String paramValue) throws DAOException
    {
        List<Scheme> schemes = new ArrayList<Scheme>();
        try
        {
            Document doc = new Document(param.getName(), paramValue);
            MongoDAL mongoDAL = MongoDAL.getInstance(NummusConstants.Config);
            List<Map<String, Object>> result = mongoDAL.find(getDBName(), getSchemeCollectionName(), doc);

            for (Map<String, Object> row : result)
            {
                Scheme scheme = new Scheme();
                scheme.setAMC(row.get(SchemeParameter.AMC.getName()).toString());
                scheme.setISINPayout(row.get(SchemeParameter.ISIN_PAYOUT.getName()).toString());
                scheme.setISINReinvest(row.get(SchemeParameter.ISIN_REINVEST.getName()).toString());
                scheme.setName(row.get(SchemeParameter.NAME.getName()).toString());
                scheme.setSchemeID(row.get(SchemeParameter.ID.getName()).toString());
                schemes.add(scheme);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new DAOException(e);
        }
        return schemes;
    }

    @Override
    public List<SchemePrice> getSchemePrices(String schemeId, LocalDate from, LocalDate to) throws DAOException
    {
        return getSchemePrices(getSchemeById(schemeId), from, to);
    }
    
    @Override
    public List<SchemePrice> getSchemePrices(Scheme scheme, LocalDate from, LocalDate to) throws DAOException
    {
        List<SchemePrice> schemePrices = new ArrayList<SchemePrice>();
        try
        {
            SchemePrice schemePrice = new SchemePrice();
            schemePrice.setScheme(scheme);
            
            
        }
        catch (Exception e)
        {
            
        }
        
        return null;
    }

    

    // HELPER FUNCTIONS -- MONGO SPECIFIC, SO THEY STAY HERE
    // ############################################################

    private String getDBName()
    {
        String key = PropertyConstants.DATABASE + PropertyConstants.KEY_SEPARATOR + PropertyConstants.NAME;
        return NummusConstants.Config.getProperty(key);
    }
    
    private String getSchemeCollectionName()
    {
        String key = PropertyConstants.COLLECTION + PropertyConstants.KEY_SEPARATOR + PropertyConstants.SCHEME + PropertyConstants.KEY_SEPARATOR + PropertyConstants.NAME;
        return NummusConstants.Config.getProperty(key);
    }

    private String getPriceCollectionName(LocalDate date)
    {
        String key = PropertyConstants.COLLECTION + PropertyConstants.KEY_SEPARATOR + PropertyConstants.PRICES + PropertyConstants.KEY_SEPARATOR
                + PropertyConstants.PREFIX;

        return NummusConstants.Config.getProperty(key) + PropertyConstants.VALUE_SEPARATOR + date.getYear();
    }

    // #############################################################################
    // History Parser -> Object -> DAO -> DAL
    // Text Parser -> Object -> DAO -> DAL
    // DAL -> DAO -> Object -> Portfolio aggregation
}
