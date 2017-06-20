/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author a120121
 */
public class EstacionamentoTest {

    public EstacionamentoTest() {
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
        Estacionamento e = new Estacionamento();
//        for (int c = 0; c < 29; c++){
//            e.estacionar("1111111");
//        }
//        for (Vaga vaga : e.vagas) {
//            //System.out.println(vaga.rotulo);
//            System.out.println(vaga.situacao);
//        }
        System.out.println(e.estacionar("1234"));
        System.out.println(e.estacionar("12345"));
        System.out.println(e.retirar("12345"));
    }

}
