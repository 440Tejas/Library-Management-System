package com.libray.service;

import java.util.List;

import com.libray.entity.Journal;

public interface JournalService {

	public List<Journal> saveAll(List<Journal> journals);

}
