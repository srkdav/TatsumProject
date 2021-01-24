package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.FactorRepo;
import com.app.dao.UserCustomRepo;
//import com.app.dao.FactorRepo;
import com.app.dao.UserRepo;
import com.app.models.FactorRequest;
import com.app.models.FactorUsageReqJSON;
import com.app.pojos.Factor;
import com.app.pojos.FactorUserUsage;
import com.app.pojos.Pk;
import com.app.pojos.User;

@RestController
public class FactorController {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private FactorRepo factorRepo;

	@Autowired
	private UserCustomRepo userCustomRepo;

	// Method to register new User
	@PostMapping("/registerUser")
	public ResponseEntity<String> enterUser(@RequestBody FactorRequest req) {

		try {
			userRepo.save(req.getUser());
		} catch (Exception e) {
			e.getMessage();
			return new ResponseEntity<>("User Not registered.Please try later.", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("User Successfully Registered.", HttpStatus.OK);
	}

	// Method to post new Factors (wealth,health etc...)
	@PostMapping("/enterFactors")
	public ResponseEntity<String> enterFactors(@RequestBody FactorRequest req) {
		try {
			factorRepo.save(req.getFactor());
		} catch (Exception e) {
			return new ResponseEntity<>(" Area could not be allocated.", HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<>("New Area allocated Successfully.", HttpStatus.OK);

	}

	// method to enter factors and priority values for each user.
	@PostMapping("/enterPriority")
	public ResponseEntity<String> enterPriorities(@RequestBody FactorUsageReqJSON request) {

		try {
			FactorUserUsage factorusage = new FactorUserUsage();
			factorusage.setFactor_priority(request.getFactorUsageReq().getFactor_score());
			User u = userCustomRepo.getUserbyId(request.getFactorUsageReq().getUser_id());
			Pk id = new Pk();
			id.setFactor_id(request.getFactorUsageReq().getFactor_id());
			id.setUser(u);
			factorusage.setId(id);
			userCustomRepo.saveEntries(factorusage);
		} catch (Exception e) {
			return new ResponseEntity<>("Entries were not allocated.Please try later.", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("Entired allocated Successfully.", HttpStatus.OK);
	}

	// method to return all Factors.
	@GetMapping("/findAllFactors")
	public List<Factor> findAllFactors() {
		return factorRepo.findAll();
	}

}
