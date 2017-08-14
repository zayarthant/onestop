package com.jdc.home.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class Township implements Serializable {

	public Township() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;

	private String name;

	@ManyToOne
	private State state;

	public int getId() {
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}