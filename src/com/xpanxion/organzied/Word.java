package Inher_Poly;

public class Word extends Sentence{
    String noVowelsWord;

    public Word(String r, String w){
        super(r);
        w = w.replaceAll("[aeiouAEIOU]", "");
        this.noVowelsWord = w;
    }

    public String getNoVowelsWord() {
        return noVowelsWord;
    }
    public boolean isSubstring(){
        return (getSentence().contains(getNoVowelsWord()));
    }
}
