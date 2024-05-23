package LeetCode.Solutions.Strings.Arrays;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char arr[] = new char[]{'c','f','j'},target = 'a';
        System.out.println(nextGreatestLetter(arr,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char val:letters) {
            if(val >target){
                return val;
            }

        }
        return letters[0];

    }
}
