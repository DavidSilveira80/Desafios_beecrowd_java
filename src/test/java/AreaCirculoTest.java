import iniciante.AreaCirculo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class AreaCirculoTest {
    AreaCirculo area = new AreaCirculo();

    @Test
    void areaDoCirculoTest(){

        Assertions.assertEquals(12.56636, area.area_calculo(2.00));

    }
    @Test
    void area_circulo_saidaTest(){
        Assertions.assertEquals("A=12.5664", area.saida_area_circulo(2.00));
    }
}
