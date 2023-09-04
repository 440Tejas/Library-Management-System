package com.libray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.libray.entity.Journal;
import com.libray.service.JournalService;

@RestController
public class JournalController {
     @Autowired
	JournalService journalService;
     
     @PostMapping("addJournals")
	public List<Journal> addJournals(@RequestBody List<Journal>  Journals) {
		List<Journal> saveAll = journalService.saveAll(Journals);
		
		return saveAll;
		
	}
}
