package co.rajat.nummus.exceptions;

public class DAOException extends Exception
{
    private static final long serialVersionUID = -6408087015628128666L;

    public DAOException(String message)
    {
        super(message);
    }
    
    public DAOException(Throwable cause)
    {
        super(cause);
    }
    
    public DAOException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
