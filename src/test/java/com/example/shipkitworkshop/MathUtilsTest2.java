package com.example.shipkitworkshop;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathUtilsTest2 {

    @Test
    public void shouldNotCreateTriangle2() {
        assertFalse(MathUtils.isTriangle(5, 5, 10));
    }


}
