package model;

public class NarapidanaKorupsi extends Narapidana {
    private long uangPengganti;

    public NarapidanaKorupsi(String idNapi, String nama, String kasus, int masaTahanan, String nomorSel, String blokSel, long uangPengganti) {
        super(idNapi, nama, kasus, masaTahanan, nomorSel, blokSel);
        this.uangPengganti = uangPengganti;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Uang Pengganti: Rp" + uangPengganti + "\n"
                + "Kategori      : KORUPSI";
    }

    public long getUangPengganti() {
        return uangPengganti;
    }

    public void setUangPengganti(long uangPengganti) {
        this.uangPengganti = uangPengganti;
    }
}