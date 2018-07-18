package ru.zuma.rest.model;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String third_name) {
        this.lastName = third_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

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
