
abstract class Staff {
    String staffID;
    String name;
    int age;
    String telephone;
    String email;


    public Staff(String staffID, String name, int age, String telephone, String email) {
        this.staffID = staffID;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
    }

    public String getStaffID() {
        return staffID;
    }
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "Mã: " + staffID + ", Họ tên: " + name + ", Tuổi: " + age +
                ", SĐT: " + telephone + ", Email: " + email;
    }
}



