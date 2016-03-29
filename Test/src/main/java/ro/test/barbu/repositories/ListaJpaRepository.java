package ro.test.barbu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.test.barbu.model.ListaSedinta;

@Repository
public interface ListaJpaRepository extends JpaRepository<ListaSedinta, Long> {

}
