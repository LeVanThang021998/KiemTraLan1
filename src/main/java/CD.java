/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 */
public class CD {

    String maso;
    String tenCD;
    String casi;
    double giaban;
    int namphathanh;

    public CD(String maso, String tenCD, String casi, double giaban, int namphathanh) {
        this.maso = maso;
        this.tenCD = tenCD;
        this.casi = casi;
        this.giaban = giaban;
        this.namphathanh = namphathanh;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(int namphathanh) {
        this.namphathanh = namphathanh;
    }

    @Override
    public String toString() {
        return String.format(
                "CD[Ma so=%s, Ten CD=%s, Ca si=%s, Gia ban=%.2f, Nam phat hanh=%d]",
                maso, tenCD, casi, giaban, namphathanh
        );
    }
}
