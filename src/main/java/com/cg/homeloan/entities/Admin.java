package com.cg.homeloan.entities;

import com.cg.homeloan.repository.IAdminRepository;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    private int adminId;
    private String adminName;
    private String adminContact;

    public Admin() {

    }

    public Admin(String adminName, String adminContact) {
        this.adminName = adminName;
        this.adminContact = adminContact;
    }

    public Admin(int adminId, String adminName, String adminContact) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminContact = adminContact;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(String adminContact) {
        this.adminContact = adminContact;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminContact='" + adminContact + '\'' +
                '}';
    }
}
