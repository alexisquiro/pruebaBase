package com;

import java.util.ArrayList;

public class Staff extends User
{
    //variable declarations
    protected ArrayList<Staff> staffs = new ArrayList<>();
    //end of variable declarations

    //main constructor
    public Staff(String accName,
                 String password,
                 int idUser,
                 String fullName,
                 String userAddress,
                 String userMail,
                 int userType)
    {
        super(accName, password, idUser, fullName, userAddress, userMail, userType);
    }

}
