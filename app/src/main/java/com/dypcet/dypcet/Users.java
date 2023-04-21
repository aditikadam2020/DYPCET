package com.dypcet.dypcet;

public class Users {
    String name,email,phonenumber,state,city,password,group,usertype;

    public Users() {

    }

    public Users(String name, String email, String phonenumber, String state, String city, String password, String group, String usertype) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.state = state;
        this.city = city;
        this.group = group;
        this.password = password;
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", group='" + group + '\'' +
                ", usertype='" + usertype + '\'' +
                '}';
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
