package com.mindtree.planetapp.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.mindtree.planetapp.entity.Satellite;

public class PlanetDisplayDto 
{

	private long id;
	private String name;	
	private int noOfDaysRevolution;
	private long distanceFromtheSun;
	private List<Satellite> satellite;
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
	public PlanetDisplayDto(long id, String name, int noOfDaysRevolution, long distanceFromtheSun,
			List<Satellite> satellite) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDaysRevolution = noOfDaysRevolution;
		this.distanceFromtheSun = distanceFromtheSun;
		this.satellite = satellite;
	}
	public PlanetDisplayDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNoOfDaysRevolution() {
		return noOfDaysRevolution;
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
	public List<Satellite> getSatellite() {
		return satellite;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (distanceFromtheSun ^ (distanceFromtheSun >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDaysRevolution;
		result = prime * result + ((satellite == null) ? 0 : satellite.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanetDisplayDto other = (PlanetDisplayDto) obj;
		if (distanceFromtheSun != other.distanceFromtheSun)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDaysRevolution != other.noOfDaysRevolution)
			return false;
		if (satellite == null) {
			if (other.satellite != null)
				return false;
		} else if (!satellite.equals(other.satellite))
			return false;
		return true;
	}
	public void setSatellite(List<Satellite> satellite) {
		this.satellite = satellite;
	}
	
	
}
