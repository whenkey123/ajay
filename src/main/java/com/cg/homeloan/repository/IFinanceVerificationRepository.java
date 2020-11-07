package com.cg.homeloan.repository;

import com.cg.homeloan.entities.LoanApplication;

public interface IFinanceVerificationRepository {
    public void updateStatus(LoanApplication loanApplication);

}
