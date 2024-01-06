package org.ayeseeem.ARTIFACT_NAME;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

    @Test
    public void testSayHello() {
        String message = Main.sayHello();
        assertEquals("I am a starter project", message);
    }

}
