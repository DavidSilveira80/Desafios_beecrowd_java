import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelloWorldTest {
    @Test
    void hello_world(){
        Assertions.assertEquals("Hello World!", HelloWorld.hello());
    }

}
