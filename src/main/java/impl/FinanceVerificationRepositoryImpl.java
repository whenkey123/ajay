package impl;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.repository.IFinanceVerificationRepository;

import javax.persistence.EntityManager;

public class FinanceVerificationRepositoryImpl implements IFinanceVerificationRepository {

    public EntityManager em;

    public FinanceVerificationRepositoryImpl() {
        em= JPAUtil.getEntityManager();
    }

    @Override
    public void updateStatus(LoanApplication loanApplication) {
        em.merge(loanApplication);
    }
}
