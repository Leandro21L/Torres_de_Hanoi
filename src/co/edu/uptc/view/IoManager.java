package co.edu.uptc.view;

import javax.swing.*;

public class IoManager {

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public int readInt(String message) {
        int option = 0;
        try {
            option = Integer.parseInt(JOptionPane.showInputDialog(message));
        } catch (NumberFormatException exception) {
            showMessage("Tiene que ingresar un numero");
        }
        return option;
    }

    public double readDouble(String message) {
        double number = 0;
        try {
            number = Double.parseDouble(JOptionPane.showInputDialog(message));
        } catch (NumberFormatException e) {
            showMessage("Tiene que ingresar un numero.");
            readDouble(message);
        } catch (NullPointerException e) {
            showMessage("Adios.");
        }
        return number;
    }

    public short readShort(String message) {
        short number = 0;
        try {
            number = Short.parseShort(JOptionPane.showInputDialog(message));
        } catch (NumberFormatException e) {
            showMessage("Tiene que ingresar un numero.");
            readShort(message);
        }
        return number;
    }

    public String readString(String message) {
        return JOptionPane.showInputDialog(message);
    }

}