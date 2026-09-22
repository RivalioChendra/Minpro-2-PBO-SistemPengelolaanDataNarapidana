package model;

public class Narapidana {
    private String idNapi;
    private String nama;
    private String kasus;
    private int masaTahanan;
    private String nomorSel;
    private String blokSel;

    // Constructor
    public Narapidana(String idNapi, String nama, String kasus, int masaTahanan, String nomorSel, String blokSel) {
        this.idNapi = idNapi;
        this.nama = nama;
        this.kasus = kasus;
        this.masaTahanan = masaTahanan;
        this.nomorSel = nomorSel;
        this.blokSel = blokSel;
    }

    // Getter & Setter
    public String getIdNapi() {
        return idNapi;
    }

    public String getNama() {
        return nama;
    }

    public String getKasus() {
        return kasus;
    }

    public int getMasaTahanan() {
        return masaTahanan;
    }

    public String getNomorSel() {
        return nomorSel;
    }

    public void setNomorSel(String nomorSel) {
        this.nomorSel = nomorSel;
    }

    public String getBlokSel() {
        return blokSel;
    }

    public void setBlokSel(String blokSel) {
        this.blokSel = blokSel;
    }

    public String getInfo() {
        return "ID Narapidana : " + idNapi + "\n"
                + "Nama          : " + nama + "\n"
                + "Kasus         : " + kasus + "\n"
                + "Masa Tahanan  : " + masaTahanan + " bulan\n"
                + "Sel           : " + nomorSel + " (" + blokSel + ")";
    }
}