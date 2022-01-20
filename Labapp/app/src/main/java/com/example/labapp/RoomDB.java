package com.example.labapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {MainData.class},version=1)
public abstract class RoomDB extends RoomDatabase {

    public abstract MainDao mainDao();
    //cretae atabse instance
    private static RoomDB databse;

    //define db name
    private static String DATABASE_NAME="database";

    public  synchronized static RoomDB getInstance(Context context){
        if(databse==null){
            //when db is null
            //initialize dab
            databse= Room.databaseBuilder(context.getApplicationContext(),RoomDB.class,DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }

        //return db
        return databse;
    }

}
