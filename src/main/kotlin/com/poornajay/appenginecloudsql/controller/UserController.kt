package com.poornajay.appenginecloudsql.controller

import com.poornajay.appenginecloudsql.dao.User
import com.poornajay.appenginecloudsql.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping(value = [""])
    fun root(): String {
        return "User Controller"
    }

    @GetMapping(value = ["create"])
    fun createUser(): User {
        return userService.createUser();
    }

    @GetMapping(value = ["all"])
    fun getAllUsers(): MutableIterable<User> {
        return userService.getAllUsers()
    }
}