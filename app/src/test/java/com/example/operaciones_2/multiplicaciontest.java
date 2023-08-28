package com.example.operaciones_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class multiplicaciontest {

    @Test
    public void testMultiplicacion() {
        pantalla_multiplicacion pantalla_multiplicacion = new pantalla_multiplicacion();


        int resultado1 = pantalla_multiplicacion.multiplicacion(5, 3);
        assertEquals(15, resultado1);


        int resultado2 = pantalla_multiplicacion.multiplicacion(0, 7);
        assertEquals(0, resultado2);


        int resultado3 = pantalla_multiplicacion.multiplicacion(-2, 4);
        assertEquals(-8, resultado3);


        int resultado4 = pantalla_multiplicacion.multiplicacion(10, 2);
        assertEquals(20, resultado4);


    }
}