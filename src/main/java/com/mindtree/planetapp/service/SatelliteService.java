package com.mindtree.planetapp.service;

import com.mindtree.planetapp.entity.Satellite;
import com.mindtree.planetapp.exception.service.ServiceException;

public interface SatelliteService 
{

	Satellite addWSatellite(Satellite satellite, String planetname) throws ServiceException;

	Satellite getSatellites();

	
	
	
	
}
