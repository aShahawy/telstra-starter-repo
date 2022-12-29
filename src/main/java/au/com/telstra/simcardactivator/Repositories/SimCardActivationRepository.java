package au.com.telstra.simcardactivator.Repositories;

import au.com.telstra.simcardactivator.Entities.SimCardActivation;
import org.springframework.data.repository.CrudRepository;

public interface SimCardActivationRepository extends CrudRepository<SimCardActivation, Long> {
}
