package co.rajat.nummus.info;

import java.math.BigDecimal;
import java.util.List;

/**
 * Represents a user of Nummus.
 * 
 * @author Rajat Arora
 * @version 1.0
 * @since 5-June-2015
 *
 */
public class User
{
    private String UserID;
    
    private String FirstName;
    
    private String LastName;
    
    private String Email;
    
    private String Phone;
    
    private String AddressLine1;
    
    private String AddressLine2;
    
    private String City;
    
    private String State;
    
    private String PostalCode;
    
    private String Country;
    
    private List<Portfolio> Portfolios;
    
    private BigDecimal CurrentValue;

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((UserID == null) ? 0 : UserID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        User other = (User) obj;
        if (UserID == null)
        {
            if (other.UserID != null) return false;
        }
        else if (!UserID.equals(other.UserID)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("User [");
        if (UserID != null) builder.append("UserID=").append(UserID).append(", ");
        if (FirstName != null) builder.append("FirstName=").append(FirstName).append(", ");
        if (LastName != null) builder.append("LastName=").append(LastName).append(", ");
        if (Email != null) builder.append("Email=").append(Email).append(", ");
        if (Phone != null) builder.append("Phone=").append(Phone).append(", ");
        if (AddressLine1 != null) builder.append("AddressLine1=").append(AddressLine1).append(", ");
        if (AddressLine2 != null) builder.append("AddressLine2=").append(AddressLine2).append(", ");
        if (City != null) builder.append("City=").append(City).append(", ");
        if (State != null) builder.append("State=").append(State).append(", ");
        if (PostalCode != null) builder.append("PostalCode=").append(PostalCode).append(", ");
        if (Country != null) builder.append("Country=").append(Country).append(", ");
        if (Portfolios != null) builder.append("Portfolios=").append(Portfolios).append(", ");
        if (CurrentValue != null) builder.append("CurrentValue=").append(CurrentValue);
        builder.append("]");
        return builder.toString();
    }

    public String getUserID()
    {
        return UserID;
    }

    public void setUserID(String userID)
    {
        UserID = userID;
    }

    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String firstName)
    {
        FirstName = firstName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String lastName)
    {
        LastName = lastName;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public String getPhone()
    {
        return Phone;
    }

    public void setPhone(String phone)
    {
        Phone = phone;
    }

    public String getAddressLine1()
    {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1)
    {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2()
    {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2)
    {
        AddressLine2 = addressLine2;
    }

    public String getCity()
    {
        return City;
    }

    public void setCity(String city)
    {
        City = city;
    }

    public String getState()
    {
        return State;
    }

    public void setState(String state)
    {
        State = state;
    }

    public String getPostalCode()
    {
        return PostalCode;
    }

    public void setPostalCode(String postalCode)
    {
        PostalCode = postalCode;
    }

    public String getCountry()
    {
        return Country;
    }

    public void setCountry(String country)
    {
        Country = country;
    }

    public List<Portfolio> getPortfolios()
    {
        return Portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios)
    {
        Portfolios = portfolios;
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
