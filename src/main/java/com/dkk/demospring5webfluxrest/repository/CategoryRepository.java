package com.dkk.demospring5webfluxrest.repository;

import com.dkk.demospring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository <Category, String> {

}
