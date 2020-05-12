package com.mindtree.planetapp.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Satellite 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private long id;
private String name;
private long noOfDaysRevolution;
private long distanceFromTheSun;

@ManyToOne
@JsonIgnore
private Planet planet;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getNoOfDaysRevolution() {
	return noOfDaysRevolution;
}

public void setNoOfDaysRevolution(long noOfDaysRevolution) {
	this.noOfDaysRevolution = noOfDaysRevolution;
}

public Satellite() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Satellite [id=" + id + ", name=" + name + ", noOfDaysRevolution=" + noOfDaysRevolution
			+ ", distanceFromTheSun=" + distanceFromTheSun + ", planet=" + planet + "]";
}

public Satellite(long id, String name, long noOfDaysRevolution, long distanceFromTheSun, Planet planet) {
	super();
	this.id = id;
	this.name = name;
	this.noOfDaysRevolution = noOfDaysRevolution;
	this.distanceFromTheSun = distanceFromTheSun;
	this.planet = planet;
}

public long getDistanceFromTheSun() {
	return distanceFromTheSun;
}

public void setDistanceFromTheSun(long distanceFromTheSun) {
	this.distanceFromTheSun = distanceFromTheSun;
}

public Planet getPlanet() {
	return planet;
}

public void setPlanet(Planet planet) {
	this.planet = planet;
}


}