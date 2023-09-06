package estrutura_estatica;

public class Teste2 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

//        System.out.println("a fila esta vazia? " + fila.estaVazia());
//        System.out.println("qual o tamanho da fila? " + fila.tamanho());
//        System.out.println(fila.toString());

//        System.out.println(fila.espiar());
//
//        if(fila.espiar() == null){
//            System.out.println("ninguem na fila");
//       }else {
//            System.out.println("o elemento da primeira posição é " + fila.espiar());
//        }
        System.out.println(fila.toString());
        System.out.println(fila.desenfileira());
        System.out.println(fila.toString());
    }
}
