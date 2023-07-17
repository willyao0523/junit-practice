package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameterized.Parameter(0)
    public Integer input1;

    @Parameterized.Parameter(1)
    public String input2;

    @Parameterized.Parameters(name="My test #{index} -- input data: {0} and {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, "hello"},
                {2, "goodbye"}
        });
    }

    @Test
    public void test() {
        System.out.println(input1 + " " + input2);
    }
}
