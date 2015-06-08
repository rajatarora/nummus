package co.rajat.nummus.info;

import java.math.BigDecimal;
import java.util.List;

/**
 * Represents a portfolio.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 5-June-2015
 *
 */
public class Portfolio
{
    private String Name;
    
    private String PortfolioID;
    
    private List<SchemeTransaction> SchemeTransactions;
    
    private BigDecimal CurrentValue;

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((PortfolioID == null) ? 0 : PortfolioID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Portfolio other = (Portfolio) obj;
        if (PortfolioID == null)
        {
            if (other.PortfolioID != null) return false;
        }
        else if (!PortfolioID.equals(other.PortfolioID)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Portfolio [");
        if (Name != null) builder.append("Name=").append(Name).append(", ");
        if (PortfolioID != null) builder.append("ID=").append(PortfolioID).append(", ");
        if (SchemeTransactions != null) builder.append("SchemeTransactions=").append(SchemeTransactions).append(", ");
        if (CurrentValue != null) builder.append("CurrentValue=").append(CurrentValue);
        builder.append("]");
        return builder.toString();
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getPortfolioID()
    {
        return PortfolioID;
    }

    public void setPortfolioID(String portfolioID)
    {
        PortfolioID = portfolioID;
    }

    public List<SchemeTransaction> getSchemeTransactions()
    {
        return SchemeTransactions;
    }

    public void setSchemeTransactions(List<SchemeTransaction> schemeTransactions)
    {
        SchemeTransactions = schemeTransactions;
    }

    public BigDecimal getCurrentValue()
    {
        return CurrentValue;
    }

    public void setCurrentValue(BigDecimal currentValue)
    {
        CurrentValue = currentValue;
    }
}
