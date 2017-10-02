package Snake;

public class Field {
    private int[][] field;

    public Field(int size) {
        field = new int[size][size];
    }

    public boolean isUpRightCorner(int a, int b) {
        return (a == 0 && b == (field.length - 1));
    }

    public boolean isDownRightCorner(int a, int b) {
        return (a == (field.length - 1) && b == (field.length - 1));
    }

    public boolean isDownLeftCorner(int a, int b) {
        return (a == (field.length - 1) && b == 0);
    }

    public boolean isUpLeftCorner(int a, int b) {
        return (a == 0 && b == 0);
    }

    public boolean isSnakeBodyNext(int a, int b) {
        return ((field[a][b]) == 1);
    }

    public void fillCell(int x, int y) {
        field[x][y] = 1;
    }

    public void print() {
        for (int i = 0; i < field.length; i++) {
            for (int z = 0; z < field.length; z++) {
                System.out.print(field[i][z]);
            }
            System.out.println();
        }
    }
}