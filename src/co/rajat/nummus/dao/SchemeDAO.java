package co.rajat.nummus.dao;

import java.time.LocalDate;
import java.util.List;

import co.rajat.nummus.exceptions.DAOException;
import co.rajat.nummus.info.Scheme;
import co.rajat.nummus.info.SchemeParameter;
import co.rajat.nummus.info.SchemePrice;

public interface SchemeDAO
{
    public Scheme getSchemeById(String schemeId) throws DAOException;

    public List<Scheme> getSchemesByIds(List<String> schemeIds) throws DAOException;
    
    public List<Scheme> searchSchemes(SchemeParameter param, String paramValue) throws DAOException;

    public List<SchemePrice> getSchemePrices(Scheme scheme, LocalDate from, LocalDate to) throws DAOException;
    
    public List<SchemePrice> getSchemePrices(String schemeId, LocalDate from, LocalDate to) throws DAOException;
}