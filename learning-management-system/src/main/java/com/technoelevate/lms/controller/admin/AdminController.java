package com.technoelevate.lms.controller.admin;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.lms.pojo.batch.Batch;
import com.technoelevate.lms.repository.admin.AdminRepo;

@Controller
public class AdminController {

//	@Autowired
//	AdminService adminService;

	@Autowired
	AdminRepo adminRepo;

	@GetMapping("/admin-login")
	public String adminLoginPage() {
		return "admin-login-page";

	}

	@PostMapping("/batch-batchlist")
	public String batchListAdmin(@ModelAttribute Batch batch, Model model) {
		
		List<Batch> displayAll = (List<Batch>) adminRepo.displayAll();
		model.addAttribute("list", displayAll);
		return "batch-admin";

	}
	
	@GetMapping("/batch-batchlist")
	public String batchListAdmin( Model model) {
		
		List<Batch> displayAll = (List<Batch>) adminRepo.displayAll();
		model.addAttribute("list", displayAll);
		return "batch-admin";

	}

	@GetMapping("/create-new-batch-page")
	public String createNewBatch() {

		return "create-new-batch-page";
	}

	@PostMapping("/save-batch")
	public String saveBatch(@ModelAttribute Batch batch) {
		adminRepo.saveBatch(batch);
		return "batch-created-successfully";

	}

}
