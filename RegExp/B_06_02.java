import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_06_02 {
    /* В заданому рядку знайти всі номери телефонів (з рисками та без рисок
    /всередині, з дужками та без, зі знаком «+» та без нього на початку).
    */ 
    public static void main(String[] args) throws IOException {
        String PhoneNum1 = "\\+\\d{12}";
        String PhoneNum2 = "\\d{12}";
        String PhoneNum3 = "\\d{10}";
        String PhoneNum4 = "\\+\\d{2}-\\d{3}-\\d{3}-\\d{4}";
        String PhoneNum5 = "\\+\\d{2}\\(\\d{3}\\)\\d{7}";
        String PhoneNum6 = "\\d{3}-\\d{3}-\\d{4}";

        String PhoneNum = PhoneNum1 + "|" + PhoneNum2 + "|" + PhoneNum3 + "|" + PhoneNum4 + "|" + PhoneNum5 + "|" + PhoneNum6;

                String TestData = """
            +380981234567
            +38-098-123-4567
            +38(098)1234567
            0981234567
            098-123-4567
            """;
        
        Pattern p = Pattern.compile(PhoneNum);
        Matcher m = p.matcher(TestData);
        
        System.out.println("номери телефонів:");
        while (m.find()) {
            System.out.println(m.group());
    }
    }
}
