package za.ac.cput.Factory;
/*
        @Author : Tashreeq Williams
        -> UserAccountFactory
        Date: 4/6/2021

*/

import za.ac.cput.Entity.UserAccount;
import za.ac.cput.Factory.UserAccountFactory;


public class UserAccountFactory {
    public static UserAccount buildUserAccount(String userId,
                                               String email,
                                               String password,
                                               boolean LoginStatus,
                                               String registerDate)
    {

        return new UserAccount.Builder()


                .setuserId(userId)
                .setemail(email)
                .setpassword(password)
                .setloginStatus(LoginStatus)
                .setregisterDate(registerDate)
                .build();


    }
}