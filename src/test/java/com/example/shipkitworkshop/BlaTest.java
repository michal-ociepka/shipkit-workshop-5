package com.example.shipkitworkshop;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BlaTest {

    @Test
    public void shouldCreateTriangle() {
        assertTrue(MathUtils.isTriangle(3, 4, 5));
        assertTrue(MathUtils.isTriangle(5, 6, 7));

    }

    @Test
    public void shouldNotCreateTriangle() {
        assertFalse(MathUtils.isTriangle(3, 4, 10));
        assertFalse(MathUtils.isTriangle(3, 4, 100));
    }

}
