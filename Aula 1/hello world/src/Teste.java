public class Teste {
    public static void main(String[] args) throws Exception {

        //Numeros
        int inteiro = 1;              // 4 bytes
        long numeroGrande = 2;       // 8 bytes

        float decimais = 3.14f;                     // 4 bytes
        double decimaisGrandes = 3.14159265359;    // 8 bytes

        //Logico
        boolean verdadeiro = true;    
        boolean falso = false;       

        //Textual
        char letra = 'a';                   // 2 bytes, aspas simples
        String texto = "Ola, mundo!";      // 2 bytes por caractere, aspas duplas, letra maiuscula pois é um char vetor atributo externo
       
        Aluno teste;                      // TAD -> Type abstract Data, é um tipo de dado abstrato, ou seja, é uma classe que representa um objeto do mundo real, nesse caso, um aluno.
        class Aluno {
            String nome;
            int idade;

        //Estrutra de Decisao

        //Decisao Simples
        if (verdadeiro) {
           //Bloco True
        } 
        
        //Decisao Composta
        if (verdadeiro){
          //Bloco True
        }else{
         //Bloco False
        }

        //Operador de Decisao Composta
        String msg = ( nota >= 7 ) ? "Aprovado" : "Reprovado"; //Operador Ternário, é uma forma de escrever uma decisao composta em uma unica linha, onde a primeira parte é a condicao, a segunda parte é o valor retornado se a condição for verdadeira e a terceira parte é o valor retornado se a condição for falsa.
        System.out.println(msg);

        //Operadores
        // + - / * %
        // < <= == !=
        // && || !
        boolean teste = true;
        teste = !teste; //Negacao, inverte o valor logico da variavel teste, se for true passa a ser false e vice-versa.

        //Estrutura de repeticao
        int x = 5;
        //Pre-testada
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        //Pos-testada
        do {
            System.out.println(x);
            x++;
        } while (x < 10);

        //Repeticao Controlada
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        int numeros[] = {1, 2, 3, 4, 5};
        for ( int n : mumeros) {            //foreach, é uma forma de percorrer um vetor ou uma lista, onde a variavel n recebe o valor de cada elemento do vetor numeros a cada iteracao.
            System.out.println(n);
        }

        public void somar(int a, int b) {
            System.out.println();
        }

        

    }
}
