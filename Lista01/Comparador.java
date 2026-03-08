public class Comparador {

    //Função de comparar 
    public static boolean compararVetores(int[] vetor1, int[] vetor2) {
        //Passo 1: Comparar o tamanho dos Vetores(caixas)
        // Se (if) o tamanho da caixa for diferente já encerra o programa 
        if (vetor1.length != vetor2.length) {
            return false;

        }  
        //Passo 2: olhar cada divisão dentro da caixa
        //Então, vou escolher uma caixa para olhar todos itens e comparar entre elas
        for(int i = 0; i < vetor1.length; i++) {

            //Se o item 'i' do Vetor 1(caixa 1) for diferente do item 'i' do Vetor 2(caixa 2)
            //retorna falso
            if (vetor1[i] != vetor2[i]) {
                return false;
            }   
        } 
        
        //Passo 3: Passou em todos os testes e são iguais
        return true;
    }

    // O INTERRUPTOR PRINCIPAL
    public static void main(String[] args) {       
        //---- TESTANDO CASO 1 ----
        int[] c1Vetor1 = {1, 2, 3};
        int[] c1Vetor2 = {1, 2, 3};
        
        System.out.println("---- CASO 1 ---- ");
        System.out.println("Resultado: " + compararVetores(c1Vetor1, c1Vetor2));

        //---- TESTANDO CASO 2 ----
        int[] c2Vetor1 = {1, 2};
        int[] c2Vetor2 = {1, 2, 3};

        System.out.println("\n---- CASO 2 ---- ");
        System.out.println("Resultado: " + compararVetores(c2Vetor1, c2Vetor2));

        //---- TESTANDO CASO 3----
        int[] c3Vetor1 = {3, 2, 1};
        int[] c3Vetor2 = {1, 2, 3};
        
        System.out.println("\n---- CASO 3 ---- ");
        System.out.println("Resultado: " + compararVetores(c3Vetor1, c3Vetor2));
    } 
}


