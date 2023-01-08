package org.andrewgao.restaurant.android

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.andrewgao.restaurant.android.designsystem.DsTheme
import org.andrewgao.restaurant.android.designsystem.components.DsSpacerColumn
import org.andrewgao.restaurant.android.designsystem.components.DsStarRating

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddMenuItem() {
    var name by remember { mutableStateOf("") }
    var notes by remember { mutableStateOf("") }
    var rating by remember { mutableStateOf(3f) }

    Column {

        Text(text = "Add restaurant", style = DsTheme.typography.titleLarge)
        DsSpacerColumn()
        OutlinedTextField(
            label = { Text(text = "Name") },
            value = name,
            onValueChange = { name = it },
            singleLine = true,
        )
        DsSpacerColumn()
        OutlinedTextField(
            label = { Text(text = "Notes") },
            value = notes,
            onValueChange = { notes = it })
        DsSpacerColumn()
        DsStarRating(rating = rating)
        Slider(value = rating, onValueChange = { rating = it }, steps = 9, valueRange = 0f..5f)
    }
}