package com.example.classicalgames.models;

public class MineSquare {
    private int x;
    private int y;
    private int number_of_mine_around;
    private boolean isMine;
    private boolean isFlag;
    private boolean isMarkedUnknown;
    private boolean isRevealed;
    private boolean isBlank;

    public MineSquare() {
    }

    public MineSquare(int x, int y, int number_of_mine_around, boolean isMine, boolean isFlag, boolean isMarkedUnknown, boolean isRevealed, boolean isBlank) {
        this.x = x;
        this.y = y;
        this.number_of_mine_around = number_of_mine_around;
        this.isMine = isMine;
        this.isFlag = isFlag;
        this.isMarkedUnknown = isMarkedUnknown;
        this.isRevealed = isRevealed;
        this.isBlank = isBlank;
    }
    public MineSquare(int x, int y, boolean isFlag, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
        this.isFlag = isFlag;
    }

    public MineSquare(int x, int y, int number_of_mine_around, boolean isMine, boolean isFlag) {
        this.x = x;
        this.y = y;
        this.number_of_mine_around = number_of_mine_around;
        this.isMine = isMine;
        this.isFlag = isFlag;
    }

    public boolean isBlank() {
        return isBlank;
    }

    public void setBlank(boolean blank) {
        isBlank = blank;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
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

    public int getNumber_of_mine_around() {
        return number_of_mine_around;
    }

    public void setNumber_of_mine_around(int number_of_mine_around) {
        this.number_of_mine_around = number_of_mine_around;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    public boolean isMarkedUnknown() {
        return isMarkedUnknown;
    }

    public void setMarkedUnknown(boolean markedUnknown) {
        isMarkedUnknown = markedUnknown;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}
