package com.smartApps.tracomSolutions.models;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Devices {

	@Id
	@SequenceGenerator(
			name = "client_sequence",
			sequenceName = "client_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.IDENTITY,
			generator = "client_sequence"
	)
	long id;
	String modelType;
	@Column(unique=true)
	String serialNumber;
	String country;
	String Branches;
	String modifiedBy;
	
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
	Timestamp dateModified;

	public Devices() {
		super();
	
		
		// TODO Auto-generated constructor stub
	}

	public Devices(long id, String modelType, String serialNumber, String country, String branches, String modifiedBy, Timestamp dateModified) {
		super();
		this.id = id;
		this.modelType = modelType;
		this.serialNumber = serialNumber;
		this.country = country;
		Branches = branches;
		this.modifiedBy = modifiedBy;
		this.dateModified = dateModified;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getDateModified() {
		return dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBranches() {
		return Branches;
	}

	public void setBranches(String branches) {
		Branches = branches;
	}
}
