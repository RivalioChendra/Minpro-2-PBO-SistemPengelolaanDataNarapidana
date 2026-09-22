package model;

public class NarapidanaNarkotika extends Narapidana {
    private String jenisRehabilitasi;

    public NarapidanaNarkotika(String idNapi, String nama, String kasus, int masaTahanan,String nomorSel, String blokSel, String jenisRehabilitasi) {
        super(idNapi, nama, kasus, masaTahanan, nomorSel, blokSel);
        this.jenisRehabilitasi = jenisRehabilitasi;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Rehabilitasi  : " + jenisRehabilitasi + "\n"
                + "Kategori      : NARKOTIKA";
    }

    public String getJenisRehabilitasi() {
        return jenisRehabilitasi;
    }

    public void setJenisRehabilitasi(String jenisRehabilitasi) {
        this.jenisRehabilitasi = jenisRehabilitasi;
    }
}