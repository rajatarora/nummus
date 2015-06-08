package co.rajat.nummus.info;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Represents a transaction in a portfolio.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 5-June-2015
 *
 */
public class Transaction
{   
    private String TransactionID;
    
    private BigDecimal Units;
    
    private BigDecimal NAV;
    
    private LocalDate Date;
    
    private TransactionType Type;
    
    private Boolean Active;

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((TransactionID == null) ? 0 : TransactionID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Transaction other = (Transaction) obj;
        if (TransactionID == null)
        {
            if (other.TransactionID != null) return false;
        }
        else if (!TransactionID.equals(other.TransactionID)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Transaction [");
        if (TransactionID != null) builder.append("TransactionID=").append(TransactionID).append(", ");
        if (Units != null) builder.append("Units=").append(Units).append(", ");
        if (NAV != null) builder.append("NAV=").append(NAV).append(", ");
        if (Date != null) builder.append("Date=").append(Date).append(", ");
        if (Type != null) builder.append("Type=").append(Type).append(", ");
        if (Active != null) builder.append("Active=").append(Active);
        builder.append("]");
        return builder.toString();
    }

    public String getTransactionID()
    {
        return TransactionID;
    }

    public void setTransactionID(String transactionID)
    {
        TransactionID = transactionID;
    }

    public BigDecimal getUnits()
    {
        return Units;
    }

    public void setUnits(BigDecimal units)
    {
        Units = units;
    }

    public BigDecimal getNAV()
    {
        return NAV;
    }

    public void setNAV(BigDecimal nAV)
    {
        NAV = nAV;
    }

    public LocalDate getDate()
    {
        return Date;
    }

    public void setDate(LocalDate date)
    {
        Date = date;
    }

    public TransactionType getType()
    {
        return Type;
    }

    public void setType(TransactionType type)
    {
        Type = type;
    }

    public Boolean getActive()
    {
        return Active;
    }

    public void setActive(Boolean active)
    {
        Active = active;
    }
}
