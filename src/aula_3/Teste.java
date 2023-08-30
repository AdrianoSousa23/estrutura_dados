package aula_3;

public class Teste {
    public static void main(String[] args) throws Exception{
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Claudio", "9999-2525", "claudio@gmail.com");
        Contato c2 = new Contato("Daniel", "9222-3335", "daniel@gmail.com");
        Contato c3 = new Contato("Miguel", "9588-2525", "miguel@gmail.com");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("tamanho do vetor: " + vetor.tamanho());

        System.out.println(vetor);
     }

    }

