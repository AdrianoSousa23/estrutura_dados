import java.util.*;

public class Grafo <TIPO>{
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }
    public void adicionarVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<>(dado);
        this.vertices.add(novoVertice);
    }
    public void adicionarAresta(int peso, TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        Vertice<TIPO> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void encontrarCaminho(String partida, String chegada) {
        Vertice<TIPO> verticePartida = getVertice((TIPO) partida);
        Vertice<TIPO> verticeChegada = getVertice((TIPO) chegada);

        if (verticePartida == null || verticeChegada == null) {
            System.out.println("ponto de partida ou chegada nao encontrados.");
            return;
        }


        Queue<Vertice<TIPO>> fila = new LinkedList<>();
        Map<Vertice<TIPO>, Vertice<TIPO>> pai = new HashMap<>();

        fila.add(verticePartida);
        pai.put(verticePartida, null);

        while (!fila.isEmpty()) {
            Vertice<TIPO> atual = fila.poll();

            if (atual == verticeChegada) {
                // Caminho encontrado, reconstrua o caminho e imprima
                List<Vertice<TIPO>> caminho = reconstruirCaminho(verticeChegada, pai);
                int distanciaTotal = calcularDistanciaTotal(caminho);

                System.out.println("Caminho ponto a ponto: " + caminho);
                System.out.println("Distância total em metros: " + distanciaTotal + " Metros");
                return;
            }
            if (atual.getArestasSaida() != null){
            for (Aresta<TIPO> aresta : atual.getArestasSaida()) {
                Vertice<TIPO> vizinho = aresta.getFim();
                if (!pai.containsKey(vizinho)) {
                    pai.put(vizinho, atual);
                    fila.add(vizinho);
                    }
                }
            }
        }
        System.out.println("Não foi encontrado um caminho entre os pontos.");
    }

    private List<Vertice<TIPO>> reconstruirCaminho(Vertice<TIPO> chegada, Map<Vertice<TIPO>, Vertice<TIPO>> pai) {
        List<Vertice<TIPO>> caminho = new ArrayList<>();
        Vertice<TIPO> atual = chegada;

        while (atual != null) {
            caminho.add(atual);
            atual = pai.get(atual);
        }

        Collections.reverse(caminho);
        return caminho;
    }

    private int calcularDistanciaTotal(List<Vertice<TIPO>> caminho) {
        int distanciaTotal = 0;
        for (int i = 0; i < caminho.size() - 1; i++) {
            Vertice<TIPO> atual = caminho.get(i);
            Vertice<TIPO> proximo = caminho.get(i + 1);

            for (Aresta<TIPO> aresta : atual.getArestasSaida()) {
                if (aresta.getFim() == proximo) {
                    distanciaTotal += aresta.getPeso();
                    break;
                }
            }
        }
        return distanciaTotal;
    }
}
