package com.localme.api.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_master")
public class GameDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	String name;
	String description;
	String url;
	String category;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public GameDetails(Long id, String name, String description, String url, String category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.url = url;
		this.category = category;
	}
	@Override
	public String toString() {
		return "GameDetails [id=" + id + ", name=" + name + ", description=" + description + ", url=" + url
				+ ", category=" + category + "]";
	}
	public GameDetails() {
		
	}
	
	
}
