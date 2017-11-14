package com.example.user.textschedule;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Manlapaz on 11/14/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String SCHEMA = "text_sched";
    public static final int VERSION = 1;

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String statusSQL = "CREATE TABLE " + Status.TABLE_NAME + " ("
                + Status.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Status.COLUMN_NAME + " TEXT, "
                + Status.COLUMN_MESSAGE + " TEXT, "
                + Status.COLUMN_RECIPIENTS + " "
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
