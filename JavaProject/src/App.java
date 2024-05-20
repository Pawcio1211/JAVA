import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
        /*
         * Gra w wężą
         */
        snake2();
        //Minesweeper minesweeper = new Minesweeper();
    }

    static void snake() {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");

        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();

    }

    static void snake2(){
        int boardWidth = 600;
        int boardHeight = boardWidth;
        
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Snake snake = new Snake(boardHeight, boardWidth);
        frame .add(snake);
        frame.pack();
        snake.requestFocus();
    }
}
