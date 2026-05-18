public class Personagem {

    //Variáveis do personagem
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    //Construtor de instancia do personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    //Getter de exibição dos valores das variaveis do personagem
    public void exibirStatus() {
        System.out.println("----------------------------\n");
        System.out.println("--- Status do Personagem ---\n");
        System.out.println("----------------------------\n");
        System.out.println("    Nome    |   " + nome + "\n");
        System.out.println("    Classe  |   " + classe + "\n");
        System.out.println("    Nível   |   " + nivel + "\n");
        System.out.println("    PV      |   " + pontosDeVida + "\n");
        System.out.println("    PB      |   " + poderBase + "\n");
        System.out.println("----------------------------\n\n");
    }
}

