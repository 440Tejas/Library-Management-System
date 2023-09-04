package com.libray.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libray.entity.Journal;

public interface JournalRepository extends JpaRepository<Journal, Integer> {

}
