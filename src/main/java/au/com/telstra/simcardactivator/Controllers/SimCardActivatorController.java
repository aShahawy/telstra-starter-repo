package au.com.telstra.simcardactivator.Controllers;

import au.com.telstra.simcardactivator.Components.SimCardActuationHandler;
import au.com.telstra.simcardactivator.Entities.SimCardActivation;
import au.com.telstra.simcardactivator.Models.ICCID;
import au.com.telstra.simcardactivator.Models.ActuationResult;
import au.com.telstra.simcardactivator.Models.SimCard;
import au.com.telstra.simcardactivator.Repositories.SimCardActivationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SimCardActivatorController {

    private static final Logger log = LoggerFactory.getLogger(SimCardActivatorController.class);

    @Autowired
    private SimCardActuationHandler simCardActuationHandler;

    @Autowired
    private SimCardActivationRepository simCardActivationRepository;

    @PostMapping(path = "/activate", name = "Activate")
    public ActuationResult activate(@RequestBody SimCard simCard) {
        //log.info(simCard.toString());
        ICCID iccid = new ICCID(simCard.getIccid());
        //log.info(iccid.toString());
        ActuationResult actuationResult = simCardActuationHandler.actuate(iccid);
        simCardActivationRepository.save(new SimCardActivation(simCard.getIccid(), simCard.getCustomerEmail(), actuationResult.getSuccess()));
        //log.info(simCardActivationRepository.findAll().toString());
        return actuationResult;
    }
}
