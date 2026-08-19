
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    private final String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    private final Pattern PATTERN = Pattern.compile(CLASSNAME_REGEX);

    public ClassNameValidator() {

    }

    public boolean validate(String className) {
        if (className == null) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(className);
        return matcher.matches();
    }
}
