package com.mindtree.planetapp.controller;
import java.util.List;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mindtree.planetapp.dto.PlanetDto;
import com.mindtree.planetapp.dto.ResponseBody;
import com.mindtree.planetapp.dto.SatelliteDto;
import com.mindtree.planetapp.entity.Planet;
import com.mindtree.planetapp.entity.Satellite;
import com.mindtree.planetapp.exception.AppException;
import com.mindtree.planetapp.service.PlanetService;
import com.mindtree.planetapp.service.SatelliteService;
@RestController
@CrossOrigin
public class PlanetAppController
{
	@Autowired
	private PlanetService planetService;
	
	@Autowired
	private SatelliteService satelliteService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/planet")
	public ResponseEntity<?> addPlanet(@Valid @RequestBody PlanetDto planet) throws AppException {
		return new ResponseEntity<ResponseBody<PlanetDto>>(new ResponseBody<PlanetDto>(
				modelMapper.map(planetService.addPlanet(modelMapper.map(planet, Planet.class)), PlanetDto.class), null,
				"Planet Added Successfully", true), HttpStatus.OK);
	}
	
	@PostMapping("/satellite/{planetname}")
	public ResponseEntity<?> addSatellite(@PathVariable String planetname, @Valid @RequestBody SatelliteDto satellite)
			throws AppException {

		return new ResponseEntity<ResponseBody<SatelliteDto>>(new ResponseBody<SatelliteDto>(
				modelMapper.map(satelliteService.addWSatellite(modelMapper.map(satellite, Satellite.class), planetname), SatelliteDto.class),
				null, "Satellite Added Successfully", true), HttpStatus.OK);
	}

	@GetMapping("/planet")
	public ResponseEntity<?> displayAllPlanet() throws AppException {
		return new ResponseEntity<ResponseBody<List<PlanetDto>>>(new ResponseBody<List<PlanetDto>>(
				modelMapper.map(planetService.displayAllPlanet(), new TypeToken<List<PlanetDto>>() {
				}.getType()), null, "Planet List Found", true), HttpStatus.OK);
	}
	@GetMapping("/planet/{planetId}")
	public ResponseEntity<?> displayPlanetById(@PathVariable long planetId) throws AppException {
		return new ResponseEntity<ResponseBody<Planet>>(new ResponseBody<Planet>(planetService.displayPlanetById(planetId), null, "Planet Found", true), HttpStatus.OK);
	}
	@DeleteMapping("/planetdelete/{planetId}")
	public ResponseEntity<?> deletePlanet(@PathVariable long planetId) throws AppException {
		return new ResponseEntity<ResponseBody<Planet>>(
				new ResponseBody<Planet>(planetService.deletePlanet(planetId), null, "Planet Successfuly Deleted", true), HttpStatus.OK);
	}

	@GetMapping("/planets")
	public List<Planet> getPlanets()
	{
		return planetService.getPlanet();
	}
	
	@GetMapping("/satellitemax")
	public Satellite getSatellite()
	{
		return satelliteService.getSatellites();
	}

	
	
	
}
