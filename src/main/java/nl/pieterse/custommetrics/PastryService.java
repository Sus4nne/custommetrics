package nl.pieterse.custommetrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class PastryService {

    private final Counter pastryItemCounter;
    private final Counter pastryOrderCounter;

    public PastryService(CompositeMeterRegistry meterRegistry) {
        pastryItemCounter = meterRegistry.counter("pastry.amount.items");
        pastryOrderCounter = meterRegistry.counter("pastry.amount.orders");
    }

    public String orderPastry(int amount) {
        pastryOrderCounter.increment();
        pastryItemCounter.increment(amount);
        return String.format("Thank you for ordering %s pastries!", amount);
    }

}
