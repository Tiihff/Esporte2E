import javax.xml.transform.stream.StreamSource;

public class Main {
    public static void main(String[] args) {
        Pessoa qualquer = new Pessoa();
        // Encapsulamento
        qualquer.setNome("Mama Uh"); // atribuição
        System.out.println(qualquer.getNome()); // saída de dados

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(123);
        jogadora.setNome("Tuiks do futs");
        System.out.println(jogadora.getNome());
        //Polimorfismo
        qualquer = new Esportista();
        String resultado = qualquer.sacar();
        System.out.println(resultado);
        qualquer = new Pessoa();
        resultado = qualquer.sacar();
        System.out.println(resultado);


    }
}