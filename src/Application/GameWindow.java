package Application;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private int width = 1024;
    private int height = 768;
    private int posX = 300;
    private int posY = 150;

    private JButton btnStart;
    private JButton btnExit;

    private JPanel mainToolsPanel;
    private JPanel settingPanel;

    private Map map;

    GameWindow() {

        prepareWindow();
        prepareToolsPanel();
        prepareButtons();
        prepareSettingsPanel();


        map = new Map();

        mainToolsPanel.add(settingPanel,BorderLayout.NORTH);

        add(mainToolsPanel, BorderLayout.EAST);
        add(map);

//        add(btnStart, BorderLayout.NORTH);
//        add(btnExit, BorderLayout.WEST);

//        setLayout(new GridLayout(3,5));
//
//        for (int i = 0; i < 15; i++) {
//            add(new JButton("Text#" + i));
//
//        }

        setVisible(true);

    }

    private void prepareWindow() {
        setSize(width, height);
        setLocation(posX, posY);
        setTitle("Application");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void prepareToolsPanel() {
        mainToolsPanel = new JPanel();
        mainToolsPanel.setBackground(Color.orange);
        mainToolsPanel.setLayout(new GridLayout(2,1));
    }

    private void prepareButtons() {
        btnStart = new JButton("Start game");
        btnExit = new JButton("End game");
    }

    private void prepareSettingsPanel() {
        settingPanel = new JPanel();
        mainToolsPanel.setBackground(Color.BLUE);
        settingPanel.setLayout(new GridLayout(4,1));

        settingPanel.add(btnStart);
        settingPanel.add(btnExit);

    }

}
