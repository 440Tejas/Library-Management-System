package com.libray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.libray.entity.BorrowedItem;
import com.libray.service.BorrowedItemService;

@RestController
public class BorrowedItemsController {
	@Autowired
	BorrowedItemService BorrowedItemService;
	
	@GetMapping("getAllBorrowedItems")
	public List<BorrowedItem> getAllBorrowedItems(){
		return BorrowedItemService.findAll();
	}

	@PostMapping("saveBorrowItems")
	public BorrowedItem  saveBorrowItems (@RequestBody  BorrowedItem borrowedItem) {
		return BorrowedItemService.saveBorrowedItems(borrowedItem);
	}
	
	@PutMapping("submitBorrowItems")
	public BorrowedItem  submitBorrowItems (@RequestBody  BorrowedItem borrowedItem) {
		return BorrowedItemService.saveBorrowedItems(borrowedItem);
	}
	
}
