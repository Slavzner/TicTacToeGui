package com.tictactoe.gui.game.gameframe;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

    //    private JLabel ;
//    private JButton ;
//    private JButton ;
//    public GameFrame(String MainTitle) {
//        super(MainTitle);
//        init();
//        setSize(SizeX, SizeY);
//        setVisible(true);
//        setResizable(false); //disable resizing
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       // JOptionPane.showMessageDialog(this, "Draw!"); //message dialog:)
//    }
    public class GameFrame extends JFrame {

        public static void initFrame() {

            JFrame frame = new JFrame("Tic Tac Toe v1.0");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Font font = new Font("Arial", Font.BOLD, 14);

            JMenuBar menuBar = new JMenuBar();

            JMenu fileMenu = new JMenu("File");
            fileMenu.setFont(font);

            JMenu newMenu = new JMenu("New");
            newMenu.setFont(font);
            fileMenu.add(newMenu);

            JMenuItem txtFileItem = new JMenuItem("Text file");
            txtFileItem.setFont(font);
            newMenu.add(txtFileItem);

            JMenuItem imgFileItem = new JMenuItem("Image file");
            imgFileItem.setFont(font);
            newMenu.add(imgFileItem);

            JMenuItem folderItem = new JMenuItem("Folder");
            folderItem.setFont(font);
            newMenu.add(folderItem);

            JMenuItem openItem = new JMenuItem("Open");
            openItem.setFont(font);
            fileMenu.add(openItem);

            JMenuItem closeItem = new JMenuItem("Close");
            closeItem.setFont(font);
            fileMenu.add(closeItem);

            JMenuItem closeAllItem = new JMenuItem("Close all");
            closeAllItem.setFont(font);
            fileMenu.add(closeAllItem);

            fileMenu.addSeparator();

            JMenuItem exitItem = new JMenuItem("Exit");
            exitItem.setFont(font);
            fileMenu.add(exitItem);

            exitItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            menuBar.add(fileMenu);

            frame.setJMenuBar(menuBar);

            frame.setPreferredSize(new Dimension(400, 400));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setResizable(false);
        }
    }