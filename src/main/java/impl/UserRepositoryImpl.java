package impl;

import com.cg.homeloan.entities.User;
import com.cg.homeloan.repository.IUserRepository;

import javax.persistence.EntityManager;

public class UserRepositoryImpl implements IUserRepository {

    public EntityManager em;

    public UserRepositoryImpl() {
        em=JPAUtil.getEntityManager();
    }

    @Override
    public User addNewUser(User user) {
        if(user==null)
            return null;
        em.persist(user);
        return user;
    }

    @Override
    public User signIn(User user) {
        return null;
    }

    @Override
    public User signOut(User user) {
        return null;
    }
}
