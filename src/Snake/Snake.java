package Snake;

import java.util.*;

public class Snake {
    private int x;
    private int y;
    private Direction currentDirection;
    private Field field;

    public Snake(int x, int y, Direction currentDirection, Field field) {
        this.x = x;
        this.y = y;
        this.currentDirection = currentDirection;
        this.field = field;
    }

    public void go() {
        currentDirection.go(this, field);
    }

    public void turn(Direction direction) {
        setCurrentDirection(direction);
        currentDirection.go(this, field);
    }

    public void printPath() {
        field.print();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveHorizontal(int y) {
       this.y = y;
    }

    public void moveVertical(int x) {
        this.x = x;
    }


    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }
}
