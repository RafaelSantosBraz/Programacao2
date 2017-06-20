/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael
 */
public class BibliotecaTest {
    
    public BibliotecaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        Biblioteca b = new Biblioteca();
        Autor a = new Autor(0, "Rafael dos Santos Braz");
        Livro l = new Livro("Programando em Java", 2017, "Deuses do Java AVAJ", a);
        b.adicionarLivro(l);
        System.out.println(b.emprestarLivro(l));
        System.out.println(b.emprestarLivro(l));
        System.out.println(b.devolverLivro(l));
        System.out.println(b.devolverLivro(l));
    }
    
}
