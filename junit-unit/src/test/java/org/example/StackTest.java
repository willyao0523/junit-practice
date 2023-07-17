package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A stack test")
public class StackTest {

    @Test
    @DisplayName("is instantiated")
    void isInstantiated() {

    }

    @Nested
    @DisplayName("when empty")
    class WhenNew {
        @Test
        @DisplayName("is empty")
        void isEmpty() {

        }

        @Test
        @DisplayName("throws Exception when popped")
        void throwExceptionWhenPopped() {

        }


        @Nested
        @DisplayName("after pushing an element")
        class AfterPushing {
            @Test
            @DisplayName("is is not longer empty")
            void isNotEmpty() {

            }

            @Test
            @DisplayName("returns the element when popped")
            void returnElementWhenPopped() {

            }

            @Test
            @DisplayName("returns the element when peeked")
            void returnElementWhenPeeked() {
            }

        }
    }
}
