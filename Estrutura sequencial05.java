import javax.swing.JOptionPane;

public class CalculoDesconto {
    public static void main(String[] args) {
        
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");

        
        String valorProdutoStr = JOptionPane.showInputDialog("Digite o valor do produto:");
        double valorProduto = Double.parseDouble(valorProdutoStr);

        
        String descontoStr = JOptionPane.showInputDialog("Digite o percentual de desconto (em %):");
        double percentualDesconto = Double.parseDouble(descontoStr);

        
        double valorDesconto = valorProduto * (percentualDesconto / 100);

        
        double valorComDesconto = valorProduto - valorDesconto;

        
        String mensagem = String.format(
            "Produto: %s\nValor Original: R$ %.2f\nValor com Desconto: R$ %.3f",
            nomeProduto, valorProduto, valorComDesconto
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
