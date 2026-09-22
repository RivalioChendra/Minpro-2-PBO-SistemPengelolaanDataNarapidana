package model;

public class NarapidanaTerorisme extends Narapidana {
    private String tingkatRisiko;

    public NarapidanaTerorisme(String idNapi, String nama, String kasus, int masaTahanan, String nomorSel, String blokSel, String tingkatRisiko) {
        super(idNapi, nama, kasus, masaTahanan, nomorSel, blokSel);
        this.tingkatRisiko = tingkatRisiko;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Tingkat Risiko: " + tingkatRisiko + "\n"
                + "Kategori      : TERORISME";
    }

    public String getTingkatRisiko() {
        return tingkatRisiko;
    }

    public void setTingkatRisiko(String tingkatRisiko) {
        this.tingkatRisiko = tingkatRisiko;
    }
}