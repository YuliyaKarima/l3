package Snake;

public class DownDirection extends Direction {
    private boolean isActive = true;

    public void go(Snake snake, Field field) {
        while (isActive) {
            if (!field.isDownRightCorner(snake.getX() + 1, snake.getY())) {
                System.out.println("current position " + snake.getX() + " " + snake.getY());
                if (!field.isSnakeBodyNext(snake.getX() + 2, snake.getY())) {
                    field.fillCell(snake.getX(), snake.getY());
                    snake.moveVertical(snake.getX() + 1);
                } else {
                    if (!field.isSnakeBodyNext(snake.getX(), snake.getY() + 2)) {
                        isActive = false;
                        snake.turn(new LeftDirection());
                    }
                    else{
                        isActive = false;
                        snake.turn(new RightDirection());
                    }
                }
            } else {
                field.fillCell(snake.getX(), snake.getY());
                snake.moveVertical(snake.getX() + 1);
                isActive = false;
                snake.turn(new LeftDirection());
            }
        }
    }
}
