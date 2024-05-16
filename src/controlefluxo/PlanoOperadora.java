package controlefluxo;

public class PlanoOperadora {
    public static void planooperadora(String[] args) {
        String plano = "T";

        /* if (plano == "B") {
            System.out.println("100 min de ligação");
        } else if (plano == "M") {
            System.out.println("100 min de ligação");
            System.out.println("Whats e insta grátis");
        } else if (plano == "T") {
            System.out.println("100 min de ligação");
            System.out.println("Whats e insta grátis");
            System.out.println("5GB Youtube");
        } */

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whats e Insta grátis");
            }
            case "B": {
                System.out.println("100 min de ligação");
            }
        }
    }
}
