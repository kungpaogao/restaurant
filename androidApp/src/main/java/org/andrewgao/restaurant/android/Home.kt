package org.andrewgao.restaurant.android

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.andrewgao.restaurant.android.designsystem.DsSpacerColumn
import org.andrewgao.restaurant.android.designsystem.DsTheme

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    LazyColumn(
        contentPadding = PaddingValues(DsTheme.dimens.base),
        verticalArrangement = Arrangement.spacedBy(DsTheme.dimens.base),
        modifier = Modifier.fillMaxSize(),
    ) {
        items(25) { index ->
            Card(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min)
                        .padding(DsTheme.dimens.base)
                ) {
                    Column(Modifier.weight(1f)) {
                        Text(
                            text = "Gramercy Tavern",
                            fontWeight = FontWeight.Bold,
                            style = DsTheme.typography.titleMedium
                        )
                        DsSpacerColumn(height = DsTheme.dimens.xs)
                        Text(text = "January 6, 2022")
                    }
                    Surface(
                        modifier = Modifier.aspectRatio(1f),
                        shape = RoundedCornerShape(4.dp),
                    ) {
                        Text(
                            modifier = Modifier.fillMaxSize(),
                            text = index.toString(),
                            style = DsTheme.typography.headlineMedium,
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }
        }
    }


}