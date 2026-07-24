import java.util.regex.Pattern;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> new_one = new ArrayList<>();
        
        for(String a : words){
            String[] new_two = a.split(Pattern.quote(String.valueOf(separator)));
            for(String b : new_two){

                if(!b.isEmpty())new_one.add(b);
            }
        }

        return new_one;
    }
}