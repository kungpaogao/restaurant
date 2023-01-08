package org.andrewgao.restaurant.android.designsystem.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.andrewgao.restaurant.android.designsystem.DsTheme

@Composable
private fun DsSpacer(
    width: Dp = 0.dp,
    height: Dp = 0.dp,
) {
    Spacer(modifier = Modifier.size(width, height))
}

@Composable
fun DsSpacerColumn(height: Dp = DsTheme.dimens.sm) = DsSpacer(height = height)

@Composable
fun DsSpacerRow(width: Dp = DsTheme.dimens.sm) = DsSpacer(width = width)