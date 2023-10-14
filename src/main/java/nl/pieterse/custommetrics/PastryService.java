package nl.pieterse.custommetrics;

import org.springframework.stereotype.Service;

@Service
public class PastryService {

    public String orderPastry(int amount) {
        return String.format("Thank you for ordering %s pastries!", amount);
    }

}
