package com.mindtree.planetapp.service.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.planetapp.entity.Planet;
import com.mindtree.planetapp.entity.Satellite;
import com.mindtree.planetapp.exception.service.ServiceException;
import com.mindtree.planetapp.repository.PlanetRepository;
import com.mindtree.planetapp.repository.SatelliteRepository;
import com.mindtree.planetapp.service.SatelliteService;

@Service
public class SatelliteServiceImplementation implements SatelliteService
{
	@Autowired
	private PlanetRepository planetRepository;
	
	@Autowired
	private SatelliteRepository satelliteRepository;

	@Override
	public Satellite addWSatellite(Satellite satellite, String planetname) throws ServiceException {
		
		Planet planet = planetRepository.findByName(planetname).orElse(null); 
		if (satelliteRepository.findByName(satellite.getName()).isPresent())
			throw new ServiceException("Satellite Is Already Present");
		satellite.setPlanet(planet);
		satelliteRepository.save(satellite);
		return satelliteRepository.findByName(satellite.getName()).get();
	}

	@Override
	public Satellite getSatellites() {
		
		return satelliteRepository.findByMaxRevolution();
	}
}
