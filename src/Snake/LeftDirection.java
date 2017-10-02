package Snake;

public class LeftDirection extends Direction {
    private boolean isActive = true;

    public void go(Snake snake, Field field) {
        while (isActive) {
            if (!field.isDownLeftCorner(snake.getX(), snake.getY() - 1)) {
                System.out.println("current position " + snake.getX() + " " + snake.getY());
                if (!field.isSnakeBodyNext(snake.getX(), snake.getY() - 2)) {
                    field.fillCell(snake.getX(), snake.getY());
                    snake.moveHorizontal(snake.getY() - 1);
                } else {
                    if (!field.isSnakeBodyNext(snake.getX() - 2, snake.getY())) {
                        snake.turn(new UpDirection());
                        isActive = false;
                    } else {
                        field.fillCell(snake.getX(), snake.getY());
                        return;
                    }
                }
            } else {
                field.fillCell(snake.getX(), snake.getY());
                snake.moveHorizontal(snake.getY() - 1);
                snake.turn(new UpDirection());
                isActive = false;
            }
        }
    }
}
