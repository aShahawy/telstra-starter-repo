package au.com.telstra.simcardactivator.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SimCardActivation {

    @Id
    @GeneratedValue
    private long id;
    private String iccid;
    private String customerEmail;
    private Boolean active;

    public SimCardActivation(String iccid, String customerEmail, Boolean active) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.active = active;
    }

    public SimCardActivation() {}

    @Override
    public String toString() {
        return "SimCardActivation{" +
                "id=" + id +
                ", iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", active=" + active +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getIccid() {
        return iccid;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Boolean getActive() {
        return active;
    }
}
