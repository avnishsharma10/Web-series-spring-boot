package com.webseries.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="webseries")
public class Webseries {
	
	@Id
	@Column(name="id")
	private String id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="seasons")
	private String seasons;
	
	@Column(name="episodes")
	private String episodes;
	
	@Column(name="rating")
	private String rating;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeasons() {
		return seasons;
	}

	public void setSeasons(String seasons) {
		this.seasons = seasons;
	}

	public String getEpisodes() {
		return episodes;
	}

	public void setEpisodes(String episodes) {
		this.episodes = episodes;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Webseries(String id, String name, String seasons, String episodes, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.seasons = seasons;
		this.episodes = episodes;
		this.rating = rating;
	}

	public Webseries() {
		super();
	}

	

}
