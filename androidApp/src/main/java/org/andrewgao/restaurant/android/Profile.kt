package org.andrewgao.restaurant.android

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.andrewgao.restaurant.android.designsystem.DsTheme
import org.andrewgao.restaurant.android.designsystem.components.DsDividerColumn

@Preview
@Composable
fun Profile() {
    LazyColumn(
        contentPadding = PaddingValues(DsTheme.dimens.base),
        verticalArrangement = Arrangement.spacedBy(DsTheme.dimens.base),
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            AddRestaurant()
            DsDividerColumn()
            AddMenuItem()
            DsDividerColumn()
        }
        items(5) {
            Row() {
                Text(text = "Some content")
            }
        }
    }
}