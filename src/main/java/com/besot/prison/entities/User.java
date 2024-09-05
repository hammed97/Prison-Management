package com.besot.prison.entities;
public abstract class User {

    private String name;
    private int age;
    private String gender;
    private Long phoneNo;
    private String address;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }


    public void setGender(Gender gender) { this.gender = gender.name();}

    public enum Gender {
        Male, Female
    }
    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNo=" + phoneNo +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
