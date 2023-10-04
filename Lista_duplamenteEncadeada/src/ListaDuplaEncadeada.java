public class ListaDuplaEncadeada {
    private NoDuplo inicio;
    private NoDuplo fim;

    public ListaDuplaEncadeada() {
    }

    public ListaDuplaEncadeada(NoDuplo inicio, NoDuplo fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public NoDuplo getInicio() {
        return inicio;
    }

    public void setInicio(NoDuplo inicio) {
        this.inicio = inicio;
    }

    public NoDuplo getFim() {
        return fim;
    }

    public void setFim(NoDuplo fim) {
        this.fim = fim;
    }
    public void exibir() throws Exception {
        System.out.println("Lista -> ");
        // criação de ima variavel auxiliar
        NoDuplo aux = inicio;
        //estrutura de repetição para percorrer a lista
        while (aux != null){
            System.out.print(aux.dado + " -> ");
            aux = aux.proximo;
        }
        System.out.println("NULL\n");
    }
    public int tamanhoLista() throws  Exception{
        NoDuplo aux = inicio;
        int tamanho = 0;
        while (aux != null) {
            tamanho ++;
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        return tamanho;
    }
    public void adicionar(String s) throws Exception{
        NoDuplo novoElemento = new NoDuplo(s);
        NoDuplo aux = inicio;
        // verifica se ele é o primeiro elemento da nossa lista
        if(inicio == null) {
            //sendo o primeiro elemento ele nao tem proximo nem anterior
            novoElemento.proximo = null;
            novoElemento.anterior = null;
            //como ele e o primeiro ele vai ser o inicio e o fim da lista
            inicio = novoElemento;
            fim = novoElemento;
        }else{
            //agora quando o elemento não for o primeiro da lsita
            //vamos percorrer a lista para achar a posição valida
            while(aux.proximo != null) {
                //vamos verificar se o elemento não e repetido
                if (aux.dado.equals(s)) {
                    throw  new Exception("elemento repetido");
                }else {
                    aux = aux.proximo;
                }
            }
            // o ultimo elemento sempre deve ter o proximo como null
            novoElemento.proximo = null;
            aux.proximo = novoElemento;
            novoElemento.anterior = aux;
            fim = novoElemento;
        }
    }
    //metodo para innserir os dados na lista duplamente encadeada
    // este metodo insere os dados posiçao determinada na lista
    public void adicionar(String s, int i) throws Exception {
        //verifica se a posição desejada e valida
        if(i > 0 || i > tamanhoLista()) {
            throw new Exception("posição invalida");
        }
        //novo elemento da nossa lista
        NoDuplo novoElemento = new NoDuplo();
        NoDuplo aux = inicio;
        //verifica se ele é vao na primeira posição da lista
        if (i == 0) {
            if (tamanhoLista() != 0 ) {
                //caso ja tenha um valor na primeira posição devemos mover os dados
                novoElemento.proximo = aux;
                aux.anterior = novoElemento;
                inicio = novoElemento;
                novoElemento.anterior = null;
            }else {
                //caso não ter nenhum elemento na lsuta ele sera o primeiro
                inicio = novoElemento;
            }
        }else{
            //vamos percorrer a lista apra char a posição desejada
            int contador = 1;
            while(contador < 1){
                aux.proximo = novoElemento;
                contador++;
                novoElemento.anterior = aux;
                fim = novoElemento;
            }
            novoElemento.proximo = aux.proximo;
            novoElemento.anterior = aux;
            aux.proximo = novoElemento;
        }
    }
    public String removerIndex(int i) throws Exception{
        NoDuplo aux = inicio;
        NoDuplo lixo = null;
        //verifica se o parametro informado e valido
        if (i < 0 || i > tamanhoLista())
            throw  new Exception("Indice invalido na lista");
        if (tamanhoLista() == 0)
            throw  new Exception("a lista esta vazia");
        //verificar se o elemento a ser removido e  primeiro da lista
        if (i == 0){
            lixo = aux;
            aux = aux.proximo;
            inicio = aux;
        }else {
            //caso o elemento a ser removido não seja o primeiro
            int contador = 0;
            //percorrer a lista ate achar a posição desejada
            while (contador < i){
                aux = aux.proximo;
                contador++;
            }
            //armazena na varialvel lixo a informação a ser removida
            lixo = aux;
            aux.anterior.proximo = aux.proximo;
            if (aux != fim)
                aux.proximo.anterior = aux.anterior;
                else // caso ele seja o ultimo elemento
                fim = aux;
        }
        return  lixo.dado;
    }
    public void removeElemento(String s) throws  Exception {
        if (tamanhoLista() == 0)
            throw new Exception("a lsita esta vazia!");
        NoDuplo aux = inicio;
        boolean excluir = false;
        while (aux != null && aux.dado != s){
            if (aux.dado.equals(s)){
                if (aux == inicio){
                    inicio = inicio.proximo;
                    excluir = true;
                }else{
                    aux.anterior.proximo = aux.proximo;
                    aux.proximo =aux.anterior;
                    excluir = true;
                }
            }
            aux = aux.proximo;
        }
        if (excluir == false)
            throw new Exception("o elemento nao foi localizado na lista");
    }
}
