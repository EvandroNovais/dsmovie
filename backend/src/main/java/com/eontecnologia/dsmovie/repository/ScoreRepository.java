package com.eontecnologia.dsmovie.repository;

import com.eontecnologia.dsmovie.entities.Score;
import com.eontecnologia.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
