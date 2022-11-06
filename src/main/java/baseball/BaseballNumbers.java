package baseball;

import java.util.List;
import java.util.regex.Pattern;

public class BaseballNumbers {

    private List<BaseballNumber> baseballNumbers;

    public boolean isNumericReadline(String readline) {
        return Pattern.matches("^[1-9]{3}", readline);
    }

}