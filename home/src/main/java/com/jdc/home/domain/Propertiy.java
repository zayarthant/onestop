package com.jdc.home.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@SuppressWarnings("serial")
public class Propertiy implements Serializable {

	public Propertiy() {
	}

	@Id
	private long id;

	private PropertyType propType;

	private OperationType operation;

	private Set<String> otherCondition;

	private PropertyOwner owner;

	private Security security;

	private Address address;

	public enum PropertyType {
	}

	public enum OperationType {
		Sell, Rent
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PropertyType getPropType() {
		return propType;
	}

	public void setPropType(PropertyType propType) {
		this.propType = propType;
	}

	public OperationType getOperation() {
		return operation;
	}

	public void setOperation(OperationType operation) {
		this.operation = operation;
	}

	public Set<String> getOtherCondition() {
		return otherCondition;
	}

	public void setOtherCondition(Set<String> otherCondition) {
		this.otherCondition = otherCondition;
	}

	public PropertyOwner getOwner() {
		return owner;
	}

	public void setOwner(PropertyOwner owner) {
		this.owner = owner;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}