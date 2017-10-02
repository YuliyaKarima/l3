package Snake;

import java.util.Scanner;

public class SnakeTest {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Snake snake = new Snake(0, 4, new RightDirection(), new Field(num));
        snake.go();
        snake.printPath();
    }
}

