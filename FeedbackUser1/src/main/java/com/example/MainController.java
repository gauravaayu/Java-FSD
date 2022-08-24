package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {
	
	@Autowired
	private FeedbackRepo repo;

	@PostMapping("/feedback")
	public String userFeedback(@ModelAttribute FeedbackEntity entity, Model model) {
		
		
		FeedbackEntity feed=repo.save(entity);
		model.addAttribute("massage",feed.getName() +"inserted.");
		return "<h2> Feedback Submitted Succesfully...Thank You Your Valuable Time!!!</h2>";
		
	
	
	
	}

}
