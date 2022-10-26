package com.cherisheddream.firebaseinsandouts;

public class MainModel {
    String name,email,course,surl;

    MainModel(){

    }

    public MainModel(String name, String email, String course, String surl) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.surl = surl;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl;
    }
}
