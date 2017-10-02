package Snake;

public class RightDirection extends Direction {
    private boolean isActive = true;

    public void go(Snake snake, Field field) {

        while (isActive) {
            if (!field.isUpRightCorner(snake.getX(), snake.getY() + 1)) {
                System.out.println("current position " + snake.getX() + " " + snake.getY());
                if (!field.isSnakeBodyNext(snake.getX(), snake.getY() + 2)) {
                    field.fillCell(snake.getX(), snake.getY());
                    snake.moveHorizontal(snake.getY() + 1);
                } else {
                    if(!field.isSnakeBodyNext(snake.getX()+2, snake.getY())) {
                        snake.turn(new DownDirection());
                        isActive = false;
                    }
                    else{
                        field.fillCell(snake.getX(), snake.getY());
                        return;
                    }
                }
            } else {
                System.out.println("current position " + snake.getX() + " " + snake.getY());
                field.fillCell(snake.getX(), snake.getY());
                snake.moveHorizontal(snake.getY()+1);
                snake.turn(new DownDirection());
                isActive = false;
            }
        }
    }
}
