import javax.swing.*;

public class TabExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is Tab 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is Tab 2"));

        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
