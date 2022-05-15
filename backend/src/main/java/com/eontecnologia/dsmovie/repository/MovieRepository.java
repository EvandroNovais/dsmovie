package com.eontecnologia.dsmovie.repository;

import com.eontecnologia.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
