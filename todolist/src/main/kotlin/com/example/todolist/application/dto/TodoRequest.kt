package com.example.todolist.application.dto

data class TodoRequest(
    val title : String,
    val description: String,
    val done: Boolean = false,
) {

}
