package com.esl.demos.repos;

import com.esl.demos.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestController
@CrossOrigin(origins = "http://localhost:4200")
public
interface CarRepository extends JpaRepository<Car, Long> {
}

