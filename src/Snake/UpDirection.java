package Snake;

public class UpDirection extends Direction {
    private boolean isActive = true;

    public void go(Snake snake, Field field) {
        while (isActive) {
            if (!field.isUpLeftCorner(snake.getX() - 1, snake.getY())) {
                System.out.println("current position " + snake.getX() + " " + snake.getY());
                if (!field.isSnakeBodyNext(snake.getX() - 2, snake.getY())) {
                    field.fillCell(snake.getX(), snake.getY());
                    snake.moveVertical(snake.getX()-1);
                } else {
                    snake.turn(new RightDirection());
                    isActive = false;
                }
            } else {
                field.fillCell(snake.getX(), snake.getY());
                snake.moveVertical(snake.getX()-1);
                snake.turn(new RightDirection());
                isActive = false;
            }
        }
    }
}
