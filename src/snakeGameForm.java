import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class snakeGameForm extends JFrame{

    private JPanel jpanel;
    private JTextArea taHIScore;
    private JButton btnStart;
    private JLabel lTest;

    BufferedReader br;

    public snakeGameForm() {
        try {
            this.setContentPane(jpanel);
            this.setSize(new Dimension(GamePanel.SCREEN_WIDTH, GamePanel.SCREEN_HEIGHT));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setTitle("Snake Game");
            this.setLocationRelativeTo(null);

            br = new BufferedReader(new FileReader("hiScore.txt"));

            taHIScore.setText(br.readLine());
            taHIScore.append("\n" + br.readLine());
            taHIScore.append("\n" + br.readLine());
            taHIScore.append("\n" + br.readLine());
            taHIScore.append("\n" + br.readLine());

            btnStart.addActionListener(e -> {
                this.dispose();
                new GameFrame();
            });

        } catch (Exception e) {

        }

    }
}
