package impl;

import com.cg.homeloan.entities.Admin;
import com.cg.homeloan.repository.IAdminRepository;

import javax.persistence.EntityManager;

public class AdminRepositoryImpl implements IAdminRepository {

    public EntityManager em;

    public AdminRepositoryImpl() {
        em= JPAUtil.getEntityManager();
    }

    @Override
    public Admin addAdmin(Admin admin) {
        if (admin==null)
            return null;
        em.persist(admin);
        return admin;
    }
}
