package com.jgarcia.biblio;

public class User {

    private Integer dni;
    private String name;
    private String surname;
    private String phonenumber;
    private String address;
    private String location;

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setAddres(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}

