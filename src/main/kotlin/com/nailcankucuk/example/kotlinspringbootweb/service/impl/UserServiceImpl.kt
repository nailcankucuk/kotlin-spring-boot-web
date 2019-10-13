package com.nailcankucuk.example.kotlinspringbootweb.service.impl

import com.nailcankucuk.example.kotlinspringbootweb.exception.UserNotFoundByIdException
import com.nailcankucuk.example.kotlinspringbootweb.model.User
import com.nailcankucuk.example.kotlinspringbootweb.repository.UserRepository
import com.nailcankucuk.example.kotlinspringbootweb.service.UserService
import org.springframework.stereotype.Service

/**
 * @author nailcankucuk@gmail.com 13.10.2019
 */
@Service
class UserServiceImpl constructor(var userRepository: UserRepository) : UserService {
    override fun create(user: User): User {
        val savedUser = userRepository.save(user);
        println("User saved: $savedUser")
        return savedUser;
    }

    override fun update(user: User): User {
        findById(user.id) ?: throw UserNotFoundByIdException("User not found by id: ${user.id}")
        val updatedUser = userRepository.save(user);
        println("User updated $updatedUser")
        return updatedUser;
    }

    override fun findById(id: Long): User? {
        val userOptional = userRepository.findById(id);
        println("User found by id");
        return userOptional.orElse(null);
    }


    override fun findAll(): Collection<User> {
        val list = userRepository.findAll();
        println("${list.size} users found.")
        return list
    }

    override fun deleteById(id: Long): Boolean {
        val user = findById(id);
        if (user != null) {
            userRepository.delete(user)
            return true
        }
        return false
    }
}