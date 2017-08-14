package com.jdc.home.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.ManyToOne;

import com.jdc.home.repository.JpaEntity;

@Entity
@SuppressWarnings("serial")
public class Address implements Serializable, JpaEntity {

	public Address() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long id;

	private String address;

	@ManyToOne
	private Township township;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Township getTownship() {
		return township;
	}

	public void setTownship(Township township) {
		this.township = township;
	}

}