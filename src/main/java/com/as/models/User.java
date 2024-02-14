package com.as.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String gender;
	private List<Integer> followings=new ArrayList<>();
	private List<Integer> followers=new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany
	private List<Post> savedPost=new ArrayList<>();
	
	
	
	public User() {
		
	}

	

	public User(Integer id, String firstName, String lastName, String email, String password, String gender,
			List<Integer> followings, List<Integer> followers) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.followings = followings;
		this.followers = followers;
	}

	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}
	


	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public List<Integer> getFollowings() {
		return followings;
	}



	public void setFollowings(List<Integer> followings) {
		this.followings = followings;
	}



	public List<Integer> getFollowers() {
		return followers;
	}



	public void setFollowers(List<Integer> followers) {
		this.followers = followers;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public List<Post> getSavedPost() {
		return savedPost;
	}



	public void setSavedPost(List<Post> savedPost) {
		this.savedPost = savedPost;
	}

	

	

}