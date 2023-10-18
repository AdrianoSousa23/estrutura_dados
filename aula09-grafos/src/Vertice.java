import java.util.ArrayList;

public class Vertice<TIPO> {
    private  TIPO dado;
    private ArrayList<Arresta<TIPO>> arestasEntrada;
    private ArrayList<Arresta<TIPO>> arestasSaida;

    public Vertice(TIPO valor) {
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Arresta<TIPO>>();
        this.arestasSaida = new ArrayList<Arresta<TIPO>>();;
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public ArrayList<Arresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Arresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Arresta<TIPO>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Arresta<TIPO>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }
    public void adicionarArestaEntrada(Arresta<TIPO> arresta) {
        this.arestasEntrada.add(arresta);
    }
    public void adicionarArestaSaida(Arresta<TIPO> arresta){
        this.arestasSaida.add(arresta);
    }


}
