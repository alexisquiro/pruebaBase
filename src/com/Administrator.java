package com;

import java.util.ArrayList;

public class Administrator extends User
{
    //variable declarations
    protected ArrayList<Administrator> administrators = new ArrayList<>();
    //end of variable declarations

    //main constructor
    public Administrator(String accName,
                 String password,
                 int idUser,
                 String fullName,
                 String userAddress,
                 String userMail,
                 int userType)
    {
        super(accName, password, idUser, fullName, userAddress, userMail, userType);
        this.accName = accName;
        this.password = password;
        this.idUser = idUser;
        this.fullName = fullName;
        this.userAddress = userAddress;
        this.userMail = userMail;
        this.userType = userType;
    }

}
