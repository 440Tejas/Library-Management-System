package com.libray.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libray.entity.BorrowedItem;

@Repository
public interface BorrowedItemRepository  extends JpaRepository<BorrowedItem,Integer>{

}
