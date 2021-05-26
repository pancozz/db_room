package id.ac.unhas.db_room

import androidx.room.Entity

@Entity(tableName = "note")
data class Note(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        val id: Int? = null,
        @ColumnInfo(name = "note")
        var note: String
)