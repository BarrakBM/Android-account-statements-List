package com.example.list.data

import java.time.LocalDate

data class AccountStatement(
    var type: String,
    var date: LocalDate,
    var reference: Int,
    var currency: String,
    var amount: Double,

    )