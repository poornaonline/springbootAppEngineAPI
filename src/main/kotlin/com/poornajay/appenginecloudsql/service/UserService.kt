package com.poornajay.appenginecloudsql.service

import com.poornajay.appenginecloudsql.dao.User
import com.poornajay.appenginecloudsql.dao.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun createUser(): User {

        val newUser = User()

        newUser.firstName = "Poorna"
        newUser.lastName = "Jayasinghe"
        newUser.age = 28

        return userRepository.save(newUser)
    }

    fun getAllUsers(): MutableIterable<User> {
        return userRepository.findAll()
    }
}