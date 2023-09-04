package com.libray.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libray.entity.Journal;
import com.libray.repository.JournalRepository;
import com.libray.service.JournalService;
@Service
public class JournalServiceImpl implements JournalService {

	@Autowired
	JournalRepository journalRepository;
	@Override
	public List<Journal> saveAll(List<Journal> journals) {
		List<Journal> saveAll = journalRepository.saveAll(journals);
		return saveAll;
	}

}
