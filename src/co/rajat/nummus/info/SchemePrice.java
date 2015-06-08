package co.rajat.nummus.info;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Represents a scheme's prices for a given day.
 * 
 * @see Scheme
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 30-May-2015
 */
public class SchemePrice extends Scheme
{
    private BigDecimal NAV;

    private LocalDate  InfoDate;

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((InfoDate == null) ? 0 : InfoDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        SchemePrice other = (SchemePrice) obj;
        if (InfoDate == null)
        {
            if (other.InfoDate != null) return false;
        }
        else if (!InfoDate.equals(other.InfoDate)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("SchemePrice [");
        if (NAV != null) builder.append("NAV=").append(NAV).append(", ");
        if (InfoDate != null) builder.append("InfoDate=").append(InfoDate).append(", ");
        if (getName() != null) builder.append("getName()=").append(getName()).append(", ");
        if (getSchemeID() != null) builder.append("getSchemeID()=").append(getSchemeID()).append(", ");
        if (getType() != null) builder.append("getType()=").append(getType()).append(", ");
        if (getAMC() != null) builder.append("getAMC()=").append(getAMC()).append(", ");
        if (getISINPayout() != null) builder.append("getISINPayout()=").append(getISINPayout()).append(", ");
        if (getISINReinvest() != null) builder.append("getISINReinvest()=").append(getISINReinvest());
        builder.append("]");
        return builder.toString();
    }

    public BigDecimal getNAV()
    {
        return NAV;
    }

    public void setNAV(BigDecimal nAV)
    {
        NAV = nAV;
    }
    
    public LocalDate getInfoDate()
    {
        return InfoDate;
    }

    public void setInfoDate(LocalDate infoDate)
    {
        InfoDate = infoDate;
    }
}
