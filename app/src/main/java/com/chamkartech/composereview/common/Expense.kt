package com.chamkartech.composereview.common

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Shared data model, used from Lesson 2 onwards.
 *
 * @Parcelize is here because Lesson 6 needs it. Lesson 6's exercise
 * deliberately introduces another class WITHOUT it, so students can
 * see the rotation crash for themselves.
 */
@Parcelize
data class Expense(
    val id: Int,
    val title: String,
    val amount: Int
) : Parcelable

/** Sample data. Raise the count to make the Lesson 3 stutter more obvious. */
fun loadExpenses(count: Int = 200): List<Expense> {
    val names = listOf(
        "Iced coffee", "Motorbike fuel", "Grilled pork rice", "Phone top-up",
        "Market vegetables", "Bottled water", "Noodle soup", "Bus fare",
        "Ice cream", "Fried banana", "Laundry", "Electricity"
    )
    return (1..count).map { i ->
        Expense(
            id = i,
            title = names[i % names.size],
            amount = (5..40).random() * 500
        )
    }
}
