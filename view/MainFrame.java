package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {
    public MainFrame() {
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.init();
    }

    private void init() {
        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 300, 800);
        leftPanel.setBackground(Color.white);
        leftPanel.setLayout(null);
        this.add(leftPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(300, 0, 900, 800);
        rightPanel.setLayout(null);
        this.add(rightPanel);

        Color MainColor = Color.decode("#6096B4");

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setBackground(MainColor);
        titlePanel.setBounds(0, 0, 300, 100);

        JLabel metroLabel = new JLabel("<html><div style='text-align: center;'>QUẢN LÝ VẬN HÀNH<br>METRO</div></html>");
        metroLabel.setForeground(Color.white);
        metroLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        metroLabel.setBounds(30, 15, 270, 80);

        titlePanel.add(metroLabel);
        leftPanel.add(titlePanel);

        JPanel ChucNangPanel = new JPanel();
        ChucNangPanel.setBackground(Color.decode("#BDCDD6"));
        ChucNangPanel.setBounds(0, 100, 300, 700);
        ChucNangPanel.setLayout(null);
        leftPanel.add(ChucNangPanel);

        JPanel DangXuatPanel = new JPanel();
        DangXuatPanel.setBounds(10, 560, 280, 80);
        DangXuatPanel.setLayout(null);
        DangXuatPanel.setBackground(Color.decode("#93BFCF"));
        ChucNangPanel.add(DangXuatPanel);

        JLabel DangXuatLabel = new JLabel("ĐĂNG XUẤT");
        DangXuatLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        // DangXuatLabel.setForeground(Color.white);
        DangXuatLabel.setBounds(80, 22, 160, 30);
        DangXuatPanel.add(DangXuatLabel);

        ImageIcon iconDangXuat = new ImageIcon(
                new ImageIcon("./img/previous.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        JLabel DangXuatIcon = new JLabel(iconDangXuat, JLabel.CENTER);
        DangXuatIcon.setForeground(Color.white);
        DangXuatIcon.setBounds(20, 20, 40, 40);

        DangXuatPanel.add(DangXuatIcon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
