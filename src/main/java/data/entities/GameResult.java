package data.entities;

public class GameResult {
    private long id;
    private String vaxt, komandalar, ht, ft, vaxtkom, mid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVaxt() {
        return vaxt;
    }

    public void setVaxt(String vaxt) {
        this.vaxt = vaxt;
    }

    public String getKomandalar() {
        return komandalar;
    }

    public void setKomandalar(String komandalar) {
        this.komandalar = komandalar;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getFt() {
        return ft;
    }

    public void setFt(String ft) {
        this.ft = ft;
    }

    public String getVaxtkom() {
        return vaxtkom;
    }

    public void setVaxtkom(String vaxtkom) {
        this.vaxtkom = vaxtkom;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }
}
