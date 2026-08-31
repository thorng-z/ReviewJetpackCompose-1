package com.chamkartech.composereview.common

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * The list row students build themselves in Lesson 2.
 * Lessons 3, 4 and 7 reuse this finished version.
 *
 * The Log line is for Lesson 3: count how many rows actually get built.
 */
@Composable
fun ExpenseRow(item: Expense) {
    Log.d("LESSON03", "built row: ${item.title}")

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE8ECFF), RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(item.title)
        Spacer(Modifier.weight(1f))
        Text("${item.amount} R")
    }
}

/** Used by the Lesson 3 `key` demo: a colour remembered per row. */
@Composable
fun rememberPastel(): Color = remember {
    listOf(
        Color(0xFFE8ECFF), Color(0xFFE2F0E6), Color(0xFFFBEDE2),
        Color(0xFFF3EAFB), Color(0xFFFFF4D6)
    ).random()
}
