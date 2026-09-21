import java.util.ArrayList;
import java.util.List;

public class ClassNameValidatorTest {
    public static void main(String[] args) {
        String[] testClasses = {"C0223G", "A0323K", "M0318G", "P0323A"};

        ClassNameValidator classNameValidator = new ClassNameValidator();

        List<String> validList = new ArrayList<> ();
        List<String> invalidList = new ArrayList<> ();
        
        for (String className : testClasses) {
            if (classNameValidator.validate(className)) {
                validList.add(className);
            } else {
                invalidList.add(className);
            }
        }

        System.out.println("Tên lớp hợp lệ: " + String.join(", ", validList));
        System.out.println("Tên lớp không hợp lệ: " + String.join(", ", invalidList));
    }
}
