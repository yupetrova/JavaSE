import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_06_03 {
    /*Проаналізувати синтаксичну правильність простих арифметичних виразів,
    /що містять числа та знаки операцій (дужки відсутні). Кількість пропусків між
    /числами та арифметичними операціями може бути довільною. 
    */

public static boolean check_exp(String expression) {
        String pattern = "^\\s*[+-]?\\d+\\s*(\\s*[+\\-*/]\\s*[+-]?\\d+\\s*)*$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(expression);
        
        return m.matches();
    }
    
    public static void main(String[] args) {
        String[] expressions = {
            "+2 - 57*33 + 25/ - 4",
            "1 + 2 - 3 * 4 / 5",
            "-10 * -5 + 3",
            "100 / +20",
            "   ",
            "5 * / 3"
        };
        
        System.out.println("ТЕСТ\n");
        
        int correct = 0;
        int total = expressions.length;
        
        for (String expr : expressions) {
            boolean isValid = check_exp(expr);
            String status = isValid ? "True" : "False";
            System.out.println(String.format("%-30s -> %s", "\"" + expr + "\"", status));
            
            if (isValid) correct++;
        }
        
    }
}