package au.com.telstra.simcardactivator.Components;

import au.com.telstra.simcardactivator.Models.ActuationResult;
import au.com.telstra.simcardactivator.Models.ICCID;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SimCardActuationHandler {
    private final RestTemplate restTemplate;
    private final String incentiveApiUrl;

    public SimCardActuationHandler() {
        this.restTemplate = new RestTemplate();
        this.incentiveApiUrl = "http://localhost:8444/actuate";
    }

    public ActuationResult actuate(ICCID iccid) {
        return restTemplate.postForObject(incentiveApiUrl, iccid, ActuationResult.class);
    }
}
