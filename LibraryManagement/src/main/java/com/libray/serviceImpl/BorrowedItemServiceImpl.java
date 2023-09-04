package com.libray.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libray.entity.BorrowedItem;
import com.libray.repository.BorrowedItemRepository;
import com.libray.service.BorrowedItemService;

@Service
public class BorrowedItemServiceImpl implements BorrowedItemService {

    @Autowired
    BorrowedItemRepository borrowedItemRepository;
	@Override
	public BorrowedItem saveBorrowedItems(BorrowedItem borrowedItem) {
		return borrowedItemRepository.save(borrowedItem);
	}
	@Override
	public List<BorrowedItem> findAll() {
		return borrowedItemRepository.findAll();
	}

}
