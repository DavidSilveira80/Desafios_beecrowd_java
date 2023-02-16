import iniciante.QuadrantesDeUmPonto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CoordenadasDeUmPontoTest {
    @Test
    void testeCoordenadaOrigem() {
        Assertions.assertEquals("rigem", QuadrantesDeUmPonto.quadranteCoordenada(0, 0));
    }
    @Test
    void testeCoordenadaEixoY1(){
        Assertions.assertEquals("Eixo Y", QuadrantesDeUmPonto.quadranteCoordenada(0, 2));
    }
    @Test
    void testeCoordenadaEixoY2(){
        Assertions.assertEquals("Eixo Y", QuadrantesDeUmPonto.quadranteCoordenada(0, -4));
    }
    @Test
    void testeCoordenadaEixoX1(){
        Assertions.assertEquals("Eixo X", QuadrantesDeUmPonto.quadranteCoordenada(4, 0));
    }
    @Test
    void testeCoordenadaEixoX2(){
        Assertions.assertEquals("Eixo X", QuadrantesDeUmPonto.quadranteCoordenada(-4, 0));
    }
    @Test
    void testeQuadranteQ1(){
        Assertions.assertEquals("Q1", QuadrantesDeUmPonto.quadranteCoordenada(2, 4));
    }
    @Test
    void testeQuadranteQ4(){
        Assertions.assertEquals("Q4", QuadrantesDeUmPonto.quadranteCoordenada(3, -2));
    }
    @Test
    void testeQuadranteQ3(){
        Assertions.assertEquals("Q3", QuadrantesDeUmPonto.quadranteCoordenada(-3, -5));
    }
    @Test
    void testeQuadranteQ2(){
        Assertions.assertEquals("Q2", QuadrantesDeUmPonto.quadranteCoordenada(-5, 5));
    }
}


