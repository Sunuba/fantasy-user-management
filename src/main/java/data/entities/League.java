package data.entities;

import java.util.Date;

public class League {
    private long id;
    private String categoryName, ri, rn, sci, scn, scnAz, categoryNameAz;
    private Date added;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getRi() {
        return ri;
    }

    public void setRi(String ri) {
        this.ri = ri;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getSci() {
        return sci;
    }

    public void setSci(String sci) {
        this.sci = sci;
    }

    public String getScn() {
        return scn;
    }

    public void setScn(String scn) {
        this.scn = scn;
    }

    public String getScnAz() {
        return scnAz;
    }

    public void setScnAz(String scnAz) {
        this.scnAz = scnAz;
    }

    public String getCategoryNameAz() {
        return categoryNameAz;
    }

    public void setCategoryNameAz(String categoryNameAz) {
        this.categoryNameAz = categoryNameAz;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }
}
