import javax.swing.*;

public class Teste {

    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        grafo.adicionarVertice("F");
        grafo.adicionarVertice("G");
        grafo.adicionarVertice("H");
        grafo.adicionarVertice("I");
        grafo.adicionarVertice("J");
        grafo.adicionarVertice("K");
        grafo.adicionarVertice("L");
        grafo.adicionarVertice("M");
        grafo.adicionarVertice("N");
        grafo.adicionarVertice("O");
        grafo.adicionarVertice("P");
        grafo.adicionarVertice("Q");
        grafo.adicionarVertice("R");
        grafo.adicionarVertice("S");
        grafo.adicionarVertice("T");
        grafo.adicionarVertice("U");
        grafo.adicionarVertice("V");
        grafo.adicionarVertice("X");
        grafo.adicionarVertice("X");



        grafo.adicionarAresta(300, "A", "B");
        grafo.adicionarAresta(47, "B", "C");
        grafo.adicionarAresta(62, "C", "D");
        grafo.adicionarAresta(8, "D", "E");
        grafo.adicionarAresta(13, "E", "F");
        grafo.adicionarAresta(230, "F", "G");
        grafo.adicionarAresta(454, "G", "H");
        grafo.adicionarAresta(138, "H", "I");
        grafo.adicionarAresta(153, "I", "J");
        grafo.adicionarAresta(512, "J", "K");
        grafo.adicionarAresta(135, "K", "L");
        grafo.adicionarAresta(50, "L", "M");
        grafo.adicionarAresta(187, "M", "N");
        grafo.adicionarAresta(108, "N", "O");
        grafo.adicionarAresta(82, "O", "P");
        grafo.adicionarAresta(215, "P", "Q");
        grafo.adicionarAresta(97, "Q", "R");
        grafo.adicionarAresta(33, "R", "S");
        grafo.adicionarAresta(207, "S", "T");
        grafo.adicionarAresta(22, "T", "U");
        grafo.adicionarAresta(210, "U", "V");
        grafo.adicionarAresta(107, "U", "X");
        grafo.adicionarAresta(317, "X", "A");
        grafo.adicionarAresta(243, "R", "T");
        grafo.adicionarAresta(38, "S", "V");
        grafo.adicionarAresta(370, "V", "A");

        System.out.println("Bairro: Jardim Taquaral (Santo Amaro)");

        String partida = JOptionPane.showInputDialog("Digite Qual sera seu ponto inicial: ");
        String chegada = JOptionPane.showInputDialog("Digite Qual seta seu ponto final: ");

        grafo.encontrarCaminho(partida, chegada);

    }
}