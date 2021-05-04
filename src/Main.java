import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        List<Student> studentList = new ArrayList<>();
        int a;
        int n = 0;
        boolean check = true;
        do {
            System.out.println("=======> Menu quản lý <========");
            System.out.println("1. Thêm mới sinh viên: \n" +
                    "2. Hiển thị danh sách sinh viên: \n" +
                    "Nhập vào số khác để thoát chương trình");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên cần khai báo: ");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1) + " :");
                        Student student = new Student();
                        studentManagement.addInformationStudent(student);
                        studentList.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách toàn bộ sinh viên");
                    System.out.println("size"+studentList.size());
                    for (int i=0; i<studentList.size();i++){
                        System.out.println("i = "+i);
                        System.out.println(studentList.get(i));
                    }
                    break;
                default:
                    System.out.println("GoodBye");
                    check = false;
                    break;
            }
        } while (check);
    }

    }

