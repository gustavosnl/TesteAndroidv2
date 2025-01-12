package com.zuptest.santander.domain.business.model

import java.io.Serializable
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.NumberFormat
import java.util.*

class Money() : Comparable<Money>, Serializable {

    private var amount = BigDecimal.ZERO
    private val currencyFormatter = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))

    init {
        amount = amount.setScale(2, RoundingMode.HALF_UP)
    }

    constructor(value: Double) : this() {
        amount = BigDecimal(value)
    }

    fun formattedPrint(): String = currencyFormatter.format(amount)

    override fun compareTo(other: Money): Int {
        return amount.compareTo(other.amount)
    }
}