/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author rafin
 */
public class Biblioteca {

    ArrayList<Livro> acervo;

    public Biblioteca() {
        acervo = new ArrayList<>();
    }

    void adicionarLivro(Livro l) {
        acervo.add(l);
    }

    void removerLivro(Livro l) {
        acervo.remove(l);
    }

    boolean emprestarLivro(Livro l) {
        if (acervo.contains(l) && !acervo.get(acervo.indexOf(l)).emprestimo){
            acervo.get(acervo.indexOf(l)).emprestimo = true;
            return true;
        } else{
            return false;
        }
    }
    
    boolean devolverLivro(Livro l){
        if (acervo.contains(l) && acervo.get(acervo.indexOf(l)).emprestimo){
            acervo.get(acervo.indexOf(l)).emprestimo = false;
            return true;
        } else{
            return false;
        }
    }
}
