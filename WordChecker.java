import java.util.ArrayList;
public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        boolean chain = true;
        for (int i = 0; i < wordList.size()-1; i++){
            String before = wordList.get(i);
            String after = wordList.get(i+1);
            if(after.indexOf(before) < 0){
                chain = false;
            }
        }
        return chain;
    }
    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
    public ArrayList<String> createList(String target) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < wordList.size(); i++){
            if (wordList.get(i).substring(0,3).equals("cat")){
                list.add(wordList.get(i).substring(3));
            }
        }

        return list;
    }
}