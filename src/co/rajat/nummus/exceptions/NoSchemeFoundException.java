package co.rajat.nummus.exceptions;

public class NoSchemeFoundException extends Exception
{
    private static final long serialVersionUID = -2512272586236289249L;

    public NoSchemeFoundException (String message)
    {
        super (message);
    }
    
    public NoSchemeFoundException (Throwable cause)
    {
        super (cause);
    }
    
    public NoSchemeFoundException (String message, Throwable cause)
    {
        super (message, cause);
    }
}
