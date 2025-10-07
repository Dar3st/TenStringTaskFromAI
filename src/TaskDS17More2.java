import java.util.*;

public class TaskDS17More2 {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat", "hello", "java", "world", "best", "Java", "back", "ackab"};
        Map<String, List<String>> result = AnagramGrouper.groupAnagrams(words);

        for (Map.Entry<String, List<String>> entry : result.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

class AnagramGrouper{
    /**
     * Метод преобразующий слово в анаграмму
     * @param words исходный массив строк
     * @return если в массиве есть строки, то возвращает значение key : value
     */
    public static Map<String, List<String>> groupAnagrams(String[] words){
        Map<String, List<String>> groupAnagrams = new HashMap<>();

        for(String word : words){
            char[] arrayChar = word.toLowerCase().toCharArray();

            Arrays.sort(arrayChar);

            String sortedWord = new String(arrayChar);

            if(!groupAnagrams.containsKey(sortedWord)){
                groupAnagrams.put(sortedWord, new ArrayList<>());
            }

            groupAnagrams.get(sortedWord).add(word);
        }
        return groupAnagrams;
    }
}