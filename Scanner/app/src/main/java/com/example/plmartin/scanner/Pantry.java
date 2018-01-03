package com.example.plmartin.scanner;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Pantry extends SQLiteOpenHelper{

    private static final String TABLE_NAME = "PANTRY";



    private int size;


    Pantry(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        size = 0;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String TABLE_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
                        " (ID TEXT PRIMARY KEY NOT NULL," +
                        " Nombre INTEGER NOT NULL);";

        db.execSQL(TABLE_CREATE);
    }

    public void onDelete(SQLiteDatabase db) {
        final String TABLE_DROP = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

        db.execSQL(TABLE_DROP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void add(SQLiteDatabase db, String food){
        final String TABLE_ADD = "IF EXISTS SELECT * FROM " + TABLE_NAME + " WHERE ID=" + food +
                " UPDATE " + TABLE_NAME + " SET Nombre = Nombre+1 WHERE ID= " + food + ";" +
                " ELSE INSERT INTO " + TABLE_NAME + " (ID, Nombre) " + "VALUES (" + food + ", 1);";

        db.execSQL(TABLE_ADD);
    }

    public void delete(SQLiteDatabase db, String food){
        if(!isEmpty()) {
            final String TABLE_ADD = "IF EXISTS SELECT * FROM " + TABLE_NAME + " WHERE ID = " + food +
                    " AND Nombre > 0 UPDATE " + TABLE_NAME + " SET Nombre = Nombre - 1 WHERE ID = " + food + ";";

            db.execSQL(TABLE_ADD);
        }
    }

    public void clean(SQLiteDatabase db){
        final String TABLE_CLEAN = "DELETE FROM " + TABLE_NAME + " WHERE Nombre = 0;";
        db.execSQL(TABLE_CLEAN);
    }

    public Boolean isEmpty(){
        return size < 1;
    }



}
