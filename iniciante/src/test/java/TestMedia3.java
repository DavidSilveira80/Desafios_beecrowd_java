import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestMedia3 {
    @Test
    void stringParaDouble(){
        Media3 arrays = new Media3();
        Assertions.assertArrayEquals(new double[]{2.8, 5.8, 3.0, 4.0},arrays.converterArrayStringParaDouble("2.8 5.8 3.0 4.0".split(" ")));
        Assertions.assertArrayEquals(new double[]{5.8}, arrays.converterArrayStringParaDouble("5.8".split(" ")));
    }

    @Test
    void mediaGeral(){
        Media3 mediaPonderada3 = new Media3();
        Assertions.assertEquals(5.4,mediaPonderada3.calculoMediaPonderada3(2.0, 4.0, 7.5, 8.0));

    }

    @Test
    void mediaExame(){
        Media3 mediaExameFinal = new Media3();
        Assertions.assertEquals(5.9, mediaExameFinal.calculoMediaExameFinal(2.0, 4.0, 7.5, 8.0, 6.4));

    }

    @Test
    void aprovadoExameReprovado(){
        Media3 statusAluno = new Media3();
        Assertions.assertEquals("Aluno aprovado.", statusAluno.statusFinalAluno(7.3));
        Assertions.assertEquals("Aluno reprovado.", statusAluno.statusFinalAluno(4.8));
        Assertions.assertEquals("Aluno em exame.", statusAluno.statusFinalAluno(5.4));

    }




}
