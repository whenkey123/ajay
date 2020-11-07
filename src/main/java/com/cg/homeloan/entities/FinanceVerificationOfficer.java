package com.cg.homeloan.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FinanceVerificationOfficer")
public class FinanceVerificationOfficer {

	@Id
	private int financeOfferId;
	private String finOfficerName;
	private String finOfficerContact;

	public FinanceVerificationOfficer() {
	}

	public FinanceVerificationOfficer(int userId, String finOfficerName, String finOfficerContact) {
		this.financeOfferId = userId;
		this.finOfficerName = finOfficerName;
		this.finOfficerContact = finOfficerContact;
	}

	public int getFinanceOfferId() {
		return financeOfferId;
	}

	public void setFinanceOfferId(int financeOfferId) {
		this.financeOfferId = financeOfferId;
	}

	public String getFinOfficerName() {
		return finOfficerName;
	}

	public void setFinOfficerName(String finOfficerName) {
		this.finOfficerName = finOfficerName;
	}

	public String getFinOfficerContact() {
		return finOfficerContact;
	}

	public void setFinOfficerContact(String finOfficerContact) {
		this.finOfficerContact = finOfficerContact;
	}

	@Override
	public String toString() {
		return "FinanceVerificationOfficer{" +
				"financeOfferId=" + financeOfferId +
				", finOfficerName='" + finOfficerName + '\'' +
				", finOfficerContact='" + finOfficerContact + '\'' +
				'}';
	}
}
