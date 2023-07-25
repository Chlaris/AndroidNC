package com.example.androidnc.database.convert;

import android.arch.persistence.room.TypeConverter;

import java.time.Instant;
import java.util.Date;

/*
database does not support Date
convert it to a timestamp when reading the value from the database
we will convert the timestamp back to Date type.
*/

public class WorkItemConverter {
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value != null ? new Date(value) : null;
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date != null ? date.getTime() : null;
    }
}
