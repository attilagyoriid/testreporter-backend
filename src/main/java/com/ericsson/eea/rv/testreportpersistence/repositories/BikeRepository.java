package com.ericsson.eea.rv.testreportpersistence.repositories;

import com.ericsson.eea.rv.testreportpersistence.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eattgyo on 5/24/2018.
 */


public interface BikeRepository extends JpaRepository<Bike, Long> {

}