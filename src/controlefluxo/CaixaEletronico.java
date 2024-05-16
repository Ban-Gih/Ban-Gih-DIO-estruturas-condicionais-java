package controlefluxo;
public class CaixaEletronico {
    public static void caixaeletronico(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }else
            System.out.println("Saldo insuficiente");
        
    }
}
