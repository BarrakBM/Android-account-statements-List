package com.example.list.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.list.data.AccountStatement

@Composable
fun ShowStatements(statements: List<AccountStatement>, modifier: Modifier = Modifier ){
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(statements.size) {

            // do the color for everyother one (apply for even nums
            val color = if(it% 2==0){
                Color(0xFFBE6B6B)
            } else {
                Color(0xFF5968C2)
            }
            AccountCard(
                account = statements[it],
                modifier = Modifier,
                backgroundColor = color
            )
            if(it < statements.size -1){ // add divider except for last one
                HorizontalDivider(
                    modifier = modifier
                )
            }
        }


    }
}