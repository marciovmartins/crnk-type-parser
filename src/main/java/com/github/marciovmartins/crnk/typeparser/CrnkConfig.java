package com.github.marciovmartins.crnk.typeparser;

import io.crnk.core.boot.CrnkBoot;
import io.crnk.core.engine.parser.StringParser;
import io.crnk.core.exception.ResourceNotFoundException;
import java.util.UUID;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrnkConfig {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public CrnkConfig(CrnkBoot crnkBoot) {
        crnkBoot.getModuleRegistry().getTypeParser().addParser(UUID.class, uuidStringParser());
    }

    private static StringParser<UUID> uuidStringParser() {
        return input -> {
            try {
                return UUID.fromString(input);
            } catch (IllegalArgumentException e) {
                throw new ResourceNotFoundException(e.getMessage());
            }
        };
    }

}
