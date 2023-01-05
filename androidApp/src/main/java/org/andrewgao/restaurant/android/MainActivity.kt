package org.andrewgao.restaurant.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.Collections
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import org.andrewgao.restaurant.Greeting
import org.andrewgao.restaurant.android.designsystem.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var selectedItem by remember { mutableStateOf(0) }
            val items = listOf(
                NavigationItem("Eat", Icons.Filled.Restaurant),
                NavigationItem("To do", Icons.Filled.Checklist),
                NavigationItem("Gallery", Icons.Filled.Collections),
                NavigationItem("Profile", Icons.Filled.Person),
            )

            AppTheme {
                MainLayout(
                    selectedNavigationItemIndex = selectedItem,
                    navigationItems = items,
                    onNavigationItemClick = { selectedItem = it },
                    onActionClick = {},
                ) {
                    GreetingView(Greeting().greet())
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    AppTheme {
        GreetingView("Hello, Android!")
    }
}
