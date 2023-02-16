import iniciante.ExtremamenteBasico;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ExtremamenteBasicoTest {
    @Test
    void soma_literal(){
        ExtremamenteBasico somando = new ExtremamenteBasico();
        Assertions.assertEquals(10, somando.soma_A_B(5, 5));
    }

    @Test
    void soma_saida(){
        ExtremamenteBasico saida = new ExtremamenteBasico();
        Assertions.assertEquals("X = 10", saida.soma_saida(5, 5));
    }

}
