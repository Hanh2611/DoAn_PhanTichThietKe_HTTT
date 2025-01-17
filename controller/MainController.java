package controller;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import view.MainFrame;

public class MainController implements MouseInputListener {
    private MainFrame frame;
    private JPanel PanelDangChon;

    public MainController(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        PanelDangChon = ((JPanel) e.getSource());
        ((JPanel) e.getSource()).setBackground(Color.decode("#6096B4"));
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() != PanelDangChon)
            ((JPanel) e.getSource()).setBackground(Color.decode("#6096B4"));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() != PanelDangChon)
            ((JPanel) e.getSource()).setBackground(Color.decode("#93BFCF"));
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
