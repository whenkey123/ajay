package com.cg.homeloan.service;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.repository.IFinanceVerificationRepository;

public interface IFinanceVerificationService  {
public void updateStatus(LoanApplication loanApplication) ;

}
