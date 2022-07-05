package com.cruddapplication.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "fisher")
public class Fisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "pass_word")
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "fisher_type")
    private String fisherType;
    @Column(name = "add_ress")
    private String address;

    public Fisher(){

    }

    public Fisher(String firstName, String lastName, String emailId, String userName, String password, String phoneNumber, String fisherType, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.fisherType = fisherType;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFisherType() {
        return fisherType;
    }

    public void setFisherType(String fisherType) {
        this.fisherType = fisherType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}