package com.jdc.home.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.jdc.home.repository.JpaEntity;

@Entity
@SuppressWarnings("serial")
public class AgencyMember implements Serializable, JpaEntity {

    public AgencyMember() {
    }

    @Id
    private long id;

    private boolean owner;

    private Agency agency;

    private Member member;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isOwner() {
		return owner;
	}

	public void setOwner(boolean owner) {
		this.owner = owner;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}