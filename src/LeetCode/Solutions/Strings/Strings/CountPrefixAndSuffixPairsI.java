package LeetCode.Solutions.Strings.Strings;

//Problem 3042
public class CountPrefixAndSuffixPairsI {

    public static void main(String[] args) {
        String[] words = {"a","aba","ababa","aa"};
        System.out.print(countPrefixSuffixPairs(words));
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
