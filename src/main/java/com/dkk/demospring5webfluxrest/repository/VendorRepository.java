package com.dkk.demospring5webfluxrest.repository;

import com.dkk.demospring5webfluxrest.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {

    Mono<Vendor> findByFirstName(String fname);
}
