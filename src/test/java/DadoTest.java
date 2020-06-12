import static org.junit.jupiter.api.Assertions.*;

class DadoTest {
    Dado dado;
    int[] valores;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        valores = new int[]{1,2,3,4,5,6};
        dado = new Dado("Verde",valores,"Plástico");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        dado = null;
        valores = null;
    }

    @org.junit.jupiter.api.Test
    void ComprobarLanzamiento_test1() {
            assertEquals(true,dado.comprobarLanzamiento(2));
    }
    @org.junit.jupiter.api.Test
    void ComprobarLanzamiento_test2() {
        assertEquals(false,dado.comprobarLanzamiento(-59));
    }
}