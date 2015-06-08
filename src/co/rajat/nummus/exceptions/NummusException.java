package co.rajat.nummus.exceptions;

public class NummusException extends Exception
{
    private static final long serialVersionUID = -1097608176154752933L;

    public NummusException (String message)
    {
        super (message);
    }
    
    public NummusException (Throwable cause)
    {
        super (cause);
    }
    
    public NummusException (String message, Throwable cause)
    {
        super (message, cause);
    }
}
