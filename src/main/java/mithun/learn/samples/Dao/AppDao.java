package mithun.learn.samples.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import mithun.learn.samples.Locations;
@Repository
@EnableTransactionManagement

public interface AppDao extends CrudRepository<Locations, Integer> {
	@Override
	default Optional<Locations> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
