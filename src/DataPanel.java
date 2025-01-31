import javax.swing.*;

public class DataPanel {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);
    }
}

