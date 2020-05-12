package com.mindtree.planetapp.service;

import java.util.List;

import com.mindtree.planetapp.dto.PlanetDisplayDto;
import com.mindtree.planetapp.entity.Planet;
import com.mindtree.planetapp.exception.service.ServiceException;

public interface PlanetService 
{

	Planet addPlanet(Planet planet) throws ServiceException;

	List<Planet> displayAllPlanet() throws ServiceException;

	Planet displayPlanetById(long planetId);

	Planet deletePlanet(long planetId) throws ServiceException;

	List<Planet> getPlanet(); 
	
	
}
