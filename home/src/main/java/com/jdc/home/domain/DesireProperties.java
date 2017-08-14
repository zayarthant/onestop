package com.jdc.home.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.jdc.home.domain.Propertiy.OperationType;
import com.jdc.home.domain.Propertiy.PropertyType;
import com.jdc.home.repository.JpaEntity;

@Entity
@SuppressWarnings("serial")
public class DesireProperties implements Serializable, JpaEntity {

    public DesireProperties() {
    }

    @Id
    private long id;

    private PropertyType propType;

    private OperationType operation;

    private Area area;

    private String title;

    private LocalDate targetDate;

    private String minPrice;

    private String maxPrice;

    private Member member;

    private Address address;

    private Security security;

    public enum Area {
    }

	public Long getId() {
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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

}