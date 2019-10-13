package com.nailcankucuk.example.kotlinspringbootweb.controller

import com.nailcankucuk.example.kotlinspringbootweb.model.User
import com.nailcankucuk.example.kotlinspringbootweb.service.UserService
import org.springframework.web.bind.annotation.*

/**
 * @author nailcankucuk@gmail.com 13.10.2019
 */
@RestController
@RequestMapping("/user")
class UserController constructor(var userService: UserService) {
    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): User? {
        print("User will be gets by id: $id");
        return userService.findById(id);
    }

    @PostMapping
    fun createUser(@RequestBody user: User): User {
        println("User will be saved $user");
        return userService.create(user);
    }

    @PutMapping
    fun updateUser(@RequestBody user: User): User {
        println("User will be updated $user")
        return userService.update(user);
    }

    @GetMapping("/list")
    fun getUsers(): Collection<User> {
        println("All users will be get!");
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long): Boolean {
        println("User will be delete by id: $id")
        return userService.deleteById(id);
    }
}