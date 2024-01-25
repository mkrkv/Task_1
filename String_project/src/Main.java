public class Main {
    public static void main(String[] args) {

        String str = "один,два,три,четыре";
        System.out.println("1st example - using split of string: " + str);
        String separator = ",";
        String[] words = String_functional.split(str, separator);
        System.out.println("result:");
        int index_word = 1;
        for (String word : words) {
            System.out.println(index_word +")"+ word);
            index_word ++;
        }

        System.out.println("\n2nd example: using 'join'");
        String[] strings = {"Мир","Труд","Май"};
        for (String string : strings)
            System.out.println(string);
        String delimiter = ",";
        String result = String_functional.join(strings, delimiter);
        System.out.println("result:"+ "\n" + result);


        //using equalsIgnoreCase
        System.out.println("\n3rd example: using 'equalsIgnoreCase'");
        String str1 = "программирование";
        String str2 = "Программирование";
        System.out.println("first word:" + str1);
        System.out.println("second word:" + str2);
        boolean isEqual = String_functional.equalsIgnoreCase(str1, str2);
        System.out.println("result:" + isEqual);

        System.out.println("\n4th example: using 'replace'");
        String base = "Спорт это жизнь";
        String replaceable = "жизнь";
        String replacement = "полезно";
        System.out.println(base);
        String result_ = String_functional.replace(base, replaceable, replacement);
        System.out.println(result_ + "\n");

        System.out.println("\n5th example: using 'isEmpty'");
        String str3 = "Hello, World!";
        System.out.println(str3);
        String_functional.isEmpty(str3);

        System.out.println("\n6th example: using 'indexOf'");
        String exampleString1 = "Строка для поиска подстроки";
        String targetSub1 = "для";
        System.out.println("example string:" + exampleString1 + "\n" + "example substring:" + targetSub1);
        int result_index = String_functional.indexOf(exampleString1, targetSub1);
        if (result_index != -1) {
            System.out.println("Первое вхождение подстроки '" + targetSub1 + "' начинается с позиции: " + result_index);
        } else {
            System.out.println("Подстрока '" + targetSub1 + "' не найдена в строке" + "\n");
        }

        System.out.println("\n7th example: using 'lastIndexOf'");
        String exampleString2 = "Это пример строки для поиска примера в последнее вхождение";
        String targetSub2 = "пример";
        System.out.println("example string:" + exampleString2 + "\n" + "example substring:" + targetSub2);
        int result_lastIndex = String_functional.lastIndexOf(exampleString2, targetSub2);
        if (result_lastIndex != -1) {
            System.out.println("Последнее вхождение подстроки '" + targetSub2 + "' начинается с позиции " + result_lastIndex);
        } else {
            System.out.println("Подстрока '" + targetSub2 + "' не найдена в строке");
        }

        System.out.println("\n8th example: using 'substring'");
        String exampleString3 = "Это пример строки для извлечения подстроки";
        System.out.println("example string:" + exampleString3);
        int start = 4;
        int end = 10;
        System.out.println("Границы извлечения от " + start + " до " + end);
        String result_substring = String_functional.substring(exampleString3, start, end);
        System.out.println("Извлеченная подстрока: " + result_substring);

    }
}