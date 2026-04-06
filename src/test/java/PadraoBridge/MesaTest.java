package PadraoBridge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class MesaTest {

    @Test
    @DisplayName("Deve montar uma Mesa de Madeira corretamente")
    void testeMesaMadeira() {
        Material madeira = new Madeira();
        Movel mesa = new Mesa(madeira);

        String resultado = mesa.montar();

        assertEquals("Resistência da mesa: Alta (sensível a umidade)", resultado);
    }

    @Test
    @DisplayName("Deve montar uma Mesa de Metal corretamente")
    void testeMesaMetal() {
        Material metal = new Metal();
        Movel mesa = new Mesa(metal);

        String resultado = mesa.montar();

        assertEquals("Resistência da mesa: Muito Alta (resistente a impactos)", resultado);
    }
}