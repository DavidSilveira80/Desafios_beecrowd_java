package testes;
import estruturado.HelloWorld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TesteHello {

	@Test
	void hello_world() {
		Assertions.assertEquals("Hello World!", HelloWorld.hello());
		
	}

}
