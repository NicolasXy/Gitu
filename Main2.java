class Main2 {
    private String nome;
    
    Main2() {
        System.out.println("Construtor chamado: ");
        nome = "Programa Java";
    }

    public static void main(String[] args) {
        Main2 obj = new Main2();
        System.out.println("Qual construtor foi chamado?" + obj.nome);
    }
}
