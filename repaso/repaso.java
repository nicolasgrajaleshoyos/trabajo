package repaso;

import javax.swing.JOptionPane;

public class repaso {

    public static void main(String[] args) {
        String numero1, numero2;
        int totalSuma;

        numero1 = JOptionPane.showInputDialog(null, "Digite el primer número");
        numero2 = JOptionPane.showInputDialog(null, "Digite el segundo número");

        // Convertir los números ingresados de String a int
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        totalSuma = num1 + num2;

        JOptionPane.showMessageDialog(null, "El total de la suma es: " + totalSuma);
    }
}
