package com.example.mandiri_newsapp.db

import androidx.room.TypeConverter
import com.example.mandiri_newsapp.models.Source

class Converters {
    @TypeConverter
    fun formSource(source: Source):String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}