package org.andrewgao.restaurant.android.designsystem

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
private fun DsDivider(
    paddingVertical: Dp = 0.dp,
    paddingHorizontal: Dp = 0.dp,
) {
    Spacer(modifier = Modifier.padding(vertical = paddingVertical, horizontal = paddingHorizontal))
}

@Composable
fun DsDividerColumn(paddingVertical: Dp = DsTheme.dimens.base) =
    DsDivider(paddingVertical = paddingVertical)

@Composable
fun DsDividerRow(paddingHorizontal: Dp = DsTheme.dimens.base) =
    DsDivider(paddingHorizontal = paddingHorizontal)