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
}