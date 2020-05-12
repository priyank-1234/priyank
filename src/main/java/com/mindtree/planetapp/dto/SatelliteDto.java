package com.mindtree.planetapp.dto;

public class SatelliteDto 
{

	private long id;
	private String name;
	private long noOfDaysRevolution;
	private long distanceFromTheSun;
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
	@Override
	public String toString() {
		return "SatelliteDto [id=" + id + ", name=" + name + ", noOfDaysRevolution=" + noOfDaysRevolution
				+ ", distanceFromTheSun=" + distanceFromTheSun + "]";
	}
	public SatelliteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SatelliteDto(long id, String name, long noOfDaysRevolution, long distanceFromTheSun) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDaysRevolution = noOfDaysRevolution;
		this.distanceFromTheSun = distanceFromTheSun;
	}
	public long getNoOfDaysRevolution() {
		return noOfDaysRevolution;
	}
	public void setNoOfDaysRevolution(long noOfDaysRevolution) {
		this.noOfDaysRevolution = noOfDaysRevolution;
	}
	public long getDistanceFromTheSun() {
		return distanceFromTheSun;
	}
	public void setDistanceFromTheSun(long distanceFromTheSun) {
		this.distanceFromTheSun = distanceFromTheSun;
	}
	
	
	
	
	

}
