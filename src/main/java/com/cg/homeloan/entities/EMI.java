package com.cg.homeloan.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "emi")
public class EMI {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long EMIId;
	private LocalDate dueDate;
	private double emiAmount;
	private double loanAmount;
	private double interestAmount;
	private long loanAgreementId;

	public EMI() {
	}

	public EMI(LocalDate dueDate, double emiAmount, double loanAmount, double interestAmount, long loanAgreementId) {
		this.dueDate = dueDate;
		this.emiAmount = emiAmount;
		this.loanAmount = loanAmount;
		this.interestAmount = interestAmount;
		this.loanAgreementId = loanAgreementId;
	}

	public EMI(long EMIId, LocalDate dueDate, double emiAmount, double loanAmount, double interestAmount, long loanAgreementId) {
		this.EMIId = EMIId;
		this.dueDate = dueDate;
		this.emiAmount = emiAmount;
		this.loanAmount = loanAmount;
		this.interestAmount = interestAmount;
		this.loanAgreementId = loanAgreementId;
	}

	public long getEMIId() {
		return EMIId;
	}

	public void setEMIId(long EMIId) {
		this.EMIId = EMIId;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public long getLoanAgreementId() {
		return loanAgreementId;
	}

	public void setLoanAgreementId(long loanAgreementId) {
		this.loanAgreementId = loanAgreementId;
	}

	@Override
	public String toString() {
		return "EMI{" +
				"EMIId=" + EMIId +
				", dueDate=" + dueDate +
				", emiAmount=" + emiAmount +
				", loanAmount=" + loanAmount +
				", interestAmount=" + interestAmount +
				", loanAgreementId=" + loanAgreementId +
				'}';
	}
}
