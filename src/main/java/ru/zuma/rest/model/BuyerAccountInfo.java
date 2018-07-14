package ru.zuma.rest.model;

import java.io.Serializable;

public class BuyerAccountInfo /* implements Serializable*/ {
    private long id;
    private String name;
    private String sec_name;
    private String last_name;
    private String email;
    private String phone;
    private String address;
    private String metro;

    public BuyerAccountInfo(){
        this.id=12345;
        this.name="anton";
        this.sec_name="yuryevich";
        this.last_name="Mamontov";
        this.email="anton_mamont@bk.ru";
        this.phone="+79294522166";
        this.address="Госпитальный пер. д.4";
        this.metro="Бауманская";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSec_name() {
        return sec_name;
    }

    public void setSec_name(String sec_name) {
        this.sec_name = sec_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String third_name) {
        this.last_name = third_name;
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
                ", sec_name:\"" + sec_name + '\"' +
                ", last_name:\"" + last_name + '\"' +
                ", email:\"" + email + '\"' +
                ", phone:\"" + phone + '\"' +
                ", address:\"" + address + '\"' +
                ",metro:\"" + metro + '\"' + +
                '}';
    }

}
