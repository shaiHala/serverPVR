package com.projet.j2ee.service.g_user;

import java.util.List;

import com.projet.j2ee.models.g_user.User;

public interface UserService {
	User saveUser(User user);
	User updateUser(User user);
	void deleteUser(User user);
	void deleteUserById(int id);
	User getUser(int id);
	List<User> getAllUsers();
}
