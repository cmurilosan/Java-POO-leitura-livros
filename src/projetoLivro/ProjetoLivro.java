package projetoLivro;

public class ProjetoLivro {

    public static void main(String[] args) {   

        //Teste realizado
        Pessoa[] p = new Pessoa [2];
        Livro[] l = new Livro [3];

        p[0] = new Pessoa("Fulana", 30, "F");

        l[0] = new Livro("Java POO", "Guana", 400, p[0]);


        l[0].abrir();
        l[0].avancarPag();
        l[0].folhear(200);
        l[0].voltarPag();
        l[0].fechar();
        System.out.println(l[0].detalhes());

    }
        

}