package java_27_9;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
//            String startChoice="empty";
            String startChoice;

//            System.out.print(startChoice);
//            do {
//
//                System.out.print("Bạn có muốn bắt đầu chương trình không? (yes/no): ");
//                startChoice = scanner.nextLine().trim(); // Loại bỏ khoảng trắng
//
//                if (startChoice.isEmpty()) {
//                    System.out.println("Giá trị không được rỗng. Vui lòng nhập lại.");
//                }
//            } while (startChoice.isEmpty()); // Lặp lại cho đến khi người dùng nhập giá trị hợp lệ

            System.out.print("Bạn có muốn bắt đầu chương trình không? (yes/no): ");
                startChoice = scanner.nextLine().trim();
            if (startChoice.equalsIgnoreCase("yes")) {
                System.out.println("Vui lòng chọn tính năng:");
                System.out.println("1. Tạo đối tượng Person và hiển thị thông tin");
                System.out.println("2. Tạo 4 đối tượng Sinh viên và hiển thị điểm trung bình");
                System.out.println("3. Tạo tài khoản ngân hàng và nạp rút tiền");
                System.out.println("4. Tạo đối tượng máy tính và hiển thị thông tin");
                System.out.println("5. Tạo hình tròn và hiển thị chu vi, diện tích");
                System.out.println("6. Tạo đối tượng động vật và in ra tiếng kêu");
                System.out.println("7. Tạo đối tượng xe hơi và in ra giảm giá");
                System.out.println("8. Tạo đối tượng nhân viên và in ra lương hàng năm");
                System.out.println("0. Thoát");

                // Nhập lựa chọn
                System.out.print("Lựa chọn của bạn: ");
                choice = scanner.nextInt();
                scanner.nextLine();  // Đọc ký tự newline sau số nhập vào

                switch (choice) {
                    case 1:
                        Person person = new Person("John Doe", 25, "Male");
                        person.gerInfor();
//            ?Tại sao nếu cho nhập Scanner thì startChoice nhập vào lần lập sau bị lỗi rỗng?

//                        Nhập thông tin sản phẩm từ người dùng
////                        System.out.print("Nhập tên sản phẩm: ");
//////                        String name = scanner.nextLine();
////
////                        System.out.print("Nhập giá của sản phẩm: ");
////                        int price = scanner.nextInt();
//
////                        System.out.print("Nhập số lượng sản phẩm: ");
////                        float quantity = scanner.nextInt();
//
//
//                        Product p1 = new Product("John",214,1233);
//                        p1.displayInformation();
                        break;

                    case 2:
                        // Tạo 4 đối tượng Sinh viên và hiển thị điểm trung bình
                        Student t1 = new Student("thomas",19,"95803285",5.0);
                        Student t2 = new Student("james",20,"95803286",8.0);
                        Student t3 = new Student("emma",18,"95803287",7.5);
                        Student t4 = new Student("oliver",19,"95803288",9.0);
                        System.out.println(t1.grade);
                        System.out.println(t2.grade);
                        System.out.println(t3.grade);
                        System.out.println(t4.grade);

                        break;

                    case 3:
                        // Tạo tài khoản ngân hàng và nạp rút tiền
                        BankAccount account = new BankAccount(10000);
                        System.out.println("Enter your Choice:");
                        System.out.println("1.Deposit or 2.Withdraw");
                        Scanner sc = new Scanner(System.in);
                        int choiceOption = sc.nextInt();
                        if(choiceOption == 1){
                            account.Deposit();
                        }
                        if(choiceOption == 2){
                            account.Withdraw();
                        }
                        if(choiceOption != 1 && choiceOption != 2){
                            System.out.println("Invalid choice.");
                        }
                        break;

                    case 4:
                        // Tạo đối tượng máy tính và hiển thị thông tin
                        Computer myComputer = new Computer("Dell","XpS 15",1500);
                        myComputer.displayInformation();
                        break;

                    case 5:
                        // Tạo hình tròn và hiển thị chu vi, diện tích
                        Circle circle = new Circle(34);
                        circle.CalculateArea();
                        circle.CalculatePerimeter();
                        break;

                    case 6:
                        // Tạo đối tượng động vật và in ra tiếng kêu
                        Animal dog = new Animal("Dog", "Woof");
                        dog.MakeSound();
                        break;

                    case 7:
                        // Tạo đối tượng xe hơi và in ra giảm giá
                        Car car = new Car("Toyota", "Camry", 2010, 2000000);
                        car.calculateDepreciation(2020);
                        break;

                    case 8:
                        // Tạo đối tượng nhân viên
                        Employee employee = new Employee("John Doe", 1, "Manager", 50000);
                        employee.calculateAnnualSalary();
                        break;

                    case 0:
                        // Thoát chương trình
                        System.out.println("Thoát chương trình.");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                        break;
                }

            } else {
                System.out.println("Thoát chương trình.");
                choice = 0;

            }

        } while (choice != 0);

        scanner.close();
    }
}
