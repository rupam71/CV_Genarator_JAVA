package com.example.cv;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.IOException;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "resumeDatabase4";
    public static final String CONTACTS_TABLE_NAME = "ResumeTable4";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(
                    "create table " + CONTACTS_TABLE_NAME + "(id INTEGER PRIMARY KEY, name text, address text, phone text, dateOfBirth text, nationality text, hobby text, language text, school text, college text, occupation text, date text, email text, carobj text)"
            );
        } catch ( SQLiteException e) {
            try {
                throw new IOException(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CONTACTS_TABLE_NAME);
        onCreate(db);
    }

    public boolean insert(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("name", s);
        contentValues.put("address", s1);
        contentValues.put("phone", s2);
        contentValues.put("dateOfBirth", s3);
        contentValues.put("nationality", s4);
        contentValues.put("hobby", s5);
        contentValues.put("language", s6);
        contentValues.put("school", s7);
        contentValues.put("college", s8);
        contentValues.put("occupation", s9);
        contentValues.put("date", s10);
        contentValues.put("email", s11);
        contentValues.put("carobj", s12);
        db.replace(CONTACTS_TABLE_NAME, null, contentValues);
        return true;
    }

    public ArrayList getAllContacts() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<String> array_list = new ArrayList<String>();
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " +CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            array_list.add(res.getString(res.getColumnIndex("name" )));
            array_list.add(res.getString(res.getColumnIndex("address" )));
            array_list.add(res.getString(res.getColumnIndex("phone" )));
            array_list.add(res.getString(res.getColumnIndex("dateOfBirth" )));
            array_list.add(res.getString(res.getColumnIndex("nationality" )));
            array_list.add(res.getString(res.getColumnIndex("hobby" )));
            array_list.add(res.getString(res.getColumnIndex("language" )));
            array_list.add(res.getString(res.getColumnIndex("school" )));
            array_list.add(res.getString(res.getColumnIndex("college" )));
            array_list.add(res.getString(res.getColumnIndex("occupation" )));
            array_list.add(res.getString(res.getColumnIndex("date" )));
            array_list.add(res.getString(res.getColumnIndex("email" )));
            array_list.add(res.getString(res.getColumnIndex("carobj" )));
            res.moveToNext();
        }
        return array_list;
    }

    public String getName() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("name"));
            res.moveToNext();
        }
        return s;
    }

        public String getAddress() {
            SQLiteDatabase db = this.getReadableDatabase();
            String s="";
            @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " +CONTACTS_TABLE_NAME, null);
            res.moveToLast();
            while (res.isAfterLast() == false) {
                s = res.getString(res.getColumnIndex("address" ));
                res.moveToNext();
            }
            return s;
    }

    public String getPhone() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("phone"));
            res.moveToNext();
        }
        return s;
    }

    public String getDateofbirth() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s="";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " +CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("dateOfBirth" ));
            res.moveToNext();
        }
        return s;
    }

    public String getNationality() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("nationality"));
            res.moveToNext();
        }
        return s;
    }

    public String getHobby() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s="";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " +CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("hobby" ));
            res.moveToNext();
        }
        return s;
    }

    public String getLanguage() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("language"));
            res.moveToNext();
        }
        return s;
    }

    public String getSchool() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("school"));
            res.moveToNext();
        }
        return s;
    }

    public String getCollege() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s="";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " +CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("college" ));
            res.moveToNext();
        }
        return s;
    }

    public String getOccupation() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("occupation"));
            res.moveToNext();
        }
        return s;
    }

    public String getDate() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("date"));
            res.moveToNext();
        }
        return s;
    }

    public String getEmail() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s="";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " +CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("email" ));
            res.moveToNext();
        }
        return s;
    }

    public String getCarobj() {
        SQLiteDatabase db = this.getReadableDatabase();
        String s = "";
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from " + CONTACTS_TABLE_NAME, null);
        res.moveToLast();
        while (res.isAfterLast() == false) {
            s = res.getString(res.getColumnIndex("carobj"));
            res.moveToNext();
        }
        return s;
    }

}
