import java.util.Scanner;

public class StudentManagement {
    public void addInformationStudent(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã số sinh viên: ");
        student.setMaSV(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập vào họ và tên sinh viên: ");
        student.setName(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ: ");
        student.setAddress(scanner.nextLine());
    }
}
