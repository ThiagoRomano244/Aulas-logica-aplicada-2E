public class Pessoa {
    // Atributos da classe
    public String nome;
    public String sobrenome;

    // Métodos da classe
    public void falar() {
        System.out.println("falei");
    }

    public String falar(String texto) {
        return texto;
    }

    public Pessoa criarPessoa() {
        return new Pessoa();
    }

    // sobrescrita do método
    public void comer() {
        System.out.println("pessoa comeu");
    }
}
