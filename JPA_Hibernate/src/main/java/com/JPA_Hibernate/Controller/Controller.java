package com.JPA_Hibernate.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.JPA_Hibernate.Entity.UserDetails;
import com.JPA_Hibernate.Repository.UserRepository;


@RestController
@RequestMapping("/user")
public class Controller {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/details")
	public String setUserDetails(@RequestBody  UserDetails userDetails) {
		
		userRepository.save(userDetails);
		return "The "+userDetails.getUserName()+" details has been stored in DB";
	}
}
