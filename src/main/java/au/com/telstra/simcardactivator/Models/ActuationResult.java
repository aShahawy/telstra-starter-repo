package au.com.telstra.simcardactivator.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActuationResult {
    private Boolean success;

    public ActuationResult() {
    }
    public ActuationResult(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
