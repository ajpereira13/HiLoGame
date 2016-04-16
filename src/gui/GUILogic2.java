package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUILogic2 implements ItemListener {
	JPanel cards; //a panel that uses CardLayout
    final static String MAINPANEL = "Main Menu";
    final static String GAMEPANEL = "Hi Lo Game";
    
    public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel comboBoxPane = new JPanel(); //use FlowLayout
        String comboBoxItems[] = { MAINPANEL, GAMEPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
        //cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        
        //Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(new JButton("# Guesses"));
        card1.add(new JButton("Quit"));
        card1.add(new JButton("New Game"));
        
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Enter your guess in the text box below."));
        card2.add(new JTextField("Enter your guess here.", 20));
        card2.add(new JButton("Guess"));
        
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, MAINPANEL);
        cards.add(card2, GAMEPANEL);
        
        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        GUILogic2 demo = new GUILogic2();
        demo.addComponentToPane(frame.getContentPane());
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
