public class Inversor {

    // Função que inverte um número inteiro
    public static int inverterNumero(int numero) {
        
        // 1. Analisador: Verifica se o número é negativo
        // Caso seja negativo, retorna o próprio número e encerra a execução
        if (numero < 0) {
            return numero;
        }

        // 2. Variável que armazenará o número invertido
        int invertido = 0;

        // 3. Laço de repetição: Continua processando enquanto o número for maior que zero
        while (numero > 0) {
            
            // Extrai o último dígito do número atual (resto da divisão por 10)
            int ultimoDigito = numero % 10; 
            
            // Desloca os dígitos já invertidos para a esquerda e adiciona o novo dígito
            invertido = (invertido * 10) + ultimoDigito; 
            
            // Remove o último dígito do número original (divisão inteira por 10)
            numero = numero / 10; 
        }

        // Retorna o resultado final invertido
        return invertido;
    }

    // Método principal de execução
    public static void main(String[] args) {
        
        // --- TESTANDO O CASO 1 ---
        int entrada1 = 789;
        System.out.println("---- Caso 1 ----");
        System.out.println("Parâmetro de entrada: " + entrada1);
        System.out.println("Resultado: " + inverterNumero(entrada1));

        // --- TESTANDO O CASO 2 ---
        int entrada2 = 1005;
        System.out.println("\n---- Caso 2 ----");
        System.out.println("Parâmetro de entrada: " + entrada2);
        System.out.println("Resultado: " + inverterNumero(entrada2));

        // --- TESTANDO O CASO 3 ---
        int entrada3 = -20;
        System.out.println("\n---- Caso 3 ----");
        System.out.println("Parâmetro de entrada: " + entrada3);
        System.out.println("Resultado: " + inverterNumero(entrada3));
    }
}