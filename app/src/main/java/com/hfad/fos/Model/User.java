package com.hfad.fos.Model;

/**
 * Created by icefrog on 12/3/17.
 */

public class User {

    private String Name;
    private String Password;
    private String Phone;
    private String IsStaff1;
    private String secureCode;




    public User() {

    }

    public User(String name, String password,String secureCode) {
        Name = name;
        Password = password;
        IsStaff1 = "false";
        this.secureCode = secureCode;

    }

    public String getSecureCode() {
        return secureCode;
    }

    public void setSecureCode(String secureCode) {
        this.secureCode = secureCode;
    }

    public String getIsStaff() {
        return IsStaff1;
    }

    public void setIsStaff(String IsStaff) {
        IsStaff1 = IsStaff;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
