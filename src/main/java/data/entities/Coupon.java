package data.entities;

import java.util.Date;

public class Coupon {
    private long id;
    private String owner, slip_id, stake, status;
    private Date tarix;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSlip_id() {
        return slip_id;
    }

    public void setSlip_id(String slip_id) {
        this.slip_id = slip_id;
    }

    public String getStake() {
        return stake;
    }

    public void setStake(String stake) {
        this.stake = stake;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTarix() {
        return tarix;
    }

    public void setTarix(Date tarix) {
        this.tarix = tarix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
