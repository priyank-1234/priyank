package com.mindtree.planetapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.planetapp.entity.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> 
{

	Optional<Planet> findByName(String name);
	
	@Query("select p from Satellite s right join s.planet p  where s.planet=null")
	List<Planet>FindBySatelliteId();
	
	
}
