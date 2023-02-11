package mtv.xyz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mtv.xyz.models.Depart;
import mtv.xyz.repositories.DepartRepository;

public interface DepartService {

	void deleteAll();

	void deleteAll(List<Depart> entities);

	void deleteAllById(Iterable<? extends Integer> ids);

	void delete(Depart entity);

	void deleteById(Integer id);

	long count();

	List<Depart> findAllById(List<Integer> ids);

	Iterable<Depart> findAll();

	boolean existsById(Integer id);

	Optional<Depart> findById(Integer id);

	List<Depart> saveAll(List<Depart> entities);

	Depart save(Depart entity);

	
}
