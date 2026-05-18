public class Main {
    public static void main(String[] args) {
        
        //Intanciando heróis.
        Personagem heroi1 = new Personagem("Arthur", "Guerreiro", 10, 305, 2005.3);
        Personagem heroi2 = new Personagem("Merlim", "Mago", 15, 267, 3015.5);

        //Exibindo status instanciados.
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
