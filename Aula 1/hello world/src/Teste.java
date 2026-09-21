public class Teste {
    public static void main(String[] args) throws Exception {

        //Números
        int inteiro = 1;              // 4 bytes
        long numeroGrande = 2;       // 8 bytes

        float decimais = 3.14f;                     // 4 bytes
        double decimaisGrandes = 3.14159265359;    // 8 bytes

        //Lógico
        boolean verdadeiro = true;    // 1 bit
        boolean falso = false;       // 1 bit

        //Textual
        char letra = 'a';                   // 2 bytes, aspas simples
        String texto = "Olá, mundo!";      // 2 bytes por caractere, aspas duplas, letra maiúscula pois é um char vetor atributo externo
       
        Aluno teste;                      // TAD -> Type abstract Data, é um tipo de dado abstrato, ou seja, é uma classe que representa um objeto do mundo real, nesse caso, um aluno.
        class Aluno {
            String nome;
            int idade;

        //Estrutra de Decisão

        //Decisão Simples
        if (verdadeiro) {
           //Bloco True
        } 
        
        //Decisão Composta
        if (verdadeiro){
          //Bloco True
        }else{
         //Bloco False
        }

        //Operador de Decisão Composta
        String msg = ( nota >= 7 ) ? "Aprovado" : "Reprovado"; //Operador Ternário, é uma forma de escrever uma decisão composta em uma única linha, onde a primeira parte é a condição, a segunda parte é o valor retornado se a condição for verdadeira e a terceira parte é o valor retornado se a condição for falsa.
        System.out.println(msg);

        //Operadores
        // + - / * %
        // < <= == !=
        // && || !
        boolean teste = true;
        teste = !teste; //Negação, inverte o valor lógico da variável teste, se for true passa a ser false e vice-versa.

        //Estrutura de repetição
        int x = 5;
        //Pré-testada
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        //Pós-testada
        do {
            System.out.println(x);
            x++;
        } while (x < 10);

        //Repetição Controlada
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        int numeros[] = {1, 2, 3, 4, 5};
        for ( int n : mumeros) {            //foreach, é uma forma de percorrer um vetor ou uma lista, onde a variável n recebe o valor de cada elemento do vetor numeros a cada iteração.
            System.out.println(n);
        }

        public void somar(int a, int b) {
            System.out.println();
        }

    }
}
