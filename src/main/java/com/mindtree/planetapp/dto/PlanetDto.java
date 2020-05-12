package com.mindtree.planetapp.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class PlanetDto 
{

	private long id;
	@NotNull(message = "name can't be null:")
	private String name;	
	private int noOfDaysRevolution;
	private long distanceFromtheSun;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public PlanetDto(long id, String name, int noOfDaysRevolution, long distanceFromtheSun) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDaysRevolution = noOfDaysRevolution;
		this.distanceFromtheSun = distanceFromtheSun;
	}
	public PlanetDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDaysRevolution() {
		return noOfDaysRevolution;
	}
	@Override
	public String toString() {
		return "PlanetDto [id=" + id + ", name=" + name + ", noOfDaysRevolution=" + noOfDaysRevolution
				+ ", distanceFromtheSun=" + distanceFromtheSun + ", satelliteDto=" + "]";
	}
	public void setNoOfDaysRevolution(int noOfDaysRevolution) {
		this.noOfDaysRevolution = noOfDaysRevolution;
	}
	public long getDistanceFromtheSun() {
		return distanceFromtheSun;
	}
	public void setDistanceFromtheSun(long distanceFromtheSun) {
		this.distanceFromtheSun = distanceFromtheSun;
	}
	
	
	
}
