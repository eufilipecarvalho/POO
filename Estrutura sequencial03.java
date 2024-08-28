import javax.swing.JOptionPane;

public class CalculoSalario {
    public static void main(String[] args) {
       
        String horasTrabalhadasStr = JOptionPane.showInputDialog("Digite o número de horas trabalhadas:");
        double horasTrabalhadas = Double.parseDouble(horasTrabalhadasStr);

        String valorPorHoraStr = JOptionPane.showInputDialog("Digite o valor recebido por hora:");
        double valorPorHora = Double.parseDouble(valorPorHoraStr);

        
        double salario = horasTrabalhadas * valorPorHora;

        String mensagem = String.format("O salário do funcionário é: R$ %.2f", salario);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
