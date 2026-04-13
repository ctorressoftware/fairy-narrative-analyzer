package io.github.ctorressoftware.fairy;

import org.springframework.boot.SpringApplication;

public class TestFairyNarrativeAnalyzerApplication {

    public static void main(String[] args) {
        SpringApplication.from(FairyNarrativeAnalyzerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
