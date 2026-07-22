import java.util.regex.Pattern;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> new_split = new ArrayList<>();

        for (String s : words) {
            String[] new1 = s.split(Pattern.quote(String.valueOf(separator)));

            for (String m : new1) {
                if (!m.isEmpty()) {
                    new_split.add(m);
                }
            }
        }

        return new_split;
    }
}