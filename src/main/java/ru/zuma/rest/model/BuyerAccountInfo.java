package ru.zuma.rest.model;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.io.Serializable;


public class BuyerAccountInfo /* implements Serializable*/ {
    private long id;
    private String name;
    private String secName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String metro;

    public BuyerAccountInfo(long id,String name,String secName,String lastName,String email,String phone,
                            String address, String metro){
        this.id = 12345;
        this.name = name;
        this.secName = secName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.metro = metro;
    }
    @JsonGetter(value = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter(value = "SecName")
    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }
    @JsonGetter(value = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @JsonGetter(value = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonGetter(value = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @JsonGetter(value = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @JsonGetter(value = "Metro")
    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }
    @JsonGetter(value = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "BuyerAccountInfo{" +
                "id:\"" + id + '\"' +
                ",name:\"" + name + '\"' +
                ", secName:\"" + secName + '\"' +
                ", lastName:\"" + lastName + '\"' +
                ", email:\"" + email + '\"' +
                ", phone:\"" + phone + '\"' +
                ", address:\"" + address + '\"' +
                ",metro:\"" + metro + '\"' + +
                '}';
    }

}
