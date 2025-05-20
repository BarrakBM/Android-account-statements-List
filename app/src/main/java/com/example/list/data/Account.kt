package com.example.list.data

import java.math.BigDecimal
import java.sql.Date

data class AccountStatement(
    var type: String,
    var date: String,
    var reference: Int,
    var currency: String,
    var amount: Double,

)