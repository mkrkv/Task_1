import java.util.ArrayList;
import java.util.List;

public class String_functional {
    public static String[] split(String str, String separator) {

        if (str == null || separator == null) {
            throw new IllegalArgumentException("Строка и/или разделитель не могут быть null");
        }

        List<String> result = new ArrayList<>();
        int sepLength = separator.length();

        int currentPos = 0;
        int startIndex;

        while ((startIndex = str.indexOf(separator, currentPos)) != -1)
        {
            result.add(str.substring(currentPos, startIndex));
            currentPos = startIndex + sepLength;
        }

        result.add(str.substring(currentPos));
        return result.toArray(new String[0]);
    }

    public static String join(String[] strings, String delimiter)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++)
        {
            stringBuilder.append(strings[i]);
            if (i != strings.length - 1) {
                stringBuilder.append(delimiter);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }

        int length = str1.length();
        if (length != str2.length()) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2 && Character.toUpperCase(c1) != Character.toUpperCase(c2)) {
                return false;
            }
        }
        return true;
    }

    public static void isEmpty(String str)
    {
        if (str == null || str.length() == 0) {
            System.out.println("Строка пустая");
        }
        else{
            System.out.println("Строка не пустая");
        }
    }

    public static String replace(String words, String old_word, String new_word) {

        if (words == null || old_word == null || new_word == null) {
            throw new IllegalArgumentException("Input arguments cannot be null");
        }

        if (old_word.isEmpty()) {
            return words;
        }

        StringBuilder result = new StringBuilder();
        int startIndex = 0;
        int oldStrIndex;

        while ((oldStrIndex = words.indexOf(old_word, startIndex)) != -1) {
            result.append(words, startIndex, oldStrIndex);
            result.append(new_word);
            startIndex = oldStrIndex + old_word.length();
        }

        result.append(words, startIndex, words.length());

        return result.toString();
    }

    public static int indexOf(String str, String target) {
        for (int i = 0; i <= str.length() - target.length(); i++) {
            int j;
            for (j = 0; j < target.length(); j++)
            {
                if (str.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (j == target.length()) {
                return i;  // возвращаем индекс, если подстрока найдена
            }
        }
        return -1;  // возвращаем -1, если подстрока не найдена
    }

    public static int lastIndexOf(String str, String target)
    {
        for (int i = str.length() - target.length(); i >= 0; i--) {
            int j;
            for (j = 0; j < target.length(); j++) {
                if (str.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (j == target.length()) {
                return i;  // возвращаем индекс, если подстрока найдена
            }
        }
        return -1;  // возвращаем -1, если подстрока не найдена
    }

    public static String substring(String str, int beginIndex, int endIndex)
    {
        if (beginIndex < 0) {
            beginIndex = 0;
        }
        if (endIndex > str.length()) {
            endIndex = str.length();
        }
        if (beginIndex > endIndex) {
            throw new IllegalArgumentException("beginIndex should be less than or equal to endIndex");
        }

        char[] resultChars = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++)
        {
            resultChars[i - beginIndex] = str.charAt(i);
        }
        return new String(resultChars);
    }
}

