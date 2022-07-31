package practical10;

import javax.swing.*;

public class SortDriver {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sorting Algorithms");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);
        frame.setResizable(false);

        SortPanel panel = new SortPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
