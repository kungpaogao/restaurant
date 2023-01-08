package org.andrewgao.restaurant.android.designsystem.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.ceil

@Composable
fun DsStarRating(rating: Float, size: Dp = 32.dp) {
    val ratingRoundUp = ceil(rating.toDouble()).toInt()
    val ratingRoundDown = rating.toInt()

    val iconModifier = Modifier.size(size)

    Row {
        repeat(ratingRoundDown) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = null,
                modifier = iconModifier,
            )
        }
        if (ratingRoundDown < ratingRoundUp) {
            Icon(
                imageVector = Icons.Default.StarHalf,
                contentDescription = null,
                modifier = iconModifier,
            )
        }
        repeat(5 - ratingRoundUp) {
            Icon(
                imageVector = Icons.Default.StarOutline,
                contentDescription = null,
                modifier = iconModifier,
            )
        }
    }
}