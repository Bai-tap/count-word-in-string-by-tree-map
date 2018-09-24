import java.util.Map;
import java.util.TreeMap;

public class CountWordByTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        String string = "what do you mean what do you fking do";
        String[] myStrings = string.split(" ");
        int count = 0;
        for (int i = 0; i < myStrings.length; i++) {
            for (int j = 0; j < myStrings.length; j++) {
                if (myStrings[j].equals(myStrings[i])) {
                    count++;
                }
            }
            treeMap.put(myStrings[i], count);
            count = 0;
        }

        treeMap.forEach((key, value) -> System.out.printf("word: \"%s\" is appear %s\n", key, value));
    }
}
