package com.theironyard;

/**
 * Created by ericweidman on 3/29/16.
 */
public class Room {


    int row;
    int col;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;

    public Room(int row, int col) {
        this.col = col;
        this.row = row;
    }
}
