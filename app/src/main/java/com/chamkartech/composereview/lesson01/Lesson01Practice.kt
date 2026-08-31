package com.chamkartech.composereview.lesson01

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
 * LESSON 1 — PRACTICE
 *
 * Practice 1: make the text switch between "On" and "Off" on every click.
 * Fill in the three TODOs. Do not rewrite the file.
 *
 * Check yourself: click three times, you should see On -> Off -> On.
 */

@Composable
fun TogglePractice() {
    // TODO 1: declare the state here
    var isOn by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(24.dp)) {
        // TODO 2: make this text depend on the state
        Text(text = if (isOn) "On" else "Off")

        Button(onClick = {
            // TODO 3: change the state here
            isOn = !isOn
        }) {
            Text("Toggle")
        }
    }
}

/*
 * Practice 3: this compiles and runs. Clicking does nothing visible.
 * Find the bug BY READING before you run it.
 *
 * Answer these in order and the bug will find itself:
 *   1. Where does the state live?
 *      The state live there:
 *          var isOn by remember { mutableStateOf(false) }
 *          remember keeps the state across recompositions.
 *          mutableStateOf(false) creates observable state.
 *          isOn starts as false.
 *
 *   2. What does the Text actually read?
 *      The Text reads the current value of isOn:
 *          Text(text = if (isOn) "On" else "Off")
 *      When:
 *          isOn == false → displays "Off"
 *          isOn == true → displays "On"
 *      Because Text reads isOn, Compose knows it depends on this state and will recompose when it changes.
 *
 *   3. What does the button do to the state?
 *      The button toggles the value:
        * Button(onClick = {
           isOn = !isOn
       })
       * Each click changes:
       * false → true
       * true → fals
       * false → true
 */
@Composable
fun BrokenToggle() {
    var isOn by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(24.dp)) {
        Text(text = "Off")

        Button(onClick = { isOn = !isOn }) {
            Text("Toggle")
        }
    }
}
