import javax.swing.*;

/**
 * Created by infuntis on 28/11/2023.
 */

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        GameField gameField = new GameField();

        // Пример изменения скорости на 150 миллисекунд (6.67 кадров в секунду)
        gameField.setTimerDelay(60);

        add(gameField);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
