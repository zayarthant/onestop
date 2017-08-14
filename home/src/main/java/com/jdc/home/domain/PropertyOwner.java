package com.jdc.home.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.jdc.home.repository.JpaEntity;

@Entity
@SuppressWarnings("serial")
public abstract class PropertyOwner implements Serializable, JpaEntity {

    public PropertyOwner() {
    }

    @Id
    private long id;

    private String name;

    private Security security;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

}