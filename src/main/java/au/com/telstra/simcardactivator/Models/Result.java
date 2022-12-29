package au.com.telstra.simcardactivator.Models;

public class Result {
    private Boolean success;

    public Result() {
    }
    public Result(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
