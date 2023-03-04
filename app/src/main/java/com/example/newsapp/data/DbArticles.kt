package com.example.newsapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["title"], unique = true)])
data class DbArticles(
    @ColumnInfo var source: String,
    @ColumnInfo var author: String?,
    @ColumnInfo(name = "title") var title: String?,
    @ColumnInfo var description: String? = null,
    @ColumnInfo var url: String? = null,
    @ColumnInfo var urlToImage: String? = null,
    @PrimaryKey(autoGenerate = true) var id: Int = 0
)