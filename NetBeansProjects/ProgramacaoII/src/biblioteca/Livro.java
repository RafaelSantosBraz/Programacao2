/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author rafin
 */
public class Livro {

    String titulo;
    int anoPublicacao;
    String nomeEditora;
    Autor autor;
    boolean emprestimo;

    public Livro() {
        titulo = "";
        anoPublicacao = 0;
        nomeEditora = "";
        emprestimo = false;
        autor = new Autor();
    }
    
    public Livro(String titulo, int anoPublicacao, String nomeEditora, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.nomeEditora = nomeEditora;
        this.emprestimo = false;
        this.autor = autor;
    }

}
