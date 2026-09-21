class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("abc");
        s1.setClasses("a1");
        System.out.println("Cập nhật thông tin thành công!");
    }
}