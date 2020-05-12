package com.mindtree.planetapp.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mindtree.planetapp.entity.Satellite;
@Repository
public interface SatelliteRepository extends JpaRepository<Satellite, Long>
{

	Optional<Satellite> findByName(String name);

	@Query(value= "select * from satellite order by no_of_days_revolution desc limit 1",nativeQuery=true)
	Satellite findByMaxRevolution();
	
	
	
	
	
}
