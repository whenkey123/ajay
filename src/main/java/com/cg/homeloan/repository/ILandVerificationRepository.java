package com.cg.homeloan.repository;

import com.cg.homeloan.entities.LoanApplication;

public interface ILandVerificationRepository {

    public void updateStatus(LoanApplication loanApplication);

}


