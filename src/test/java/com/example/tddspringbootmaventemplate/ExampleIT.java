package com.example.tddspringbootmaventemplate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExampleIT {
    @Test
    void testing() {
        assertThat(true).isTrue();
    }
}
