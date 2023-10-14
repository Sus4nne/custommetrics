package nl.pieterse.custommetrics;

import org.springframework.web.bind.annotation.*;

@RestController()
public class PastryController {

    PastryService pastryService;

    public PastryController(PastryService pastryService) {
        this.pastryService = pastryService;
    }

    @PostMapping("/pastries")
    @ResponseBody
    public String orderPastry(@RequestParam int amount) {
        return pastryService.orderPastry(amount);
    }


}
