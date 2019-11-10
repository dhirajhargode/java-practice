package com.sarang.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Composite implements Serializable {
	
	@Column(length=10)
	private int proj_id;
	@Column(length=10)
	private int prgm_id;

	public int getProj_id() {
		return proj_id;
	}

	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	public int getPrgm_id() {
		return prgm_id;
	}

	public void setPrgm_id(int prgm_id) {
		this.prgm_id = prgm_id;
	}

	@Override
	public String toString() {
		return "Composite [proj_id=" + proj_id + ", prgm_id=" + prgm_id + "]";
	}

}
