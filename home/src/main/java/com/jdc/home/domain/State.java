package com.jdc.home.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.jdc.home.repository.JpaEntity;

@SuppressWarnings("serial")
@Entity
public class State implements Serializable, JpaEntity {

    public State() {
    }

    @Id
    private int id;

    private String name;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}