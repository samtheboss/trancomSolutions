package com.smartApps.tracomSolutions.models;

import javax.persistence.*;

@Entity
@Table
public class Devices {
	@Id
	@SequenceGenerator(
			name = "item_sequence",
			sequenceName = "item_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "item_sequence"
	)

	long id;
	String device_model;
	String country;
	@Column(unique=true)
	String serialNumber;
	String branch;
	String device_name;

	public Devices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devices( String device_model, String country, String serialNumber, String branch, String device_name) {
		super();
		this.id = -1;
		this.device_model = device_model;
		this.country = country;
		this.serialNumber = serialNumber;
		this.branch = branch;
		this.device_name = device_name;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDevice_name() {
		return device_name;
	}

	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDevice_model() {
		return device_model;
	}

	public void setDevice_model(String device_model) {
		this.device_model = device_model;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
