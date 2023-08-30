package estrutura_estatica;

public class Teste {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

//        for(int i =0; i<=15; i++){
//            pilha.empilha(i);
//         }
//        System.out.println(pilha);
//        System.out.println("tamanho da pilha: " + pilha.tamanho());

//        System.out.println(pilha.topo());
//
//        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);

        System.out.println("desempilhando elemento: " + pilha.desempilha());

        System.out.println(pilha);

//        System.out.println(pilha.topo());
//
//        System.out.println(pilha);


    }
}
