package com.nailcankucuk.example.kotlinspringbootweb.service

import com.nailcankucuk.example.kotlinspringbootweb.model.User

/**
 * @author nailcankucuk@gmail.com 13.10.2019
 */
interface UserService {
    fun findById(id: Long): User?
    fun create(user: User): User
    fun findAll(): Collection<User>
    fun deleteById(id: Long): Boolean
    fun update(user: User): User
}
