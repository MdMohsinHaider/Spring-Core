package com.mohsin;

import java.util.Objects;

public class Nokia implements Mobile{

    private long id;
    private String name;
    private String email;

    public Nokia() {
        // no args constructor
        super();
    }

    public Nokia(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public void call() {
        System.out.println("Nokia Calling....");
    }

    @Override
    public void massage() {
        System.out.println("Nokia messaging....");
    }

    @Override
    public void mail() {
        System.out.println("Nokia Mailing to ,,,,");
    }

    @Override
    public void snapShot() {
        System.out.println("Nokia snapShot....");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Nokia{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nokia nokia = (Nokia) o;
        return id == nokia.id && Objects.equals(name, nokia.name) && Objects.equals(email, nokia.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
