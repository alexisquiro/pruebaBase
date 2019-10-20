package com;

import java.util.ArrayList;

public class Client extends User
{
    //variable declarations
    protected ArrayList<Client> clients = new ArrayList<>();
    //end of variable declarations

    //main constructor
    public Client(String accName,
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
