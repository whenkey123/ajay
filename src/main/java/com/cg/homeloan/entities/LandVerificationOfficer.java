package com.cg.homeloan.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LandVerificationOfficer")
public class LandVerificationOfficer {

	@Id
	private int landOfficerId;
	private String officerName;
	private String officerContact;

	public LandVerificationOfficer() {
	}

	public LandVerificationOfficer(int userId, String officerName, String officerContact) {
		this.landOfficerId = userId;
		this.officerName = officerName;
		this.officerContact = officerContact;
	}

	public int getLandOfficerId() {
		return landOfficerId;
	}

	public void setLandOfficerId(int landOfficerId) {
		this.landOfficerId = landOfficerId;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getOfficerContact() {
		return officerContact;
	}

	public void setOfficerContact(String officerContact) {
		this.officerContact = officerContact;
	}

	@Override
	public String toString() {
		return "LandVerificationOfficer{" +
				"landOfficerId=" + landOfficerId +
				", officerName='" + officerName + '\'' +
				", officerContact='" + officerContact + '\'' +
				'}';
	}
}
