package mainview;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;

@SuppressWarnings("unused")
public class MainView {

    private JFrame frame;
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;

    public MainView() {
        frame = new JFrame("Your Swing Application");
        mainPanel = new JPanel(new BorderLayout());
        tabbedPane = new JTabbedPane();

        frame.add(mainPanel);

        JMenuBar localJMenuBar = getMenuBar();
        mainPanel.add(localJMenuBar, BorderLayout.NORTH);

        JPanel localBottomPanel = getStatusleiste();
        mainPanel.add(localBottomPanel, BorderLayout.SOUTH);

        JPanel localStartTab = getStartTab();
        tabbedPane.addTab("Start", localStartTab);
        mainPanel.add(tabbedPane, BorderLayout.CENTER);
    }

    public void showApp() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocation(10, 10);
        frame.setVisible(true);
    }

    public JPanel getStartTab() {
        JPanel startTab = new JPanel(new GridLayout(2, 2));
        startTab.add(new JButton(new ImageIcon("images/add_180x180.png")));
        startTab.add(new JButton("0,1"));
        startTab.add(new JButton("1,0"));
        startTab.add(new JButton("1,1"));
        return startTab;
    }

    public JMenuBar getMenuBar() {
        final JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("Close"));
        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Delete"));
        JMenu helpMenu = new JMenu("Help");
        helpMenu.add(new JMenuItem("About"));
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        return menuBar;
    }

    public JPanel getStatusleiste() {
        final JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.add(new JSeparator());
        JPanel hbox = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hbox.add(new JLabel("Anzahl Datensätze:"));
        hbox.add(new JLabel("0"));
        hbox.add(Box.createHorizontalGlue());
        hbox.add(new JLabel("xx.xx.xxxx"));
        bottomPanel.add(hbox);
        return bottomPanel;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }
}