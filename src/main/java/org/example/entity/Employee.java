package org.example.entity;

import org.example.embed.FullAddress;
import org.example.embed.FullName;

public class Employee {
    private int id;
    private FullName name;
    private FullAddress address;
    private String tel;

    public Employee() {
    }

    public Employee(int id, FullName name, FullAddress address, String tel) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public FullAddress getAddress() {
        return address;
    }

    public void setAddress(FullAddress address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
