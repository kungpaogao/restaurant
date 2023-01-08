package org.andrewgao.restaurant.android

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Event
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.material.datepicker.MaterialDatePicker
import org.andrewgao.restaurant.android.designsystem.DsSpacerColumn
import org.andrewgao.restaurant.android.designsystem.DsStarRating
import org.andrewgao.restaurant.android.designsystem.DsTheme

private fun showDatePicker(
    activity: AppCompatActivity,
    onUpdate: (Long?) -> Unit,
) {
    val datePicker =
        MaterialDatePicker.Builder.datePicker()
            .setTitleText("Select date")
            .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
            .build()

    datePicker.show(activity.supportFragmentManager, "Date picker")
    datePicker.addOnPositiveButtonClickListener(onUpdate)
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AddRestaurant() {
    val activity = LocalContext.current as AppCompatActivity

    var name by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }
    var notes by remember { mutableStateOf("") }
    var rating by remember { mutableStateOf(3f) }

    Column {
        // TODO: or Add or Edit
        Text(text = "Add restaurant", style = DsTheme.typography.titleLarge)
        DsSpacerColumn()
        OutlinedTextField(
            label = { Text(text = "Name") },
            value = name,
            onValueChange = { name = it },
            singleLine = true,
        )
        DsSpacerColumn()
        Box {
            // see: https://stackoverflow.com/questions/63887321/prevent-the-keyboard-from-appearing-in-a-jetpack-compose-app
            OutlinedTextField(
                label = { Text(text = "Date") },
                value = date,
                onValueChange = { date = it },
                singleLine = true,
                trailingIcon = {
                    Icon(Icons.Default.Event, contentDescription = null)
                }
            )

            Box(
                modifier = Modifier
                    .matchParentSize()
                    .alpha(0f)
                    .clickable {
                        showDatePicker(activity) { date = it.toString() }
                    }
            )
        }
        DsSpacerColumn(DsTheme.dimens.base)
        Text(text = "Rating", style = DsTheme.typography.titleLarge)
        DsSpacerColumn()
        DsStarRating(rating = rating)
        Slider(value = rating, onValueChange = { rating = it }, steps = 9, valueRange = 0f..5f)
        DsSpacerColumn()
        OutlinedTextField(
            label = { Text(text = "Notes") },
            value = notes,
            onValueChange = { notes = it })
        DsSpacerColumn(DsTheme.dimens.base)
        Text(text = "Menu", style = DsTheme.typography.titleLarge)
        DsSpacerColumn()
//        LazyColumn() {
//            // TODO: menu items
//        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Add menu item")
        }
    }
}
