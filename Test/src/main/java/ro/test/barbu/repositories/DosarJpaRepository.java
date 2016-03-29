package ro.test.barbu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.test.barbu.model.Dosar;

@Repository
public interface DosarJpaRepository extends JpaRepository<Dosar, Long> {
	
	Dosar findByNrDosar(String nrDosar);

}
