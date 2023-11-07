import javax.xml.transform.stream.StreamSource;

public class Main {
    public static void main(String[] args) {
        Pessoa qualquer = new Pessoa();
        // Encapsulamento
        qualquer.setNome("Mama Uh"); // atribuição
        System.out.println(qualquer.getNome()); // saída de dados
    }
}