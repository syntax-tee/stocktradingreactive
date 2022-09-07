package com.taiye.stocktradingreactive.controller;


import com.taiye.stocktradingreactive.dto.StockRequest;
import com.taiye.stocktradingreactive.dto.StockResponse;
import com.taiye.stocktradingreactive.service.StocksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;


@AllArgsConstructor
@RestController
@RequestMapping("/stocks")
public class StocksController {

	private StocksService stocksService;

	@GetMapping("/{id}")
	public Mono<StockResponse> getOneStock(@PathVariable String id) {
		return stocksService.getOneStock(id);
	}

	@GetMapping
	public Flux<StockResponse> getAllStocks(@RequestParam(required = false,defaultValue = "0")BigDecimal priceGreaterThan) {
		return stocksService.getAllStocks(priceGreaterThan);
	}

	@PostMapping
	public Mono<StockResponse> createStock(@RequestBody StockRequest stockRequest) {
		return stocksService.createStock(stockRequest);
	}
}
