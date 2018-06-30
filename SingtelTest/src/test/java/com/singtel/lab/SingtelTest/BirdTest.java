package com.singtel.lab.SingtelTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author SHAIK
 *
 */
public class BirdTest {
    Bird bird = new Bird();

    @Before
    public void setup() {
    }

    @Test
    public void singShouldBeImplemented() {
        assertTrue("Bird has sing method", bird.sing());
    }

    @Test
    public void swimShouldReturnFalse() {
        assertFalse("Not all the Bird's can swim", bird.swim());
    }
}
