
class StaffPartTime extends Staff {
    int soGioLamViec;
    int luongTheoGio;

    public StaffPartTime(String staffID, String name, int age, String telephone, String email,
                            int soGioLamViec,int luongTheoGio) {
        super(staffID, name, age, telephone, email);
        this.soGioLamViec = soGioLamViec;
        this.luongTheoGio = luongTheoGio;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }
    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    public int getLuongTheoGio() {
        return luongTheoGio;
    }
    public void setLuongTheoGio(int luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return soGioLamViec * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lương Parttime: " + tinhLuong();
    }
}