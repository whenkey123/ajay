package impl;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.repository.ILandVerificationRepository;

import javax.persistence.EntityManager;

public class LandVerificationRepositoryImpl implements ILandVerificationRepository {

    public EntityManager em;

    public LandVerificationRepositoryImpl() {
        em= JPAUtil.getEntityManager();
    }

    @Override
    public void updateStatus(LoanApplication loanApplication) {
        em.merge(loanApplication);
    }
}


