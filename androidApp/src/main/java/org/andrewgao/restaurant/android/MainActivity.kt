package org.andrewgao.restaurant.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.Collections
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import org.andrewgao.restaurant.android.designsystem.DsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            var selectedItemIndex by remember { mutableStateOf(0) }
            val items = listOf(
                NavigationItem("Ate", Icons.Filled.Restaurant),
                NavigationItem("To go", Icons.Filled.Checklist),
                NavigationItem("Gallery", Icons.Filled.Collections),
                NavigationItem("Profile", Icons.Filled.Person),
            )

            DsTheme(useDarkTheme = true) {
                MainScaffold(
                    selectedNavigationItemIndex = selectedItemIndex,
                    navigationItems = items,
                    onNavigationItemClick = { selectedItemIndex = it },
                    onActionClick = {

                    },
                ) {
                    when (selectedItemIndex) {
                        0 -> Home()
                        1 -> ToGo()
                        2 -> Gallery()
                        3 -> Profile()
                    }
                }
            }
        }
    }
}
