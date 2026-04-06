package PadraoBridge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class CadeiraTest {

    @Test
    @DisplayName("Deve montar uma Cadeira de Madeira corretamente")
    void testeCadeiraMadeira() {
        Material madeira = new Madeira();
        Movel cadeira = new Cadeira(madeira);

        String resultado = cadeira.montar();

        // Valida retorno com resistência da madeira
        assertEquals("Resistência da cadeira: Alta (sensível a umidade)", resultado);
    }

    @Test
    @DisplayName("Deve montar uma Cadeira de Metal corretamente")
    void testeCadeiraMetal() {
        Material metal = new Metal();
        Movel cadeira = new Cadeira(metal);

        String resultado = cadeira.montar();

        // Valida a resistência do metal
        assertEquals("Resistência da cadeira: Muito Alta (resistente a impactos)", resultado);
    }
}