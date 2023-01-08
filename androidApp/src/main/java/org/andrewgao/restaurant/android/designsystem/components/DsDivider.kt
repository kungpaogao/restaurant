package org.andrewgao.restaurant.android.designsystem.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.andrewgao.restaurant.android.designsystem.DsTheme

@Composable
private fun DsDivider(
    paddingVertical: Dp = 0.dp,
    paddingHorizontal: Dp = 0.dp,
) {
    Divider(modifier = Modifier.padding(vertical = paddingVertical, horizontal = paddingHorizontal))
}

@Composable
fun DsDividerColumn(paddingVertical: Dp = DsTheme.dimens.base) =
    DsDivider(paddingVertical = paddingVertical)

@Composable
fun DsDividerRow(paddingHorizontal: Dp = DsTheme.dimens.base) =
    DsDivider(paddingHorizontal = paddingHorizontal)