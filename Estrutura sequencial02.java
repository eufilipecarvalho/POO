import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        // Solicitar o valor do raio do círculo
        String input = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
        double raio = Double.parseDouble(input);

        // Calcular a área do círculo
        double area = Math.PI * Math.pow(raio, 2);

        // Exibir o resultado com quatro casas decimais
        String mensagem = String.format("A área do círculo é: %.4f", area);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
