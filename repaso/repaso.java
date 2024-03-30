package repaso;

import javax.swing.JOptionPane;

public class repaso {

    public static void main(String[] args) {
        String numero1, numero2;

        numero1 = JOptionPane.showInputDialog(null, "Digite el primer número");
        numero2 = JOptionPane.showInputDialog(null, "Digite el segundo número");

        // Convertir los números ingresados de String a int
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        int totalSuma = num1 + num2;

        JOptionPane.showMessageDialog(null, "El total de la suma es: " + totalSuma);

        // Crear una instancia de la clase resta
        resta restador = new resta();
        restador.realizarResta();
    }

    public static class resta {

        public void realizarResta() {
            String numero3, numero4;
            int totalSumas;

            numero3 = JOptionPane.showInputDialog(null, "Digite el primer número");
            numero4 = JOptionPane.showInputDialog(null, "Digite el segundo número");

            // Convertir los números ingresados de String a int
            int num3 = Integer.parseInt(numero3);
            int num4 = Integer.parseInt(numero4);

            totalSumas = num3 - num4;

            JOptionPane.showMessageDialog(null, "El total de la resta es: " + totalSumas);
        }
    }
}
