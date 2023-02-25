public class Nhanvien {
    // Khai báo các thuộc tính của lớp Nhanvien
    private String tenNhanVien; // Tên nhân viên
    private double luongCoBan; // Lương cơ bản
    private double heSoLuong; // Hệ số lương
    private static double Luong_max = 10000000; // Lương tối đa

    // Hàm khởi tạo của lớp Nhanvien
    public Nhanvien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // Phương thức tính lương của nhân viên
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    // Phương thức in thông tin của nhân viên
    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương: " + tinhLuong());
    }

    // Phương thức tăng hệ số lương của nhân viên
    public boolean tangLuong(double tangHeSoLuong) {
        double newHeSoLuong = heSoLuong + tangHeSoLuong;
        if (tinhLuongMax(newHeSoLuong)) { // Kiểm tra lương của nhân viên có vượt quá lương tối đa không
            return false;
        }
        heSoLuong = newHeSoLuong;
        return true;
    }

    // Phương thức tính lương tối đa của nhân viên khi thay đổi hệ số lương
    private boolean tinhLuongMax(double newHeSoLuong) {
        return tinhLuong() > Luong_max && tinhLuong(newHeSoLuong) > Luong_max;
    }

    // Các phương thức get và set cho các thuộc tính của lớp Nhanvien
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public static double getLuong_max() {
        return Luong_max;
    }

    public static void setLuong_max(double luong_max) {
        Luong_max = luong_max;
    }
}
