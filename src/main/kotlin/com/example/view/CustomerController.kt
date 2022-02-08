package com.example.view

import tornadofx.*

class CustomerController : Controller() {
    val customers = listOf(
        Customer(1, "Marley", "John"),
        Customer(2, "Schmidt", "Ally"),
        Customer(3, "Johnson", "Eric")
    ).asObservable()
}