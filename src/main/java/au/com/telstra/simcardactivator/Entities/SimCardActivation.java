package au.com.telstra.simcardactivator.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimCardActivation {

    @Id
    @GeneratedValue
    @JsonIgnore
    private long id;
    @Column(nullable = false)
    private String iccid;
    @Column(nullable = false)
    private String customerEmail;
    @Column(nullable = false)
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
