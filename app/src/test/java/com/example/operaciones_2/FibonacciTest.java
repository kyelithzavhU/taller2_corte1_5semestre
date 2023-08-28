package com.example.operaciones_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        pantalla_fibonacci pantallaFibonacci = new pantalla_fibonacci();

        // Prueba con un valor válido
        int resultado1 = pantallaFibonacci.fibonacci(5);
        assertEquals(5, resultado1);

        // Prueba con el caso base
        int resultado2 = pantallaFibonacci.fibonacci(0);
        assertEquals(0, resultado2);

        // Prueba con otro valor válido
        int resultado3 = pantallaFibonacci.fibonacci(10);
        assertEquals(55, resultado3);

        // Puedes agregar más pruebas según sea necesario
    }
}
