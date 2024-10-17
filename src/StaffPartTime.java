public class StaffPartTime extends Staff {
    private int soGioLamViec;
    private int luongTheoGio;

    public StaffPartTime(String staffID, String name, int age, String telephone, String email,
                            int soGioLamViec, int luongTheoGio) {
        super(staffID, name, age, telephone, email);
        this.soGioLamViec = soGioLamViec;
        this.luongTheoGio = luongTheoGio;
    }


    public int salaryCalculation() {
        return soGioLamViec * luongTheoGio;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("So gio lam viec: " + soGioLamViec);
        System.out.println("Luong theo gio: " + luongTheoGio);
        System.out.println("Tong luong: " + salaryCalculation());
    }
}
