package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IsomorphicStrings {

  public static void main(String[] args) {
    String one = "add";
    String two = "egg";
    System.out.println("is Isomorphic" + isIsomorphic(one, two));
    String s = "abcx";
    String t = "ahbgdc";
    System.out.println("is Subsequence: " + isSubsequence(s, t));
  }

  public static boolean isIsomorphic(String s, String t) {
    String[] arrS = s.split("");
    String[] arrT = t.split("");
    if (s.length() != t.length()) return false;
    Map<String, String> occurrences = new HashMap();
    for (int i=0; i<s.length(); i++) {
      if (occurrences.containsKey(arrS[i])) {
        if (!occurrences.get(arrS[i]).equals(arrT[i])) {
          return false;
        }
      } else {
        if (occurrences.containsValue(arrT[i])) return false;
        occurrences.put(arrS[i], arrT[i]);
      }
    }
    return true;
  }

  public static boolean isSubsequence(String s, String t) {
    if (s.length() == 0) return true;
    int pointerS = 0;
    int pointerT = 0;
    while (pointerT < t.length()) {
      if (t.charAt(pointerT) == s.charAt(pointerS)) {
        pointerS++;
        if (s.length() == pointerS) return true;
      }
      pointerT++;
    }
    return false;
  }

}
