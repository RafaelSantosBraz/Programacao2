/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafin
 */
public class PilhaTest {

    public PilhaTest() {
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

    /**
     * Test of pilhaVazia method, of class Pilha.
     */
//    @Test
//    public void teste() {
//        Pilha p = new Pilha();
//        p.empilhar("Rafael");
//        p.empilhar("Merlin");
//        System.out.println(p.getElementos().get(0));
//        System.out.println(p.getElementos().get(1));
//        p.desempilhar();
//        System.out.println(p.getElementos().get(0));
//    }
    
//    @Test
//    public void testeDivisao() {
//        //exception não verificada, o tratamento é opcional
//        //a verificada é obrigatório o tratamento com o try/catch
//        int a = 9;
//        int b = 0;
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) { //Exeção específica aritmética
//            System.out.println("Exceção Aritmética");
//        } catch (Exception e) { //exection geral (superclasse Exception
//            System.out.println("Deu erro");
//        } finally { //executado com ou sem o erro
//            System.out.println("Executou o Finally");
//        }
//    }
    
    @Test
    public void TestePilhaException(){
        Pilha p =  new Pilha();
        try { //obrigatório tratar a exception por causa do throws
            p.desempilharExcecao();
        } catch (ExecaoPilhaVazia e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("deu erro");
        }
    }
}
