class StaffFullTime extends Staff {
    double tienThuong;
    double tienPhat;
    double luongCung;


    public StaffFullTime(String staffID, String name, int age, String telephone, String email,
                            double tienThuong, double tienPhat, double luongCung) {
        super(staffID, name, age, telephone, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }
    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }
    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }
    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public double tinhLuong() {
        return luongCung + (tienThuong - tienPhat);
    }

    @Override
    public String toString() {
        return super.toString() + ", Lương Fulltime: " + tinhLuong();
    }
}
