package com.example.user.textschedule;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Manlapaz on 11/14/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String SCHEMA = "text_sched";
    public static final int VERSION = 1;

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String statusSQL = "CREATE TABLE " + Status.TABLE_NAME + " ("
                + Status.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Status.COLUMN_NAME + " TEXT, "
                + Status.COLUMN_MESSAGE + " TEXT, "
                + Status.COLUMN_RECIPIENTS + " ," //EDIT
                + Status.COLUMN_ACTIVE + " INT";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
