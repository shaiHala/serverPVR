package com.projet.j2ee.service.g_user.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.j2ee.models.g_user.User;
import com.projet.j2ee.repos.g_user.UserRepository;
import com.projet.j2ee.service.g_user.UserService;
@Service 
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository articleRepository;
	
	@Override
	public User saveUser(User user) {
	
		return articleRepository.save(user) ;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return articleRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		articleRepository.delete(user);

	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(id);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return articleRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

}
