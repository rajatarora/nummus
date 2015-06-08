package co.rajat.nummus.info;

/**
 * Uniquely represents a scheme
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 30-May-2015
 */
public class Scheme
{
    private String SchemeID;
    
    private String Name;
    
    private String Type;
    
    private String AMC;
    
    private String ISINPayout;
    
    private String ISINReinvest;

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Scheme [");
        if (Name != null) builder.append("Name=").append(Name).append(", ");
        if (SchemeID != null) builder.append("Code=").append(SchemeID).append(", ");
        if (Type != null) builder.append("Type=").append(Type).append(", ");
        if (AMC != null) builder.append("AMC=").append(AMC).append(", ");
        if (ISINPayout != null) builder.append("ISINPayout=").append(ISINPayout).append(", ");
        if (ISINReinvest != null) builder.append("ISINReinvest=").append(ISINReinvest);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((SchemeID == null) ? 0 : SchemeID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Scheme other = (Scheme) obj;
        if (SchemeID == null)
        {
            if (other.SchemeID != null) return false;
        }
        else if (!SchemeID.equals(other.SchemeID)) return false;
        return true;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getSchemeID()
    {
        return SchemeID;
    }

    public void setSchemeID(String schemeID)
    {
        SchemeID = schemeID;
    }

    public String getType()
    {
        return Type;
    }

    public void setType(String type)
    {
        Type = type;
    }

    public String getAMC()
    {
        return AMC;
    }

    public void setAMC(String aMC)
    {
        AMC = aMC;
    }

    public String getISINPayout()
    {
        return ISINPayout;
    }

    public void setISINPayout(String iSINPayout)
    {
        ISINPayout = iSINPayout;
    }

    public String getISINReinvest()
    {
        return ISINReinvest;
    }

    public void setISINReinvest(String iSINReinvest)
    {
        ISINReinvest = iSINReinvest;
    }
    
    public void setScheme(Scheme scheme)
    {
        SchemeID = scheme.SchemeID;
        AMC = scheme.AMC;
        Name = scheme.Name;
        Type = scheme.Type;
        ISINPayout = scheme.ISINPayout;
        ISINReinvest = scheme.ISINReinvest;
    }
}
