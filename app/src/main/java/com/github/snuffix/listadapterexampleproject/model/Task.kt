package com.github.snuffix.listadapterexampleproject.model

import java.util.*


data class Task(val id: String = UUID.randomUUID().toString(),
                val title: String,
                val description: String)