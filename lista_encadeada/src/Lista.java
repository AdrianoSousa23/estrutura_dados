import lista.ListaEncadeada;

public class Lista {

    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("tamanho da  lista = " + lista.getTamanho());

//        lista.adiciona("Claudio");
//
//        System.out.println(lista);
//        System.out.println("tamanho da lista = " + lista.getTamanho());
//        System.out.println("inicio da lista = " + lista.getInicio().getElemento());
//        System.out.println("fim da lista = " + lista.getFim().getElemento());

        lista.adiciona("Camila");
        lista.adiciona("adriano");
        lista.adiciona("miguel");
        lista.adiciona("debora");


        System.out.println(lista);
        System.out.println("tamanho da lista = " + lista.getTamanho());
        System.out.println("inicio da lista = " + lista.getInicio().getElemento());
        System.out.println("fim da lista = " + lista.getFim().getElemento());

        System.out.println("elemento na posição 2 = " + lista.get(2).getElemento());
    }
}