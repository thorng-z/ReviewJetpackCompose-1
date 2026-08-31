package com.chamkartech.composereview.lesson07

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.chamkartech.composereview.common.Expense
import com.chamkartech.composereview.common.ExpenseRow
import com.chamkartech.composereview.common.loadExpenses
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/*
 * LESSON 7 — PRACTICE
 *
 * 1. Move the list and the total calculation into the ViewModel.
 * 2. Read them in the UI through collectAsState().
 * 3. Fix addExpense, which edits in place instead of building a new object.
 *
 * Check yourself: scroll into the middle, rotate — data still there, no
 * reload. Your composable contains no arithmetic at all.
 *
 * Import you will need:
 *     androidx.lifecycle.viewmodel.compose.viewModel
 */

class ExpenseViewModelPractice : ViewModel() {

    private val _uiState = MutableStateFlow(ExpenseUiState())
    val uiState: StateFlow<ExpenseUiState> = _uiState.asStateFlow()

    // TODO 1: load the expenses here, in an init block,
    //         and compute the total while you are at it

    // TODO 3: this runs, the data is correct, and the screen never moves.
    //         Log the list size to prove the data changed, then work out
    //         why the UI does not know, and fix it.
    fun addExpense(item: Expense) {
        _uiState.value.expenses.toMutableList().add(item)
    }
}

@Composable
fun ExpenseScreenWithViewModel() {
    // TODO 1: delete this line, take the data from the ViewModel instead
    val expenses by remember { mutableStateOf(loadExpenses(200)) }

    // TODO 2: this calculation belongs in the ViewModel, not in the UI
    val total = expenses.sumOf { it.amount }

    Column {
        Text("Total: $total R")

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(expenses, key = { it.id }) { ExpenseRow(it) }
        }
    }
}
