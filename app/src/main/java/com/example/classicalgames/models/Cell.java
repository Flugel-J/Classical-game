package com.example.classicalgames.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Cell {
    @PrimaryKey(autoGenerate = true)
    private int key;
    @ColumnInfo
    private int value;
    @ColumnInfo
    private int x;//store prev x location
    @ColumnInfo
    private int y;//store prev y location
    @ColumnInfo
    private int source;
    public Cell() {
    }

    public Cell(int value, int source) {
        this.value = value;
        this.source = source;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
