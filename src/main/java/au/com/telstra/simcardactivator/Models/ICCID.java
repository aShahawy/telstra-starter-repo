package au.com.telstra.simcardactivator.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ICCID {
    private String iccid;

    public ICCID(String iccid) {
        this.iccid = iccid;
    }

    @Override
    public String toString() {
        return "{" +
                "iccid='" + iccid + '\'' +
                '}';
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }
}
