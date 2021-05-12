import java.util.LinkedHashMap;
import java.util.Map;

/**
 * First Non Repeating Character
 *
 * Return the index of the first non-repeating character in a given string. If there are no non-repeating characters then return -1.
 *
 * Examples:
 *
 * s = "swecareers"
 * return 1.
 * s = "loveswecareers", return 0.
 *
 * Note: Assume the string only contains lowercase letters.
 */

public class  firstNonRepeatingCharacter {
    public int main(String[] args){
        String s ="swecareers";

        //create hash map
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        //convert string into array of char
        char[] strArray = s.toCharArray();

        //checking each char of a strArray
        for(char c: strArray){
            if(hm.containsKey(c)){
                //if char is present in hm increment it's count by 1
                hm.put(c, hm.get(c) + 1);
            }else{
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                hm.put(c, 1);
            }
        }

        for(int i=0;i<strArray.length;i++){
            if(hm.get(strArray[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
