package com.nailcankucuk.example.kotlinspringbootweb.exception

import java.lang.RuntimeException

class UserNotFoundByIdException(message: String?) : RuntimeException(message) {

}
