package mainview;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("unused")
public class MainView {

    private JFrame frame;
    private JPanel mainPanel;
    private JMenuBar menuBar;
    private JTabbedPane tabbedPane;
    private JPanel bottomPanel;

    public MainView() {

    }

    public void showApp() {
        frame.setVisible(true);
    }

    public JPanel getStartTab() {
        return null;
    }

    public JMenuBar getMenuBar() {
        return null;
    }

    public JPanel getStatusleiste() {
        return null;
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