package practical10;// Sorting Application
// Author: Carl Mooney

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortPanel extends JPanel implements ActionListener {

    private final int pauseInterval = 5000; // ms larger number slower animation
    private String[] getOriginalItems = new String[10];
    private boolean boo = false;
    private void bubbleSort() {
        showStatus("Sorting ...");
        boolean swap = true;
        int count = 0;
        int term = 1;
        while (swap) {
            swap = false;
            for (int i = 0; i < items.length - term; i++) {
                if (greaterThan(items[i + 1], items[i])) {
                    swapItems(items[i], items[i + 1]);
                    swap = true;
                    count++;
                }
            }//for
            term++;
        } // while
        showStatus("Sort complete, number of swaps = " + count);
    } // bubbleSort

    private void selectionSort() {
        showStatus("Sorting ...");
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            int min = i;
            for (int j = i + 1; j < items.length; j++) {
                if (Integer.parseInt(items[j].getText()) < Integer.parseInt(items[min].getText())) {
                    min = j;
                }
            }
            swapItems(items[i], items[min]);
            count++;
        }
        showStatus("Sorting complete, number of swaps = " + count);
    }

    /**
     * Method that handles the button presses.
     *
     * @param e The ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Toggle" -> {
                if (!boo) {
                    boo = true;
                    btnSort.setText("Bubble");
                    System.out.println("toggled" + boo + btnSort.getText());
                }
                else {
                    boo = false;
                    btnSort.setText("Selection");
                    System.out.println("toggled" + boo + btnSort.getText());
                }
            }
            case "Bubble" -> {
                bubbleSort();
            }
            case "Reset" -> {
                setOriginalItems();
            }
            case "Selection" -> {
                selectionSort();
            }
            default -> showStatus("Unrecognised button: " + e);
        }
    }

    private void setOriginalItems() {
        int i = 0;
        for (TextField item : items) {
            item.setFont(font);
            item.setText(String.valueOf(getOriginalItems[i]));
            i++;
        }
    }

    private void initItems() {
        int i = 0;
        for (TextField item : items) {
            item.setFont(font);
            item.setText(String.valueOf((int) (Math.random() * 100)));
            getOriginalItems[i] = items[i].getText();
            i++;
        }
    }

    //////////////////////////////////////////////////////////////////////
    ///////////  You should not need to alter the code below ////////////
    /////////////////////////////////////////////////////////////////////

    private void assign(TextField to, TextField from) {
        Color tobg = to.getBackground();
        to.setBackground(Color.green);
        pause(pauseInterval);
        to.setText(from.getText());
        pause(pauseInterval);
        to.setBackground(tobg);
    }

    private void swapItems(TextField t1, TextField t2) {
        assign(tmp, t1);
        assign(t1, t2);
        assign(t2, tmp);
    }

    private boolean greaterThan(TextField t1, TextField t2) {
        boolean greater;
        Color t1bg = t1.getBackground();
        Color t2bg = t2.getBackground();
        t1.setBackground(Color.cyan);
        t2.setBackground(Color.cyan);
        pause(pauseInterval);
        greater = Integer.parseInt(t1.getText())
                > Integer.parseInt(t2.getText());
        pause(pauseInterval);
        t1.setBackground(t1bg);
        t2.setBackground(t2bg);
        return greater;
    }

    private void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            showStatus(e.toString());
        }
    }

    private void showStatus(String s) {
        status.setText(s);
    }

    public SortPanel() {
        init();
    }

    private void init() {
        font = new Font("Dialog", Font.PLAIN, 18);
        setLocation(600, 300);
        JPanel jp = new JPanel(new BorderLayout());
        jp.setPreferredSize(new Dimension(800, 200));
        jp.setBackground(Color.white);

        JPanel itemPanel = new JPanel();
        itemPanel.setBackground(Color.white);
        itemPanel.setLayout(new GridLayout(1, 17, 10, 5));
        itemPanel.setPreferredSize(new Dimension(800, 30));
        for (int i = 0; i < items.length; i++) {
            items[i] = new TextField(3);
            items[i].setPreferredSize(new Dimension(30, 40));
            itemPanel.add(items[i]);
        }
        initItems();
        itemPanel.add(new Label("Temp:")).setFont(font);
        tmp = new TextField(4);
        tmp.setPreferredSize(new Dimension(30, 40));
        tmp.setFont(font);
        tmp.setEditable(false);
        itemPanel.add(tmp);
        itemPanel.add(new Label(""))
                .setPreferredSize(new Dimension(380, 40));

        JPanel topBox = new JPanel();
        Box b = Box.createVerticalBox();
        topBox.setBackground(Color.white);
        b.add(Box.createRigidArea(new Dimension(0, 20)));
        b.add(itemPanel);
        topBox.add(b);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        btnSort = new JButton("Selection");
        btnReset = new JButton("Reset");
        btnToggle = new JButton("Toggle");
        btnSort.addActionListener(this);
        btnToggle.addActionListener(this);
        btnReset.addActionListener(this);
        buttonPanel.add(btnSort);
        buttonPanel.add(btnToggle);
        buttonPanel.add(btnReset);

        status = new Label("Waiting ... ");
        status.setPreferredSize(new Dimension(380, 40));
        status.setFont(font);
        JPanel statusPanel = new JPanel();
        statusPanel.setBackground(Color.white);
        statusPanel.add(status);

        jp.add(topBox, BorderLayout.NORTH);
        jp.add(buttonPanel, BorderLayout.CENTER);
        jp.add(statusPanel, BorderLayout.SOUTH);

        add(jp);

    }

    private final TextField[] items = new TextField[10];
    private final String[] originalItems = new String[10];
    private JButton btnSort, btnToggle, btnReset;
    private TextField tmp;
    private Label status;
    private Font font;
}
