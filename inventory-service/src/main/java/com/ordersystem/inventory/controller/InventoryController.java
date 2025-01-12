package com.ordersystem.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ordersystem.inventory.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

	
	private final InventoryService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer qty) {
		return service.isInStock(skuCode, qty);
	}
	
}
