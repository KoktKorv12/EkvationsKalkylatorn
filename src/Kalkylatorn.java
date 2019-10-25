import javax.swing.*;
import java.util.Scanner;

public class Kalkylatorn {
    public static void main(String[] args) {
        {
            int ekvation = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange ekvationens grad?"));
            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på a?"));
            int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på b?"));
            int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på c?"));
            int potens = Integer.parseInt(JOptionPane.showInputDialog(null, "Potens?"));

            if (ekvation == 0) {
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "a?"));
                JOptionPane.showMessageDialog(null, a);
            } else if (ekvation == 1) {
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på a?"));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på b?"));
            } else if (ekvation == 2) {
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på a?"));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på b?"));
                c = Integer.parseInt(JOptionPane.showInputDialog(null, "Värde på c?"));
            }

        }
    }
}
