public class StaffFullTime extends Staff {
    private int tienThuong;
    private int tienPhat;
    private int luongCung;

    public StaffFullTime(String staffId, String name, int age, String telephone, String email,
                            int tienThuong, int tienPhat, int luongCung) {

        super(staffId, name, age, telephone, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int salaryCalculation() {
        return luongCung + tienThuong - tienPhat;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Tien thuong: " + tienThuong);
        System.out.println("Tien phat: " + tienPhat);
        System.out.println("Luong cung: " + luongCung);
        System.out.println("Tong luong: " + salaryCalculation());
    }
}
