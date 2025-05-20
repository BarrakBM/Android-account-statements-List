package com.example.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.list.composables.ShowStatements
import com.example.list.data.AccountStatement
import com.example.list.ui.theme.ListTheme

class MainActivity : ComponentActivity() {

    val accountStatementsList: List<AccountStatement> = listOf(
        AccountStatement(
            "Withdraw",
            "10-8-2024",
            1,
            "KWD",
            344.00
        ),
        AccountStatement(
            "Withdraw",
            "1-7-2024",
            2,
            "KWD",
            .00
        ),AccountStatement(
            "Deposit",
            "10-3-2025",
            3,
            "USD",
            10.00
        ),AccountStatement(
            "Withdraw",
            "10-01-2024",
            4,
            "KWD",
            83.00
        ),AccountStatement(
            "Deposit",
            "12-10-2024",
            5,
            "KWD",
            1000.00
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowStatements(accountStatementsList, Modifier.padding(innerPadding))
                }
            }
        }
    }
}

