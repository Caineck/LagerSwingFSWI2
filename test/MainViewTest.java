import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.BorderLayout;
import java.awt.Component;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import mainview.MainView;

public class MainViewTest {

    private MainView view;
    private Component[] components;

    @BeforeEach
    void setUp() throws Exception {
        view = new MainView();
    }

    @Test
    void resources_vorhanden() {
        String imagePath = "images/add_180x180.png";
        Path path = Paths.get(imagePath);
        assertTrue(path.toFile().exists(), "Das Bild ist nicht vorhanden.");
    }

    @Disabled
    @Test
    void window_is_ready() {
        assertAll(
                () -> assertNotNull(view.getFrame()),
                () -> assertNotNull(view.getMainPanel()),
                () -> assertTrue(view.getMainPanel().getLayout() instanceof BorderLayout),
                () -> assertNotNull(view.getTabbedPane()));
    }

    @Disabled
    @Test
    void check_menu_notNull() {
        assertNotNull(view.getMenuBar());
    }

    @Disabled
    @Test
    void check_starttab_notNull() {
        assertNotNull(view.getStartTab());
    }

    @Disabled
    @Test
    void check_statusleiste_notNull() {
        assertNotNull(view.getStatusleiste());
    }

    @Disabled
    @Test
    void check_statusleiste_layout() {

        components = view.getStatusleiste().getComponents();

        assertAll(
                () -> assertNotNull(view.getStatusleiste()),
                () -> assertEquals(2, components.length),
                () -> assertTrue(components[0] instanceof JSeparator),
                () -> assertTrue(components[1] instanceof JPanel));
    }

    @Disabled
    @Test
    void check_menuBar_layout() {

        components = view.getMenuBar().getComponents();

        assertAll(
                () -> assertNotNull(view.getMenuBar()),
                () -> assertEquals(3, components.length),
                () -> assertTrue(components[0] instanceof JMenu),
                () -> assertTrue(((JMenu) components[0]).getText().equals("File"), "File Menu fehlt"),
                () -> assertTrue(components[1] instanceof JMenu),
                () -> assertTrue(((JMenu) components[1]).getText().equals("Edit"), "Edit Menu fehlt"),
                () -> assertTrue(components[2] instanceof JMenuItem),
                () -> assertTrue(((JMenu) components[2]).getText().equals("Help"), "Help Menu fehlt"));
    }
}