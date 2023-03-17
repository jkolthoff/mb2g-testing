import org.junit.Test;

import static org.junit.Assert.assertEquals;

import guru.springframework.JavaHelloWorld;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
