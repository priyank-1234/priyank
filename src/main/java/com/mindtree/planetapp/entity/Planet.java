package com.mindtree.planetapp.entity;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Planet 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;	
private int noOfDaysRevolution;
private long distanceFromtheSun;
@OneToMany(mappedBy ="planet", cascade = CascadeType.ALL)
private List<Satellite> satellites;
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
public int getNoOfDaysRevolution() {
	return noOfDaysRevolution;
}
@Override
public String toString() {
	return "Planet [id=" + id + ", name=" + name + ", noOfDaysRevolution=" + noOfDaysRevolution
			+ ", distanceFromtheSun=" + distanceFromtheSun + ", satellites=" + satellites + "]";
}
public void setNoOfDaysRevolution(int noOfDaysRevolution) {
	this.noOfDaysRevolution = noOfDaysRevolution;
}
public Planet(long id, String name, int noOfDaysRevolution, long distanceFromtheSun, List<Satellite> satellites) {
	super();
	this.id = id;
	this.name = name;
	this.noOfDaysRevolution = noOfDaysRevolution;
	this.distanceFromtheSun = distanceFromtheSun;
	this.satellites = satellites;
}
public Planet() {
	super();
	// TODO Auto-generated constructor stub
}
public long getDistanceFromtheSun() {
	return distanceFromtheSun;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (distanceFromtheSun ^ (distanceFromtheSun >>> 32));
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + noOfDaysRevolution;
	result = prime * result + ((satellites == null) ? 0 : satellites.hashCode());
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
	Planet other = (Planet) obj;
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
	if (satellites == null) {
		if (other.satellites != null)
			return false;
	} else if (!satellites.equals(other.satellites))
		return false;
	return true;
}
public void setDistanceFromtheSun(long distanceFromtheSun) {
	this.distanceFromtheSun = distanceFromtheSun;
}
public List<Satellite> getSatellites() {
	return satellites;
}
public void setSatellites(List<Satellite> satellites) {
	this.satellites = satellites;
}

	
}
