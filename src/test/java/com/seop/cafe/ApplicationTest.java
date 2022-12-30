package com.seop.cafe;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ApplicationTest {
    @Test
    void test() {
        String answer = "test";
        assertThat(answer)
                .isEqualTo("test");
    }
}