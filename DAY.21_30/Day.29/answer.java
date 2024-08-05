class Solution {
    private final String[] digitToLetters = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder combination, int index) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        String letters = digitToLetters[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(result, digits, combination, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
