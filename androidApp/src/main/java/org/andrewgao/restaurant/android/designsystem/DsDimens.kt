package org.andrewgao.restaurant.android.designsystem

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class DsDimens(
    val xs: Dp = 4.dp,
    val sm: Dp = 8.dp,
    val base: Dp = 16.dp,
    val md: Dp = 24.dp,
    val lg: Dp = 32.dp,
    val xl: Dp = 40.dp,
    val xxl: Dp = 48.dp,
)

internal val LocalDimens = staticCompositionLocalOf { DsDimens() }