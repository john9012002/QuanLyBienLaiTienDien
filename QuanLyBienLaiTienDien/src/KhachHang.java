public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maSoCongTo;

    public KhachHang(String hoTen, String soNha,String maSoCongTo){
        this.hoTen=hoTen;
        this.soNha=soNha;
        this.maSoCongTo=maSoCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
    
}