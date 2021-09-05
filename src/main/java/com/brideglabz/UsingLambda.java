package com.brideglabz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class UserRegistartion {

    static String firstname;
    static String lastname;
    static int mobileno;
    static String password;
    static String email_id;

    public UserRegistartion(int mobileno,String firstname,String lastname,String password){
        super ();
        this.firstname=firstname;
        this.lastname=lastname;
        this.mobileno=mobileno;
        this.email_id=email_id;
        this.password=password;
    }

    public class lambdaexpression{
        public static void main (String[] args) {
            List<UserRegistartion> list = new ArrayList<UserRegistartion>();

            //Adding User Registartion form:
            list.add(new firstname("Gauri"));
            list.add(new lastname("Parhad"));
            list.add(new mobileno("9584621597"));
            list.add(new email_id("gaurip@gmail.com"));
            list.add(new password("GAurya10$"));

            list.forEach(
                    (n)- > System.out.println(n)
            );
        }
    }

}
