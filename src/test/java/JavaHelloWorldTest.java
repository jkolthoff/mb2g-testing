import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import guru.springframework.JavaHelloWorld;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
