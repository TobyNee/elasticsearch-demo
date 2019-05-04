package com.imooc.xunwuproject.repository;

import com.imooc.entity.User;
import com.imooc.repository.UserRepository;
import com.imooc.xunwuproject.ApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRepositoryTest extends ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void findOne() {
		User user = userRepository.findById(1L).orElse(null);
		Assert.assertEquals("waliwali", user.getName());
	}

}
