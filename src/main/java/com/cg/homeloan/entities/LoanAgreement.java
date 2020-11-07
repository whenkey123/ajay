package com.cg.homeloan.entities;

import javax.persistence.*;

@Entity
@Table(name = "LoanAgreement")
public class LoanAgreement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanAgreementId;
	private long loanApplicationId;
	private long emiId;

	public LoanAgreement() {
	}

	public LoanAgreement(long loanApplicationId, long emiId) {
		this.loanApplicationId = loanApplicationId;
		this.emiId = emiId;
	}

	public LoanAgreement(long loanAgreementId, long loanApplicationId, long emiId) {
		this.loanAgreementId = loanAgreementId;
		this.loanApplicationId = loanApplicationId;
		this.emiId = emiId;
	}

	public long getLoanAgreementId() {
		return loanAgreementId;
	}

	public void setLoanAgreementId(long loanAgreementId) {
		this.loanAgreementId = loanAgreementId;
	}

	public long getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(long loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public long getEmiId() {
		return emiId;
	}

	public void setEmiId(long emiId) {
		this.emiId = emiId;
	}

	@Override
	public String toString() {
		return "LoanAgreement{" +
				"loanAgreementId=" + loanAgreementId +
				", loanApplicationId=" + loanApplicationId +
				", emiId=" + emiId +
				'}';
	}
}
