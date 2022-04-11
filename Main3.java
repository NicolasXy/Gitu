class Main3 {
    String idiomas; 
    
    Main3 (String falado){
        idiomas = falado;
        System.out.println(idiomas + " É falado no mundo");
    }

    public static void main(String[] args){
        Main3 obj1 = new Main3("Alemão");
        Main3 obj2 = new Main3("Inglês");
        Main3 obj3 = new Main3("Português");
        System.out.println(obj1.idiomas);
    }
}
