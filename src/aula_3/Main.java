package aula_3;

public class Main {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");
            vetor.adiciona("elemento 6");
            vetor.adiciona("elemento 7");
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());

        System.out.println(vetor.busca(1));

        vetor.remove(2);

        System.out.println(vetor.busca1("elemento 1"));

        if (vetor.adicionaInicio(0, "Elemento 0") == true){
            System.out.println("Elemento Inserido com sucesso!");
        } else {
            System.out.println("Falha na inserção de dados!");
        }

        System.out.println("Quantidade de informações no vetor: " + vetor.tamanho());

        System.out.println("Conteúdo do vetor: " + vetor.toString());
    }
}