package model;

public class NarapidanaPencurian extends Narapidana {
    private long nilaiKerugian;

    public NarapidanaPencurian(String idNapi, String nama, String kasus, int masaTahanan, String nomorSel, String blokSel, long nilaiKerugian) {
        super(idNapi, nama, kasus, masaTahanan, nomorSel, blokSel);
        this.nilaiKerugian = nilaiKerugian;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n"
                + "Nilai Kerugian: Rp" + nilaiKerugian + "\n"
                + "Kategori      : PENCURIAN";
    }

    public long getNilaiKerugian() {
        return nilaiKerugian;
    }

    public void setNilaiKerugian(long nilaiKerugian) {
        this.nilaiKerugian = nilaiKerugian;
    }
}