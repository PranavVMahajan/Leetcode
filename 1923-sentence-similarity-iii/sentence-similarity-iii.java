class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()> sentence2.length()) {
            return areSentencesSimilar(sentence2,sentence1);
        }
        String smallerWords[] = sentence1.split(" ");
        String largerWords[] = sentence2.split(" ");
        int st = 0;
        int end1 = smallerWords.length-1;
        int end2 = largerWords.length-1;
        //PrefixWord
        while(st<=end1 && smallerWords[st].equals(largerWords[st])) {
            st++;
        }
        //SufixWord
        while(st<=end1 && smallerWords[end1].equals(largerWords[end2])) {
            end1--;
            end2--;
        }
        return (st>end1);
    }
}