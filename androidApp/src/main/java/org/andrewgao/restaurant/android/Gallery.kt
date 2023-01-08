package org.andrewgao.restaurant.android

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.andrewgao.restaurant.android.designsystem.DsTheme

@Preview
@Composable
fun Gallery() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 128.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(100) { index ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(1f),
                color = if (index.mod(2) == 0) {
                    DsTheme.colorScheme.primary
                } else {
                    DsTheme.colorScheme.secondary
                }
            ) {
                Text("hello")
            }
        }
    }
}