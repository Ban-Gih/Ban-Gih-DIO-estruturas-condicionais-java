package controlefluxo;
public class ResultadoEscolar {
    public static void resultadoescolar(String[] args) {
        /* int nota = 6;
        
        if (nota >= 7)
            System.out.println("Aprovado");
            
        else
        System.out.println("Reprovado"); */


        //------------------------------------------------------------


        /* int nota = 8;
        
        if (nota >= 7)
            System.out.println("aprovado");
        
        else if (nota >= 5 && nota < 7)
            System.out.println("recuparação");
        
        else
            System.out.println("reprovado"); */
            
        //--------------------------------------------------

        int nota = 8;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuparação" : "Reprovado";

        System.out.println(resultado);
    }
}
