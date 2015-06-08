package co.rajat.nummus.info;

import java.math.BigDecimal;
import java.util.List;

/**
 * Represents all the transactions of a given scheme, for a single portfolio.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 5-June-2015
 * 
 */
public class SchemeTransaction extends Scheme
{
    private List<Transaction> Transactions;
    
    private BigDecimal TotalUnits;
    
    private BigDecimal PurchaseValue;
    
    private BigDecimal CurrentValue;

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((PurchaseValue == null) ? 0 : PurchaseValue.hashCode());
        result = prime * result + ((TotalUnits == null) ? 0 : TotalUnits.hashCode());
        result = prime * result + ((Transactions == null) ? 0 : Transactions.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        SchemeTransaction other = (SchemeTransaction) obj;
        if (PurchaseValue == null)
        {
            if (other.PurchaseValue != null) return false;
        }
        else if (!PurchaseValue.equals(other.PurchaseValue)) return false;
        if (TotalUnits == null)
        {
            if (other.TotalUnits != null) return false;
        }
        else if (!TotalUnits.equals(other.TotalUnits)) return false;
        if (Transactions == null)
        {
            if (other.Transactions != null) return false;
        }
        else if (!Transactions.equals(other.Transactions)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("SchemeTransaction [");
        if (Transactions != null) builder.append("Transactions=").append(Transactions).append(", ");
        if (TotalUnits != null) builder.append("TotalUnits=").append(TotalUnits).append(", ");
        if (PurchaseValue != null) builder.append("PurchaseValue=").append(PurchaseValue).append(", ");
        if (CurrentValue != null) builder.append("CurrentValue=").append(CurrentValue).append(", ");
        if (super.toString() != null) builder.append("toString()=").append(super.toString()).append(", ");
        if (getName() != null) builder.append("getName()=").append(getName()).append(", ");
        if (getSchemeID() != null) builder.append("getSchemeID()=").append(getSchemeID()).append(", ");
        if (getType() != null) builder.append("getType()=").append(getType()).append(", ");
        if (getAMC() != null) builder.append("getAMC()=").append(getAMC()).append(", ");
        if (getISINPayout() != null) builder.append("getISINPayout()=").append(getISINPayout()).append(", ");
        if (getISINReinvest() != null) builder.append("getISINReinvest()=").append(getISINReinvest());
        builder.append("]");
        return builder.toString();
    }

    public List<Transaction> getTransactions()
    {
        return Transactions;
    }

    public void setTransactions(List<Transaction> transactions)
    {
        Transactions = transactions;
    }

    public BigDecimal getTotalUnits()
    {
        return TotalUnits;
    }

    public void setTotalUnits(BigDecimal totalUnits)
    {
        TotalUnits = totalUnits;
    }

    public BigDecimal getPurchaseValue()
    {
        return PurchaseValue;
    }

    public void setPurchaseValue(BigDecimal purchaseValue)
    {
        PurchaseValue = purchaseValue;
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
