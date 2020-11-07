package com.cg.homeloan.service;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.repository.ILandVerificationRepository;

public interface ILandVerificationService {
		public void updateStatus(LoanApplication loanApplication);

		}


