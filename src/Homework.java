import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {

        /** 1. Задан String "I love java" **/

        String text = "I love java";

        /** a) Посчитать, сколько букв в этой фразе **/
        System.out.println("В этой фразе " + text.length() + " букв");

        /** б) Вывести букву под индексом 4 **/
        /** С индексом 4 отображается пятый элемент, так как первый элемент в java имеет индекс 0 **/
        System.out.println("Буква под индексом 4 - это " + text.charAt(4));

        /** в) Вывести индекс буквы j **/
        System.out.println("Индекс буквы j - это " + text.indexOf("j"));

        /** г) Добавить в эту фразу "and QA Automation" (должно вывексти "I love java and QA Automation") **/
        System.out.println(text + " and QA Automation"); // первый способ //
        System.out.println(text.concat(" and QA Automation")); // второй способ //

        /** 2. Проверить через boolean что фраза "I love java" типа String **/

        boolean isString = text instanceof String; // isString = true, если text - это String//
        System.out.println(isString);
    }
}
