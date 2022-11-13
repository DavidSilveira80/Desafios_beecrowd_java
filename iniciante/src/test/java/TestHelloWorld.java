import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestHelloWorld {
    @Test
    void hello_world(){
        Assertions.assertEquals("Hello World Java!!!", HelloWorld.hello());
    }

}
