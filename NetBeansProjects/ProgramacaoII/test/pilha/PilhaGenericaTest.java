/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.ArrayList;
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
public class PilhaGenericaTest {

    public PilhaGenericaTest() {
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
     * Test of pilhaVazia method, of class PilhaGenerica.
     */
    @Test
    public void teste() {
        PilhaGenerica p = new PilhaGenerica();
        p.empilhar("Rafael");
        p.empilhar("Merlin");
        System.out.println(p.getElementos().get(0));
        System.out.println(p.getElementos().get(1));
        p.desempilhar();
        System.out.println(p.getElementos().get(0));
    }

}
