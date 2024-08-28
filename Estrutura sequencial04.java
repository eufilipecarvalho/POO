import javax.swing.JOptionPane;
import java.time.Year;

public class CalculoIdade {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");

        
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o seu ano de nascimento:");
        int anoNascimento = Integer.parseInt(anoNascimentoStr);

        
        int anoAtual = Year.now().getValue(); 
        int idade = anoAtual - anoNascimento;

        
        String mensagem = String.format("Você se chama %s e possui %d anos de idade!", nome, idade);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
