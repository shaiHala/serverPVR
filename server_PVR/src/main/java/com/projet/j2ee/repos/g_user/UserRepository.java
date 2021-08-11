package com.projet.j2ee.repos.g_user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.j2ee.models.g_user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
