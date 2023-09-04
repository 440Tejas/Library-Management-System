package com.libray.service;

import java.util.List;

import com.libray.entity.BorrowedItem;

public interface BorrowedItemService {
    
	BorrowedItem saveBorrowedItems(BorrowedItem borrowedItem);

	List<BorrowedItem> findAll();

	
}
