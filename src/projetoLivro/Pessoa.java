package projetoLivro;

public class Pessoa { 

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(final String nome, final int idade, final String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.idade = idade + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(final int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(final String sexo) {
		this.sexo = sexo;
    }
}

    