package com.cg.homeloan.repository;

import com.cg.homeloan.entities.Admin;
import impl.JPAUtil;

import javax.persistence.EntityManager;

public interface IAdminRepository {
    public Admin addAdmin(Admin admin);
}
