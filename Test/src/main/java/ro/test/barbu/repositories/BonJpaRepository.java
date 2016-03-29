package ro.test.barbu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.test.barbu.model.Bon;

@Repository
public interface BonJpaRepository extends JpaRepository<Bon	, Long> {

}
