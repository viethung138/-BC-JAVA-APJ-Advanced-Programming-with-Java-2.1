
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    private static final String PHONE_NUMBER_REGEX = "^\\\\(\\\\d{2}\\\\)-\\\\(0\\\\d{9}\\\\)$";

    private static final Pattern PATTERN = Pattern.compile(PHONE_NUMBER_REGEX);

    public PhoneNumberValidator() {

    }

    public boolean validate(String phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }
}
