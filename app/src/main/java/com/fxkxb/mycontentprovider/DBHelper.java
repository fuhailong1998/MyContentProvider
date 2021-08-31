package com.fxkxb.mycontentprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author : 付海龙(hailong.fu@thundersoft.com)
 * @version : 1.0
 * @file : DBHelper.class
 * @date : 2021/9/1 0:50
 * @description :
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "finch.db";
    public static final String USER_TABLE_NAME = "user";
    public static final String JOB_TABLE_NAME = "job";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS " + USER_TABLE_NAME + "(_id INTEGER PRIMARY KEY AUTOINCREMENT," + " name TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + JOB_TABLE_NAME + "(_id INTEGER PRIMARY KEY AUTOINCREMENT," + " job TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}