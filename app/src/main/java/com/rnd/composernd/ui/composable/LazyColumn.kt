package com.rnd.composernd.ui.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rnd.composernd.model.Person
import com.rnd.composernd.repository.PersonRepository

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyColumnExample() {

    val sections = listOf("A", "B", "C", "D")

    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        sections.forEach { section ->
            stickyHeader {
                Text(
                    text = "Section $section",
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray)
                        .padding(16.dp)
                )
            }
//            items(getAllData.filter { it.firstName.startsWith(section) }) { person ->
//                PersonRow(person)
//            }
            items(10){
                Text(
                    modifier = Modifier.padding(12.dp),
                    text = "Item $it from section $section"
                )
            }
        }
    }

}

@Composable
fun PersonRow(person: Person) {
    // A composable that displays a single row of data
    // in our LazyColumn
    // This could be a Card, a Row, a Column, etc.
    // In this case, we're using a simple Text composable
    // to display the person's name
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)
        .padding(16.dp)) {
        Text(text = "${person.firstName} ${person.lastName}", fontSize = 20.sp, color = Color.White)
    }
}