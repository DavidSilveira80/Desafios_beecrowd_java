package iniciante.teste_estruturado;

import iniciante.estruturado.HelloWorld;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TesteHello{

    @Test
    void hello_world() {
    	Assertions.assertEquals("Hello World Java!!!", HelloWorld.hello());
    	
    }

}
