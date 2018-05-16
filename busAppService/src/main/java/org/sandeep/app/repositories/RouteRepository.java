package org.sandeep.app.repositories;

import org.sandeep.app.models.Route;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, String> {
}
