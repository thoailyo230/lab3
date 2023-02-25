public class bai1 {
    // File bai1.java

// Định nghĩa gói "myPackage" chứa các lớp liên quan đến hình học
package myPackage;

// Lớp HinhVuong biểu diễn hình vuông
public class HinhVuong {
    // Thuộc tính canh biểu diễn cạnh của hình vuông
    private double canh;

    // Phương thức khởi tạo với tham số cạnh
    public HinhVuong(double canh) {
        this.canh = canh;
    }

    // Phương thức getter trả về giá trị của thuộc tính canh
    public double getCanh() {
        return canh;
    }

    // Phương thức setter thiết lập giá trị của thuộc tính canh
    public void setCanh(double canh) {
        this.canh = canh;
    }

    // Phương thức tính diện tích của hình vuông
    public double tinhDienTich() {
        return canh * canh;
    }
}

// Lớp HinhTron biểu diễn hình tròn
public class HinhTron {
    // Thuộc tính banKinh biểu diễn bán kính của hình tròn
    private double banKinh;

    // Phương thức khởi tạo với tham số bán kính
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    // Phương thức getter trả về giá trị của thuộc tính banKinh
    public double getBanKinh() {
        return banKinh;
    }

    // Phương thức setter thiết lập giá trị của thuộc tính banKinh
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Phương thức tính diện tích của hình tròn
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}

    
}
