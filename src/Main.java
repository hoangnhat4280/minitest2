public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[4];
        staff[0] = new StaffFullTime("FT01", "Nhat Nha Nhot", 22, "0123456789",
                "abc@gmail.com", 600000, 1000000, 12000000);
        staff[1] = new StaffFullTime("FT02", "Tran La Luot", 21, "0123654798",
                "xyz@gmail.com", 800000, 1600000, 15000000);
        staff[2] = new StaffPartTime("FT03", "Dang Van Nam", 22, "0123456789",
                "qwe@gmail.com", 10, 150000);
        staff[3] = new StaffPartTime("PT02", "Nguyen Tien Thanh", 18, "0234499126",
                "jkl@gmail.com", 12, 150000);


        for (Staff s : staff) {
            System.out.println("Ho va ten: " + s.getName() + ", Salary: " + s.salaryCalculation());
        }
    }
}




