package org.andrewgao.restaurant.android

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.andrewgao.restaurant.android.designsystem.DsTheme
import org.andrewgao.restaurant.android.designsystem.components.DsSpacerRow

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToGo() {
    LazyColumn(
        contentPadding = PaddingValues(DsTheme.dimens.base),
        modifier = Modifier.fillMaxSize(),
    ) {
        items(25) { index ->
            var checked by remember { mutableStateOf(false) }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        checked = !checked
                    },
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Checkbox(checked = checked, onCheckedChange = { checked = it })
                DsSpacerRow(width = DsTheme.dimens.xs)
                Text("ToGo $index")
            }
        }
    }
}