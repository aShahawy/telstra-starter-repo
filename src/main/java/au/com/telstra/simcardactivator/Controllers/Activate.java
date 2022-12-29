package au.com.telstra.simcardactivator.Controllers;

import au.com.telstra.simcardactivator.Models.ICCID;
import au.com.telstra.simcardactivator.Models.Result;
import au.com.telstra.simcardactivator.Models.SimCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Activate {

    private static final Logger log = LoggerFactory.getLogger(Activate.class);

    @PostMapping(path = "/activate", name = "Activate")
    public Result activate(@RequestBody SimCard simCard) {
        log.info(simCard.toString());
        ICCID iccid = new ICCID(simCard.getIccid());
        log.info(iccid.toString());
        final RestTemplate restTemplate = new RestTemplate();
        Result result = restTemplate.postForObject("http://localhost:8444/actuate", iccid, Result.class);
        log.info(result.getSuccess().toString());
        return result;
    }
}
