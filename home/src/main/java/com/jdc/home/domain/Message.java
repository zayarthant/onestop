package com.jdc.home.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Message implements Serializable {

	public Message() {
	}

	@Id
	private long id;

	private LocalDateTime sendDate;

	private String title;

	private String body;

	private Propertiy property;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getSendDate() {
		return sendDate;
	}

	public void setSendDate(LocalDateTime sendDate) {
		this.sendDate = sendDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Propertiy getProperty() {
		return property;
	}

	public void setProperty(Propertiy property) {
		this.property = property;
	}

}