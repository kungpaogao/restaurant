package org.andrewgao.restaurant.android

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector


data class NavigationItem(
    val labelText: String,
    val icon: ImageVector,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainLayout(
    selectedNavigationItemIndex: Int,
    navigationItems: List<NavigationItem>,
    onNavigationItemClick: (index: Int) -> Unit,
    onActionClick: () -> Unit,
    content: @Composable () -> Unit,
) {
    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(onClick = onActionClick) {
                Icon(Icons.Default.Add, contentDescription = null)
                Text(text = "Record")
            }
        },
        bottomBar = {
            NavigationBar {
                navigationItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(item.icon, contentDescription = null) },
                        label = { Text(item.labelText) },
                        selected = selectedNavigationItemIndex == index,
                        onClick = { onNavigationItemClick(index) }
                    )
                }
            }
        }
    ) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)) {
            content()
        }
    }
}