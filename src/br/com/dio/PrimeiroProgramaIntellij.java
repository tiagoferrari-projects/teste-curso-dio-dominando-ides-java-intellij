package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaIntellij {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setIdade(15);
        gato.getIdade();

        System.out.println(gato);

        /*int a = 5;
          int b = 3;
          System.out.println("Hello, World!\n" + (a + b));*/
    }
}
