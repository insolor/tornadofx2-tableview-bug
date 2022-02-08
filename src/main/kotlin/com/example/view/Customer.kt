package com.example.view

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class Customer(id: Int, lastName: String, firstName: String) {
    val lastNameProperty = SimpleStringProperty(this, "lastName", lastName)
    var lastName by lastNameProperty
    val firstNameProperty = SimpleStringProperty(this, "firstName", firstName)
    var firstName by firstNameProperty
    val idProperty = SimpleIntegerProperty(this, "id", id)
    var id by idProperty
}