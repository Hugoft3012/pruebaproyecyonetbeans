/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Persona.*;

/**
 *
 * @author hugo.fidtra
 */
public class PersonaTest {

    private Persona persona;

    @BeforeEach
    void inicializarPersona() {
        persona = new Persona("Paco", 18, 175.2);
    }

    @Test
    void testSetEdad() {
        persona.setEdad(18);
        assertEquals(18, persona.getEdad());
    }

    @Test
    void testSetAltura() {
       
    }

    @Test
    void testCumplirAnios() {
    }

    @Test
    void testCalcularIMC() {
        try{
        }catch(IllegalArgumentException ie){
        }
    }

}
