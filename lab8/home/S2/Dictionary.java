import java.util.*;

class Dictionary {
    String word;
    String meaning;
    HashMap<String,String> dic = new HashMap<String,String>();
    public Dictionary(){
    }
    public Dictionary(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
    public boolean checkExists(String word) {
        return dic.containsKey(word);
    }
    public String findMeaning(String word) {
        return dic.get(word);
    }
    public void put(String word, String meaning) {
        dic.put(word,meaning);
    }
    public String get(String word) {
        return dic.get(word);
    }
}