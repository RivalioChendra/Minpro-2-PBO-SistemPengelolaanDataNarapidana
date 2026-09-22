package model;

public class NarapidanaPembunuhan extends Narapidana {
    private String kategoriPembunuhan;

    public NarapidanaPembunuhan(String idNapi, String nama, String kasus, int masaTahanan, String nomorSel, String blokSel, String kategoriPembunuhan) {
        super(idNapi, nama, kasus, masaTahanan, nomorSel, blokSel);
        this.kategoriPembunuhan = kategoriPembunuhan;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Kategori Kasus: " + kategoriPembunuhan + "\n"
                + "Kategori      : PEMBUNUHAN";
    }

    public String getKategoriPembunuhan() {
        return kategoriPembunuhan;
    }

    public void setKategoriPembunuhan(String kategoriPembunuhan) {
        this.kategoriPembunuhan = kategoriPembunuhan;
    }
}