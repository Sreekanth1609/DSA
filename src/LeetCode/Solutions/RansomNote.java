package LeetCode.Solutions;

import java.util.LinkedHashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public  static boolean canConstruct(String ransomNote, String magazine)
    {
        LinkedHashMap<Character,Integer> ransomNoteMap = new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> magazineMap = new LinkedHashMap<>();
        char[] temp = ransomNote.toCharArray();
        for(char val:temp)
        {
            if(ransomNoteMap.containsKey(val))
                ransomNoteMap.put(val,ransomNoteMap.get(val)+1);
            else
                ransomNoteMap.put(val,1);
        }
        temp = magazine.toCharArray();
        for(char val:temp)
        {
            if(magazineMap.containsKey(val))
                magazineMap.put(val,magazineMap.get(val)+1);
            else
                magazineMap.put(val,1);
        }
        System.out.println(ransomNoteMap+" "+magazineMap);
        for(Character key : ransomNoteMap.keySet())
        {
            if(magazineMap.get(key) !=null) {
                if (ransomNoteMap.get(key) > magazineMap.get(key))
                    return false;
            }
            else
                return false;
        }

        return true;

    }
}
