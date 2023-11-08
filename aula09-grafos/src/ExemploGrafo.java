public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("paulo");
        grafo.adicionarVertice("lorenzo");
        grafo.adicionarVertice("Cleusa");
        grafo.adicionarVertice("kleber");
        grafo.adicionarVertice("claudio");

        grafo.adicionarAresta(2.0, "paulo", "lorenzo");
        grafo.adicionarAresta(3.0, "lorenzo", "kleber");
        grafo.adicionarAresta(1.0, "kleber", "Cleusa");
        grafo.adicionarAresta(1.0, "paulo", "Cleusa");
        grafo.adicionarAresta(2.0, "claudio", "lorenzo");
        grafo.adicionarAresta(3.0, "claudio", "paulo");

        grafo.BuscaEmLargura();
    }

}
