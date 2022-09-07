package com.taiye.stocktradingreactive.repository;

import com.taiye.stocktradingreactive.model.Stock;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends ReactiveMongoRepository<Stock,String> {

}
