package com.projet.j2ee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.j2ee.models.g_user.User;
import com.projet.j2ee.service.g_user.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserRestController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") int id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
			return userService.saveUser(user);
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") int id)
	{
		userService.deleteUserById(id);
	}
	
	

}
