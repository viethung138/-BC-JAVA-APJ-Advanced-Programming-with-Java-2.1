import java.util.ArrayList;
import java.util.List;

public class PhoneNumberValidatorTest {
    public static void main(String[] args) {
        String[] testPhoneNumbers = {
            "(84)-(0978489648)",
            "(a8)-(22222222)",
            "(84)-(22b22222)",
            "(84)-(9978489648)"
        };

        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();

        List<String> validList = new ArrayList<> ();
        List<String> invalidList = new ArrayList<> ();

        for (String phoneNumber : testPhoneNumbers) {
            if (phoneNumberValidator.validate(phoneNumber)) {
                validList.add(phoneNumber);
            } else {
                invalidList.add(phoneNumber);
            }
        }

        System.out.println("Số điện thoại hợp lệ: " + String.join(", ", validList));
        System.out.println("Số điện thoại không hợp lệ: " + String.join(", ", invalidList));
    }
}
