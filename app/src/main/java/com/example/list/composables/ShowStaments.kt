package com.example.list.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.list.data.AccountStatement

@Composable
fun ShowStatements(statments: List<AccountStatement>, modifier: Modifier = Modifier ){
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(statments) {
            AccountCard(it)
        }
    }
}