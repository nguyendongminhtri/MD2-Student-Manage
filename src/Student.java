public class Student {
    private int MaSV;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int maSV, String name, String address) {
        MaSV = maSV;
        this.name = name;
        this.address = address;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int maSV) {
        MaSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
