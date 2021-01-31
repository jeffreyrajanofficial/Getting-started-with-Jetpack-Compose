package com.jr.jetpackcomposebasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BodyContent() }
    }

    @Preview
    @Composable
    fun BodyContent() {
        ColumnContent()
    }

    @Preview("Column Example")
    @Composable
    fun ColumnContent() {
        Column(modifier = Modifier.fillMaxSize().background(Color.LightGray)) {
            Text(text = "Title", style = MaterialTheme.typography.h6)
            Text(text = "Content", style = MaterialTheme.typography.body1)
            RowContent()
            BoxContent()
        }
    }
    
    @Preview(name = "Row Example", showBackground = true)
    @Composable
    fun RowContent() {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "text1")
            Text(text = "text2")
        }
    }

    @Preview("Box Example", showBackground = true)
    @Composable
    fun BoxContent() {
        Box(
                modifier = Modifier.fillMaxWidth(),
                alignment = Alignment.Center
        ) {
            Box(modifier = Modifier
                .preferredSize(50.dp)
                .clip(CircleShape)
                .background(Color.Blue)
            )
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Favorite)
            }
        }
    }

    @Preview(name = "Hello world", showBackground = true)
    @Composable
    fun Greetings() {
        Text(text = "Hello World!")
    }
}