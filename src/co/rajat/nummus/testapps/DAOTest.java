package co.rajat.nummus.testapps;

import co.rajat.nummus.dao.SchemeDAO;
import co.rajat.nummus.dao.SchemeDAOImpl;
import co.rajat.nummus.exceptions.DAOException;
import co.rajat.nummus.info.SchemeParameter;

public class DAOTest
{
    public static void main (String... args) throws DAOException
    {
        SchemeDAO schemeDAO = new SchemeDAOImpl();
        System.out.println(schemeDAO.searchSchemes(SchemeParameter.ID, "12702"));
    }
}
