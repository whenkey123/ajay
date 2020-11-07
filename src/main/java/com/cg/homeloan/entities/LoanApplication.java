package com.cg.homeloan.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "LoanApplication")
public class LoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationId;
	private LocalDate applicationDate;
	private int customerId;
	private double loanAppliedAmount;
	private double loanApprovedAmount;
	private boolean landVerificationApproval;
	private boolean financeVerificationApproval;
	private boolean adminApproval;
	@Enumerated(EnumType.STRING)
	private Status status;

	public LoanApplication() {
	}

	public LoanApplication(LocalDate applicationDate, int customerId, double loanAppliedAmount, double loanApprovedAmount, boolean landVerificationApproval, boolean financeVerificationApproval, boolean adminApproval, Status status) {
		this.applicationDate = applicationDate;
		this.customerId = customerId;
		this.loanAppliedAmount = loanAppliedAmount;
		this.loanApprovedAmount = loanApprovedAmount;
		this.landVerificationApproval = landVerificationApproval;
		this.financeVerificationApproval = financeVerificationApproval;
		this.adminApproval = adminApproval;
		this.status = status;
	}

	public LoanApplication(long applicationId, LocalDate applicationDate, int customerId, double loanAppliedAmount, double loanApprovedAmount, boolean landVerificationApproval, boolean financeVerificationApproval, boolean adminApproval, Status status) {
		this.applicationId = applicationId;
		this.applicationDate = applicationDate;
		this.customerId = customerId;
		this.loanAppliedAmount = loanAppliedAmount;
		this.loanApprovedAmount = loanApprovedAmount;
		this.landVerificationApproval = landVerificationApproval;
		this.financeVerificationApproval = financeVerificationApproval;
		this.adminApproval = adminApproval;
		this.status = status;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getLoanAppliedAmount() {
		return loanAppliedAmount;
	}

	public void setLoanAppliedAmount(double loanAppliedAmount) {
		this.loanAppliedAmount = loanAppliedAmount;
	}

	public double getLoanApprovedAmount() {
		return loanApprovedAmount;
	}

	public void setLoanApprovedAmount(double loanApprovedAmount) {
		this.loanApprovedAmount = loanApprovedAmount;
	}

	public boolean isLandVerificationApproval() {
		return landVerificationApproval;
	}

	public void setLandVerificationApproval(boolean landVerificationApproval) {
		this.landVerificationApproval = landVerificationApproval;
	}

	public boolean isFinanceVerificationApproval() {
		return financeVerificationApproval;
	}

	public void setFinanceVerificationApproval(boolean financeVerificationApproval) {
		this.financeVerificationApproval = financeVerificationApproval;
	}

	public boolean isAdminApproval() {
		return adminApproval;
	}

	public void setAdminApproval(boolean adminApproval) {
		this.adminApproval = adminApproval;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanApplication{" +
				"applicationId=" + applicationId +
				", applicationDate=" + applicationDate +
				", customerId=" + customerId +
				", loanAppliedAmount=" + loanAppliedAmount +
				", loanApprovedAmount=" + loanApprovedAmount +
				", landVerificationApproval=" + landVerificationApproval +
				", financeVerificationApproval=" + financeVerificationApproval +
				", adminApproval=" + adminApproval +
				", status=" + status +
				'}';
	}
}
