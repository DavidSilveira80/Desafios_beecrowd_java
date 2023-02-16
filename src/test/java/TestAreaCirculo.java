import iniciante.AreaCirculo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestAreaCirculo {
    AreaCirculo area = new AreaCirculo();
    @Test
    void test_area_calc_circulo(){

        Assertions.assertEquals(12.56636, area.area_calculo(2.00));

    }
    @Test
    void area_circulo_saida(){
        Assertions.assertEquals("A=12.5664", area.saida_area_circulo(2.00));
    }

}
