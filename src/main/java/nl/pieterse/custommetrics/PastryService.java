package nl.pieterse.custommetrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class PastryService {

    CompositeMeterRegistry meterRegistry;

    private final Counter pastryCounter;

    public PastryService(CompositeMeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        pastryCounter = meterRegistry.counter("order.pastry");
    }

    public String orderPastry(int amount) {
        pastryCounter.increment(amount);
        return String.format("Thank you for ordering %s pastries!", amount);
    }

}
