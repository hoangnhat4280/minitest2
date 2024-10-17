import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[4];

        staff[0] = new StaffFullTime("FT01", "Nhat Nha Nhot", 22, "0123456789",
                "abc@gmail.com", 600000, 1000000, 12000000);
        staff[1] = new StaffFullTime("FT02", "Tran La Luot", 21, "0123654798",
                "xyz@gmail.com", 800000, 1600000, 15000000);
        staff[2] = new StaffPartTime("PT01", "Dang Van Nam", 22, "0123456789",
                "qwe@gmail.com", 10,150000);
        staff[3] = new StaffPartTime("PT02", "Nguyen Tien Thanh", 18, "0234499126",
                "jkl@gmail.com", 12,150000);

        double tongLuong = 0;
        for (Staff s : staff) {
            tongLuong += s.tinhLuong();
        }
        double luongTrungBinh = tongLuong / staff.length;
        System.out.println("Lương trung bình của công ty: " + luongTrungBinh);

        System.out.println("Nhân viên Fulltime có lương thấp hơn mức lương trung bình:");
        for (Staff s : staff) {
            if (s instanceof StaffFullTime && s.tinhLuong() < luongTrungBinh) {
                System.out.println(s);
            }
        }

        double tongLuongParttime = 0;
        for (Staff s : staff) {
            if (s instanceof StaffPartTime) {
                tongLuongParttime += s.tinhLuong();
            }
        }
        System.out.println("Tổng lương phải trả cho nhân viên parttime: " + tongLuongParttime);

        Arrays.sort(staff, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if (o1 instanceof StaffFullTime && o2 instanceof StaffFullTime) {
                    return Double.compare(o1.tinhLuong(), o2.tinhLuong());
                }
                return 0;
            }
        });

        System.out.println("Danh sách nhân viên fulltime sau khi sắp xếp theo lương tăng dần:");
        for (Staff s : staff) {
            if (s instanceof StaffFullTime) {
                System.out.println(s);
            }
        }
    }
}