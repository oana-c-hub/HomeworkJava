public class homework5 {
    public static void main(String[] args) {


//  1. Reverse a String
//  Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh".

        System.out.println("1. Reverse String: " + reverseString("hello"));

//  2. Palindrome Checker
//  Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

        System.out.println("2. Palindrome: " + isPalindrome("madam"));

//  3. Concatenate Multiple Strings
//  Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.

        System.out.println("3. Concatenate Strings: " + concatenateStrings(new String[]{"Java", " ", "Rocks!"}));

//  4. Removing Vowels
//  Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.

        System.out.println("4. Remove Vowels: " + removeVowels("education"));

//  5. Word Capitalizer
//  Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.

        System.out.println("5. Capitalize Words: " + capitalizeWords("java is powerful"));

//  6. String Replacement
//  Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring. For instance, replace "cat" with "dog" in the string "The cat sat on the mat."

        System.out.println("6. Replace Substring: " + replaceSubstring("The cat sat on the mat", "cat", "dog"));

//  7. Duplicate Character Remover
//  Description: Design a program using StringBuilder that removes duplicate characters from a string. For example, "balloon" should become "balon".

        System.out.println("7. Remove Duplicates: " + removeDuplicateChars("balloon"));

//  8. Inserting at Index
//  Description: Write a Java program that inserts a given string into another string at a specified index using the StringBuilder class.

        System.out.println("8. Insert at Index: " + insertAtIndex("HelloWorld", "Java", 5));

//  9. Frequency Counter
//  Description: Using StringBuilder, write a program that counts the frequency of each character in a string.

        System.out.println("9. Character Frequency: " + charFrequency("banana"));

//  10. Morse Code Converter
//  Description: Create a program that takes in a string and converts it to Morse code using the StringBuilder class. For simplicity, you can assume the input string only contains alphabets and numbers.

        System.out.println("10. Morse Code: " + toMorseCode("hello123"));

//  11. Encode and Decode using Caesar Cipher
//  Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class. The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet. For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on.

        System.out.println("11. Caesar Encode: " + caesarCipher("ABC", 2, true));
        System.out.println("11. Caesar Decode: " + caesarCipher("CDE", 2, false));

//  12. CamelCase to Snake_case Converter
//  Description: Write a program using StringBuilder to convert a given CamelCase string to snake_case. For instance, "thisIsCamelCase" would become "this_is_camel_case".

        System.out.println("12. Camel to Snake: " + camelToSnake("thisIsCamelCase"));

//  13. Expand Compressed Strings
//  Description: Given a compressed string like "a3b2c4", expand it to "aaabbc", making use of the StringBuilder class.

        System.out.println("13. Expand Compressed: " + expandCompressed("a3b2c1"));

//  14. Remove Comments from Code
//  Description: Create a Java program using StringBuilder that removes all single line (//) and multi-line (/* */) comments from a provided piece of code.

        System.out.println("14. Remove Comments:\n" + removeComments("int a = 0; // comment\n/* block comment */\nint b = 1;"));

//  15. Anagram Checker
//  Description: Develop a program that checks if two provided strings are anagrams of each other using the StringBuilder class. Anagrams are words or phrases made up of the same characters.

        System.out.println("15. Anagram Check: " + isAnagram("listen", "silent"));

//  16. Toggling Case
//  Description: Design a program using StringBuilder that toggles the case of every character in a given string. For example, "HelLo" should become "hELlO".

        System.out.println("16. Toggle Case: " + toggleCase("HelLo"));

//  17. String Interleaver
//  Description: Write a program using StringBuilder that interleaves two strings. For instance, given "abc" and "123", the result should be "a1b2c3".

        System.out.println("17. Interleave Strings: " + interleaveStrings("abc", "1234"));

//  18. Pattern Recognition
//  Description: Design a Java program using StringBuilder that checks if a given pattern repeats in a string. For instance, given the string "ababab", the repeating pattern is "ab".

        System.out.println("18. Repeating Pattern: " + findRepeatingPattern("ababab"));

//  19. Encode Strings with Run-Length Encoding (RLE)
//  Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm. For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".

        System.out.println("19. Run-Length Encode: " + runLengthEncode("AAABBBCCDAA"));

//  20. Balanced Parenthesis Checker
//  Description: Develop a program that checks if a string has balanced parentheses ((, ), {, }, [, and ]) using StringBuilder. The program should return true if the parentheses in the string are balanced and false otherwise.

        System.out.println("20. Balanced Parentheses: " + isBalanced("{[()]}"));
    }

    //1.
    public static String reverseString (String input){
        return new StringBuilder(input).reverse().toString();
    }

    //2.
    public static boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }

    //.3
    public static String concatenateStrings(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) sb.append(s);
        return sb.toString();
    }

    //.4
    public static String removeVowels(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!"aeiouAEIOU".contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //.5
    public static String capitalizeWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return sb.toString().trim();
    }

    //.6

    public static String replaceSubstring(String input, String target, String replacement) {
        return new StringBuilder(input.replace(target, replacement)).toString();
    }

    //.7

    public static String removeDuplicateChars(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //.8
    public static String insertAtIndex(String base, String toInsert, int index) {
        StringBuilder sb = new StringBuilder(base);
        sb.insert(index, toInsert);
        return sb.toString();
    }

    //.9
    public static String charFrequency(String input) {
        int[] freq = new int[256];
        for (char c : input.toCharArray()) freq[c]++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                sb.append((char) i).append(":").append(freq[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
    //.10
    public static String toMorseCode(String input) {
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----."
        };
        StringBuilder sb = new StringBuilder();
        input = input.toUpperCase();
        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') sb.append(morse[c - 'A']).append(" ");
            else if (c >= '0' && c <= '9') sb.append(morse[c - '0' + 26]).append(" ");
        }
        return sb.toString().trim();
    }
    //.11
    public static String caesarCipher(String input, int shift, boolean encode) {
        StringBuilder sb = new StringBuilder();
        shift = encode ? shift : -shift;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                sb.append((char) ((c - base + shift + 26) % 26 + base));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //.12
    public static String camelToSnake(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append("_").append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //.13
    public static String expandCompressed(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));
            sb.append(String.valueOf(ch).repeat(count));
        }
        return sb.toString();
    }

    //.14
    public static String removeComments(String code) {
        StringBuilder sb = new StringBuilder();
        boolean inBlock = false;
        String[] lines = code.split("\n");
        for (String line : lines) {
            if (!inBlock) {
                if (line.contains("//")) {
                    sb.append(line, 0, line.indexOf("//")).append("\n");
                } else if (line.contains("/*")) {
                    inBlock = true;
                    sb.append(line, 0, line.indexOf("/*"));
                } else {
                    sb.append(line).append("\n");
                }
            } else {
                if (line.contains("*/")) {
                    inBlock = false;
                    int end = line.indexOf("*/") + 2;
                    if (end < line.length()) {
                        sb.append(line.substring(end)).append("\n");
                    }
                }
            }
        }
        return sb.toString().trim();
    }

    //.15
    public static boolean isAnagram(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1.replaceAll("\\s", "").toLowerCase());
        StringBuilder sb2 = new StringBuilder(s2.replaceAll("\\s", "").toLowerCase());
        char[] arr1 = sb1.toString().toCharArray();
        char[] arr2 = sb2.toString().toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }

    //.16
    public static String toggleCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return sb.toString();
    }

    //.17
    public static String interleaveStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int len = Math.max(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (i < s1.length()) sb.append(s1.charAt(i));
            if (i < s2.length()) sb.append(s2.charAt(i));
        }
        return sb.toString();
    }

    //.18
    public static String findRepeatingPattern(String input) {
        int len = input.length();
        for (int i = 1; i <= len / 2; i++) {
            String pattern = input.substring(0, i);
            StringBuilder sb = new StringBuilder();
            while (sb.length() < len) {
                sb.append(pattern);
            }
            if (sb.toString().equals(input)) {
                return pattern;
            }
        }
        return "No repeating pattern";
    }

    //.19
    public static String runLengthEncode(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }

        sb.append(count).append(input.charAt(input.length() - 1));
        return sb.toString();
    }

    //.20
    public static boolean isBalanced(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
