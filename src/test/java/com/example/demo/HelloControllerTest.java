package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HelloControllerTest {
    @Test
            void testHello(){
        HelloController controller=new HelloController();
        assertEquals("Hello World",controller.hello());
    }

}