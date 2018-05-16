package org.sandeep.app.repositories;

import org.sandeep.app.models.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus, String> {
}
