package java_27_9;
import java.util.ArrayList;

public class PersonList {
    // Danh sách lưu trữ các đối tượng Person
    private ArrayList<Person> persons;

    // Constructor khởi tạo danh sách rỗng
    public PersonList() {
        persons = new ArrayList<>();
    }
    public void addPerson(Person person){
        persons.add(person);
        System.out.println("Đã thêm"+ person.getName());
    }
    //phương thức xóa đối tượng person
    public void removePerson(String name){
        for (Person person: persons){
            if(person.getName().equalsIgnoreCase(name)){
                persons.remove(person);
                System.out.println("Đã xóa:"+ name);
                return;
            }
        }
        System.out.println("Không tìm thấy Person có tên: "+ name);
    }
    public void findPerson(String name){
        for(Person person : persons){
            if(person.getName().equalsIgnoreCase(name)){
                System.out.println("Tìm thấy:");
                person.gerInfor();
                return;
            }
        }
        System.out.println("Không tìm thấy: " + name);
    }
    public void displayAllPersons() {
        if (persons.isEmpty()) { // Kiểm tra xem danh sách có trống không
            System.out.println("Danh sách rỗng."); // Thông báo nếu danh sách trống
        } else {
            System.out.println("Danh sách Person:");
            // Duyệt qua danh sách và hiển thị thông tin từng đối tượng
            for (Person person : persons) {
                person.gerInfor(); // Gọi phương thức hiển thị thông tin của từng đối tượng
            }
        }
    }
        public static void main(String[] args) {
            PersonList personList = new PersonList();

            // Tạo đối tượng Person
            Person p1 = new Person("John", 25, "Male");
            Person p2 = new Person("Emma", 22, "Female");
            Person p3 = new Person("Thomas", 30, "Male");

            // Thêm đối tượng vào danh sách
            personList.addPerson(p1);
            personList.addPerson(p2);
            personList.addPerson(p3);

            // Hiển thị tất cả đối tượng
            personList.displayAllPersons();

            // Tìm kiếm đối tượng
            personList.findPerson("Emma");

            // Xóa đối tượng
            personList.removePerson("Thomas");

            // Hiển thị danh sách sau khi xóa
            personList.displayAllPersons();
        }


}
