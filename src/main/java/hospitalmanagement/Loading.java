package hospitalmanagement;

import javax.swing.*;
import java.awt.*;

public class Loading {
    private JLabel l1;
    private JPanel p1;
    private JFrame f1 = new JFrame("Login Page");
    private JProgressBar progressBar;

    Loading() {
        // Frame settings
        f1.setSize(1200, 700);
        f1.getContentPane().setBackground(Color.BLACK);
        f1.setLayout(null);
        
        l1 = new JLabel("Loading...  Please Wait");
        l1.setBounds(510, 220, 200, 120);
        l1.setFont(new Font("Cambria",Font.PLAIN,20));
        l1.setForeground(Color.WHITE);

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true); // Show percentage

        // Set size and position of the progress bar
        int progressBarWidth = 400;
        int progressBarHeight = 30;
        int xPosition = (f1.getWidth() - progressBarWidth) / 2;
        int yPosition = (f1.getHeight() - progressBarHeight) / 2;
        progressBar.setBounds(xPosition, 300, progressBarWidth, progressBarHeight);
        progressBar.setForeground(Color.WHITE);
        progressBar.setBackground(Color.BLACK);
        

        // Add objects to the Frame
        f1.add(progressBar);
        f1.add(l1);

        // Frame settings 2.0
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // tsak to the progress bar
        new Thread(new Task()).start();
    }

    private class Task implements Runnable {
        public void run() {
            for (int i = 0; i <= 100; i++) {
                final int currentProgress = i;
                try {
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            progressBar.setValue(currentProgress);
                        }
                    });
                    Thread.sleep(40); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (progressBar.getValue() == 100) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        f1.dispose();
                        new MainUi();
                        JOptionPane.showMessageDialog(f1, "You have successfully logged in");
                    }
                });
            }
        }
    }
}
