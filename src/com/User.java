package com;

public class User
{
    //variable declarations
    protected String accName;
    protected String password;
    protected int idUser;
    protected String fullName;
    protected String userAddress;
    protected String userMail;
    protected int userType;
    //end of variable declarations

    //main constructor
public User(String accName,
            String password,
            int idUser,
            String fullName,
            String userAddress,
            String userMail,
            int userType)
{
    this.accName = accName;
    this.password = password;
    this.idUser = idUser;
    this.fullName = fullName;
    this.userAddress = userAddress;
    this.userType = userType;
    this.userMail=userMail;
}


//Getters and setters
    public int getUserType()
    {
        return userType;
    }

    public void setUserType(int userType)
    {
        this.userType = userType;
    }

    public String getUserMail()
    {
        return userMail;
    }

    public void setUserMail(String userMail)
    {
        this.userMail = userMail;
    }

    public String getUserAddress()
    {
        return userAddress;
    }

    public void setUserAddress(String userAddress)
    {
        this.userAddress = userAddress;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public int getIdUser()
    {
        return idUser;
    }

    public void setIdUser(int idUser)
    {
        this.idUser = idUser;
    }

    public String getAccName()
    {
        return accName;
    }

    public void setAccName(String accName)
    {
        this.accName = accName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
