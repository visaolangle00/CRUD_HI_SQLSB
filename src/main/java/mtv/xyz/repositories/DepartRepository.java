package mtv.xyz.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mtv.xyz.models.Depart;

@Repository
public interface DepartRepository extends CrudRepository<Depart, Integer> {
	
}
