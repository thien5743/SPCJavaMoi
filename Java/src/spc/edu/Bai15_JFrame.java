/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class Bai15_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("vi du JFrame Don gian");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JPanel panel = new JPanel();
        JButton button = new JButton ("nhan toi!");
        panel.add (button);
        frame.add (panel);
        frame.setVisible(true); 
    }
}
