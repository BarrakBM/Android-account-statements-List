package com.example.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.list.composables.ShowStatements
import com.example.list.data.AccountStatement
import com.example.list.ui.theme.ListTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {

    val accountStatementsList: List<AccountStatement> = listOf(
        AccountStatement(
            "Withdraw",
            LocalDate.now(),
            1,
            "KWD",
            344.00
        ),
        AccountStatement(
            "Withdraw",
            LocalDate.now(),
            2,
            "KWD",
            .00
        ),AccountStatement(
            "Deposit",
            LocalDate.now(),
            3,
            "USD",
            10.00
        ),AccountStatement(
            "Withdraw",
            LocalDate.now(),
            4,
            "KWD",
            83.00
        ),AccountStatement(
            "Deposit",
            LocalDate.now(),
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

