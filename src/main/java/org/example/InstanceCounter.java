package org.example;
import javax.swing.*;

public class InstanceCounter extends JFrame {

    private static int instanceCount = 0;

    public InstanceCounter() {

        super("Instance Counter");
        instanceCount++;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Экземпляров создано: " + instanceCount);
        panel.add(label);
        add(panel);

        setVisible(true);
    }
}