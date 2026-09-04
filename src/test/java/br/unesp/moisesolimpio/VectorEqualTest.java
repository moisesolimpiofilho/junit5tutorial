package br.unesp.moisesolimpio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VectorEqualTest {

    private static int v1[];
    private static int v2[];

    public VectorEqualTest() {

    }

    @BeforeAll 
    static void init() {
        System.out.println("Inicializando os vetores");

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        v1 = new int[3];
        v1 = a;

        v2 = new int[3];
        v2 = b;
    }

    @AfterAll 
    static void tearDownAll() {
        // É executado após cada execução do teste
        v1 = null;
        v2 = null;
    }

    @Order(2)
    @Test
    void testEqual() {
        System.out.println("Os valores são iguais?");
        boolean expResult = true;
        boolean result = Vector.equal(v2, v1);
        assertEquals(expResult, result);
    }

    @Order(1)
    @Test
    void testSize() {
        System.out.println("Os vetores tem o mesmo tamanho?");
        boolean expResult = true;
        boolean result = Vector.size(v1.length, v2.length);
        assertEquals(expResult, result);
    }
}
