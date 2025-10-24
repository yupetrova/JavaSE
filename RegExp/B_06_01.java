import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class B_06_01 {
/* У рядку містяться дати у форматі
 *DD.MM.YYYY
 *або підкреслення для запису дат вручну
 *__.__.____
 *Знайти всі дати і підкреслення у тексті та замінити їх поточною датою.
 *Підказка. Для отримання поточної дати, достатньо створити об'єкт класу
 *LocalDate, застосувавши метод
 *LocalDate.now();
 * https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
 */
public static void main(String[] args) throws IOException{
String DateFormat1 = "(?<d1>\\d{1,2}\\.(?<m1>\\d{1,2}\\.(?<y1>\\d{4})))";
String DateFormat2 = "(__\\.__\\.__)";
String DATE = DateFormat1 + "|" + DateFormat2;
String s = "Берестейська унія: 25.12.1596\nДата: __.__.____\nЛюблінська унія: 01.07.1569";
Pattern p = Pattern.compile(DATE);
Matcher m = p.matcher(s);
String result = m.replaceAll(match -> replace((Matcher) match));
System.out.println(result);
 }
public static String replace(Matcher m) {
String date = m.group();
LocalDate currentDate = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
String todayDate = currentDate.format(formatter);
return todayDate;
 }
}