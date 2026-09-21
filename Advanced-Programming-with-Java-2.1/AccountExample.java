import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    private final Pattern PATTERN = Pattern.compile(ACCOUNT_REGEX);

    public AccountExample() {

    }

    public boolean validate(String accountName) {
        Matcher matcher = PATTERN.matcher(accountName);
        return matcher.matches();
    }
}
