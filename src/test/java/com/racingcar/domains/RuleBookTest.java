package com.racingcar.domains;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleBookTest {
    @Test
    void getValue() {
        assertThat(RuleBook.MOVE_FORWARD_UNIT.getValue()).isEqualTo(1);
    }
}
