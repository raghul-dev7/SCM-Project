package com.scm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SCMApplicationTest {
    @Test
    public void testMessage() {
        assertEquals("SCM Travis CI Project", SCMApplication.getMessage());
    }
}