package org.itstep.repository;

import org.itstep.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface CarJPA extends JpaRepository<Car, Long> {
}
