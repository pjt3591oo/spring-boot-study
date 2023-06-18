package com.example.ksb.user.entity
import jakarta.persistence.*

@Entity
@Table(name = "user")
class User(name: String, email: String) {
    @Id
    @GeneratedValue
    var id: Long? = null

    @Column
    var name: String = name

    @Column
    var email: String = email
}