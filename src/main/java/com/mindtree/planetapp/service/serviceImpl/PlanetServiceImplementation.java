package com.mindtree.planetapp.service.serviceImpl;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.mindtree.planetapp.dto.PlanetDisplayDto;
import com.mindtree.planetapp.dto.SatelliteDto;
import com.mindtree.planetapp.entity.Planet;
import com.mindtree.planetapp.entity.Satellite;
import com.mindtree.planetapp.exception.service.ServiceException;
import com.mindtree.planetapp.repository.PlanetRepository;
import com.mindtree.planetapp.repository.SatelliteRepository;
import com.mindtree.planetapp.service.PlanetService;
@Service
public class PlanetServiceImplementation implements PlanetService
{
@Autowired
PlanetRepository planetRepository;

@Autowired
SatelliteRepository satelliteRepository;
	
@Autowired
private ModelMapper model;

@Override
	public Planet addPlanet(Planet planet) throws ServiceException {
			if (planetRepository.findByName(planet.getName()).isPresent())
				throw new ServiceException("planet Is Already Present");
			planet.setSatellites(null);
			planetRepository.save(planet);
			return planetRepository.findByName(planet.getName()).get();
		}

	@Override
	public List<Planet> displayAllPlanet() throws ServiceException {
		if (planetRepository.findAll().isEmpty()) {
			throw new ServiceException("There Is No Planet To Display");
		}
		return planetRepository.findAll();
	}

	@Override
	public Planet displayPlanetById(long planetId) 
	{
	Planet planet=planetRepository.findById(planetId).orElse(null);
	List<Satellite>sate=new ArrayList<Satellite>(); 
	List<Satellite>satellite=satelliteRepository.findAll();
	for(Satellite s: satellite)
	{
		if(s.getPlanet().getId() == planetId)
		{
			sate.add(s);
//			System.out.println(sate.toString());
		}
	}
		planet.setSatellites(sate);
		planetRepository.save(planet);
//	planetDisplayDto.setDistanceFromtheSun(planet.getDistanceFromtheSun());
//	planetDisplayDto.setId(planet.getId());
//	planetDisplayDto.setName(planet.getName());
//	planetDisplayDto.setNoOfDaysRevolution(planet.getNoOfDaysRevolution());
//	planetDisplayDto.setSatelliteDto(sate);
//	
		return planet;
	}

	@Override
	public Planet deletePlanet(long planetId) throws ServiceException 
	{
		
		Planet planet = planetRepository.findById(planetId)
				.orElseThrow(() -> new ServiceException("Planet Not Found"));
		planetRepository.delete(planet);
		return planet;
	}

	@Override
	public List<Planet> getPlanet() {
		return planetRepository.FindBySatelliteId();
	}

	}

	
	