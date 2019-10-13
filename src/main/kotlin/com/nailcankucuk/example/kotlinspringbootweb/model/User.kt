package com.nailcankucuk.example.kotlinspringbootweb.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author nailcankucuk@gmail.com 13.10.2019
 */
@Entity
data class User constructor(var username: String? = "", var firstName: String? = "", var lastName: String? = "") : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
}