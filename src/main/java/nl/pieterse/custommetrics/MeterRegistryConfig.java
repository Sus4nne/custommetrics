package nl.pieterse.custommetrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MeterRegistryConfig {

    @Bean
    public MeterRegistry getMeterRegistry() {
        return new CompositeMeterRegistry();
    }
}
