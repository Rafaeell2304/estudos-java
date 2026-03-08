public class Fatorial {
    //começo da função fatorial
    public static int calcularFatorial(int numero) {

        //1. O "SEGURANÇA" DA PORTA (A condição 'if')
        if (numero < 0) {
            return -1;
        }
        //2. SE passou pela condição faz a conta normal
        int resultado = 1;

        // contador do programa
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;

        }

        // Entrega do valor final da função
        return resultado;

    } 
    // O Interruptor principal
    public static void main(String[] args) {
        
        // caso 1
        int entrada1 = 3;
        System.out.println("---- Caso 1 ----");
        System.out.println("Parâmetro de entrada: " + entrada1);
        System.out.println("Resultado Retornado: " + calcularFatorial(entrada1));

        // caso 2
        int entrada2 = 5;
        System.out.println("\n---- Caso 2 ----");
        System.out.println("Parâmetro de entrada: " +entrada2);
        System.out.println("Resultado Retornado: " + calcularFatorial(entrada2));

        // caso 3
        int entrada3 = -10;
        System.out.println("\n---- Caso 3 ----");
        System.out.println("Parâmetro de entrada: " + entrada3);
        System.out.println("Resultado retornado: " + calcularFatorial(entrada3));

    }
}




