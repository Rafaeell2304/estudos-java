public class ContadorDeOcorrencias {

    // Função que conta quantas vezes um número 'alvo' aparece em um 'vetor'
    public static int contarOcorrencias(int[] vetor, int alvo) {
        
        int quantidade = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alvo) {
                quantidade++;
            }
        }

        return quantidade;
    }

    // Método principal de execução
    public static void main(String[] args) {
        
        // --- TESTANDO O CASO 1 ---
        int[] vetorCaso1 = {1, 2, 3, 3, 2, 5, 6, 7};
        int parametro1 = 7;
        
        System.out.println("Caso 1:");
        System.out.println("Vetor: [1, 2, 3, 3, 2, 5, 6, 7]");
        System.out.println("Parâmetro: " + parametro1);
        System.out.println("Resultado: " + contarOcorrencias(vetorCaso1, parametro1));

        // --- TESTANDO O CASO 2 ---
        int[] vetorCaso2 = {1, 2, 3, 3, 2, 5, 6, 7};
        int parametro2 = 70; // Testando um número que não existe no vetor
        
        System.out.println("\nCaso 2:");
        System.out.println("Vetor: [1, 2, 3, 3, 2, 5, 6, 7]");
        System.out.println("Parâmetro: " + parametro2);
        System.out.println("Resultado: " + contarOcorrencias(vetorCaso2, parametro2));

        // --- TESTANDO O CASO 3 ---
        int[] vetorCaso3 = {1, 2, 3, 3, 2, 5, 6, 7, 8, -9, -7, 4, -8};
        int parametro3 = 3;
        
        System.out.println("\nCaso 3:");
        System.out.println("Vetor: [1, 2, 3, 3, 2, 5, 6, 7, 8, -9, -7, 4, -8]");
        System.out.println("Parâmetro: " + parametro3);
        System.out.println("Resultado: " + contarOcorrencias(vetorCaso3, parametro3));
    }
}

