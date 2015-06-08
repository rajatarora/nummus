package co.rajat.nummus.info;

public enum SchemeParameter
{
    ID("id"),
    
    ISIN_PAYOUT("isin_payout"),
    
    ISIN_REINVEST("isin_reinvest"),
    
    NAME("isin_name"),
    
    TYPE("type"),
    
    AMC("amc");
    
    private String Name;
    
    private SchemeParameter (String name)
    {
        this.Name = name;
    }
    
    public String getName()
    {
        return Name;
    }
}
