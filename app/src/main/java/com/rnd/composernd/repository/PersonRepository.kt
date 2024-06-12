package com.rnd.composernd.repository

import com.rnd.composernd.model.Person

class PersonRepository {

    fun getAllData(): List<Person> {
        return listOf(
            Person(1, "John", "Doe", 25),
            Person(2, "Jane", "Doe", 23),
            Person(3, "Alice", "Smith", 30),
            Person(4, "Bob", "Johnson", 35),
            Person(5, "Charlie", "Brown", 40),
            Person(6, "David", "Williams", 45),
            Person(7, "Eve", "Davis", 50),
            Person(8, "Frank", "Wilson", 55),
            Person(9, "Grace", "Martinez", 60),
            Person(10, "Henry", "Anderson", 65)
        )
    }
}