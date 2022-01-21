package com.example.labapp;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MainDao {

    @Insert(onConflict = REPLACE
    )
    void insert(MainData mainData);

    @Delete()
    void deleteJ(MainData mainData);

    @Delete()
    void reset(List<MainData> );

    @Query("UPDATE table_name SET text=:sText WHERE ID=:sID")
    void update(int sID, String sText);


}
