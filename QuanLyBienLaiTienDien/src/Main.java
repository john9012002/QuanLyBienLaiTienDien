public class Main {
    public static void main(String[] args) throws Exception {
        KhachHang khachHang = new KhachHang("Nguyen Van A", "88 Nguyen Du", "1234");
        // tạo biên lai mới
        BienLai bienLai = new BienLai(khachHang, 100, 150);
        // in ra thông tin biên lai
        System.out.println("Thong tin bien lai:");
        System.out.println("Ho va ten chu ho: " + bienLai.getKhachHang().getHoTen());
        System.out.println("Dia chi: " + bienLai.getKhachHang().getSoNha());
        System.out.println("Ma so cong to dien: " + bienLai.getKhachHang().getMaSoCongTo());
        System.out.println("Chi so dien cu: " + bienLai.getChiSoDienCu());
        System.out.println("Chi so dien moi: " + bienLai.getChiSoDienMoi());
        System.out.println("So tien phai tra: " + bienLai.getSoTienPhaiTra());
    }
}
