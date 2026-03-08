public class AnalisadorDeVetor {

    // Função que analisa um vetor e imprime métricas de paridade e positividade
    public static void analisarVetor(int[] vetor) {
        
        int qtdPares = 0;
        int qtdImpares = 0;
        int qtdPositivos = 0;

        for (int i = 0; i < vetor.length; i++) {
            
            // Verificação de Paridade 
            if (vetor[i] % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }

            // Verificação de valor positivo (maior que zero)
            if (vetor[i] > 0) {
                qtdPositivos++;
            }
        }

        // Impressão dos resultados com o mesmo espaçamento da imagem do professor
        System.out.println("Resultado:");
        System.out.println("        Pares: " + qtdPares);
        System.out.println("        Ímpares: " + qtdImpares);
        System.out.println("        Positivos: " + qtdPositivos);
    }

    // Método principal de execução
    public static void main(String[] args) {
        
        // --- TESTANDO O CASO 1 ---
        int[] vetorCaso1 = {1, 2, 3};
        System.out.println("Caso 1:");
        // Imprimindo o formato direto no texto, sem precisar da ferramenta Arrays!
        System.out.println("Vetor: [1, 2, 3]"); 
        analisarVetor(vetorCaso1);
        
        // --- TESTANDO O CASO 2 ---
        int[] vetorCaso2 = {10, 20, 30, -1, -2, -3};
        System.out.println("\nCaso 2:");
        System.out.println("Vetor: [10, 20, 30, -1, -2, -3]");
        analisarVetor(vetorCaso2);

        // --- TESTANDO O CASO 3 ---
        int[] vetorCaso3 = {1, 1, 1};
        System.out.println("\nCaso 3:");
        System.out.println("Vetor: [1, 1, 1]");
        analisarVetor(vetorCaso3);
    }
}

