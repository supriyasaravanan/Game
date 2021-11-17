package com.localme.api.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_master")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	String uid;
	String pwd;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public UserDetails(Long id, String uid, String pwd) {
		super();
		this.id = id;
		this.uid = uid;
		this.pwd = pwd;
	}
	
	public UserDetails() {
		
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", uid=" + uid + ", pwd=" + pwd + "]";
	}
	
	
}
