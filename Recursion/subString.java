public class subStrings {
    public static void main(String[] args) {
        String input = "ABCABA";
        int count = countContinuousSubstrings(input, input.length() - 1);
        System.out.println("Count of continuous substrings starting at the end with the same character: " + count);
    }

    public static int countContinuousSubstrings(String input, int endIndex) {
        if (endIndex <= 0) {
            return 0;
        }

        int count = (input.charAt(endIndex) == input.charAt(endIndex - 1)) ? 1 : 0;
        count += countContinuousSubstrings(input, endIndex - 1);

        return count;
    }
}
