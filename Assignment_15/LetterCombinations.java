import java.util.*;

public class LetterCombinations {
    private static final Map<Character, String> phoneMap = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(int index, String digits, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, digits, current, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits (2-9, max length 4): ");
        String input = sc.nextLine();

        if (input.length() < 1 || input.length() > 4 || !input.matches("[2-9]+")) {
            System.out.println("Invalid input. Enter 1 to 4 digits between 2 and 9 only.");
            return;
        }

        List<String> combinations = letterCombinations(input);
        if (combinations.isEmpty()) {
            System.out.println("No combinations found.");
        } else {
            System.out.println("Letter Combinations:");
            for (String comb : combinations) {
                System.out.println(comb);
            }
        }
    }
}
