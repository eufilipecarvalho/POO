import javax.swing.JOptionPane;

public class ReajusteSalarial {
    public static void main(String[] args) {
        
        String salarioStr = JOptionPane.showInputDialog("Digite o salário atual do funcionário:");
        double salario = Double.parseDouble(salarioStr);

        
        double aumento = salario * 0.15;

        
        double salarioReajustado = salario + aumento;

        
        String mensagem = String.format(
            "Salário Antigo: R$ %.2f\nSalário Reajustado: R$ %.2f",
            salario, salarioReajustado
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
