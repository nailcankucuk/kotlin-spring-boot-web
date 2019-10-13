package com.nailcankucuk.example.kotlinspringbootweb.repository

import com.nailcankucuk.example.kotlinspringbootweb.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author nailcankucuk@gmail.com 13.10.2019
 */
@Repository
interface UserRepository : JpaRepository<User, Long> {
}