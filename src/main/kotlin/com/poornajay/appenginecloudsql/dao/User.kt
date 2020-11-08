package com.poornajay.appenginecloudsql.dao

import javax.annotation.processing.Generated
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    var firstName: String? = null
    var lastName: String? = null
    var age: Int? = null
}