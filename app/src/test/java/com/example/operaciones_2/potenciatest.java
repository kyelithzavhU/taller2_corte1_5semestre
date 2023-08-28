package com.example.operaciones_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class potenciatest {

    @Test
    public void testPotencia() {
        pantalla_potencia pantallaPotencia = new pantalla_potencia();

        // Prueba con base 2 y exponente 3 (2^3)
        int resultado1 = pantallaPotencia.potencia(2, 3);
        assertEquals(8, resultado1);

        // Prueba con base 5 y exponente 0 (5^0)
        int resultado2 = pantallaPotencia.potencia(5, 0);
        assertEquals(1, resultado2);

        // Prueba con base 4 y exponente negativo (-4^(-2))
        int resultado3 = pantallaPotencia.potencia(-4, -2);
        assertEquals(0, resultado3);

        // Prueba con base 3 y exponente 1 (3^1)
        int resultado4 = pantallaPotencia.potencia(3, 1);
        assertEquals(3, resultado4);

        // Puedes agregar más pruebas según sea necesario
    }
}
