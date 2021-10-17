package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaIntellij {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setIdade(15);
        gato.getIdade();

        Livro livro = new Livro("Coleção Harry Potter", 3067);

        System.out.println(gato);
        System.out.println(livro);

        /*int a = 5;
          int b = 3;
          System.out.println("Hello, World!\n" + (a + b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "nome = '" + nome + '\'' +
                ", numPaginas = " + numPaginas +
                " páginas"+
                '}';
    }
}
