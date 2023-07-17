package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("All test in the class will be skipped")
public class AllDisabledTest {

    @Test
    void skippedTestOne() {}

    @Test
    void skippedTestTwo() {}

}
