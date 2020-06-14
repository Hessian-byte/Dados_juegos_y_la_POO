import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuegoDadosTest {
    JuegoDados juego;
    @BeforeEach
    void setUp() {
        juego = new JuegoDados();
    }

    @AfterEach
    void tearDown() {
        juego = null;
    }

    @Test
    void evaluarResultado_test01() {
        assertEquals("Has ganado la partida",juego.evaluarResultado(1,6));
    }
    @Test
    void evaluarResultado_test02() {
        assertEquals("Has perdido la partida",juego.evaluarResultado(1,3));
    }
    @Test
    void evaluarResultado_test03() {
        assertEquals("La suma de los dados a arrojado un resultado no válido: "+(-99),juego.evaluarResultado(1,-100));
    }
    @Test
    void evaluarResultado_test04() {
        assertEquals("La suma de los dados a arrojado un resultado no válido: "+(20),juego.evaluarResultado(10,10));
    }
}