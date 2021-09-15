package com.capgemini.mentoria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TB_SETTING")
public class Setting {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "STATUS", nullable = false)
	private Boolean status;

	@Column(name = "CRIATED_IN")
	private Date criatedIn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getCriatedIn() {
		return criatedIn;
	}

	public void setCriatedIn(Date criatedIn) {
		this.criatedIn = criatedIn;
	}

}