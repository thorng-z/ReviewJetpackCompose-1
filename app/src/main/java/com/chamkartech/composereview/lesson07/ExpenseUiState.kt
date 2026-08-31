package com.chamkartech.composereview.lesson07

import com.chamkartech.composereview.common.Expense

/**
 * Everything the expense screen needs, in one object.
 *
 * One state object, not three separate fields: the screen can never show a
 * total that disagrees with the list it was calculated from.
 */
data class ExpenseUiState(
    val expenses: List<Expense> = emptyList(),
    val total: Int = 0
)
