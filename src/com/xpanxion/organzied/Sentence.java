package Inher_Poly;

public class Sentence {
    String sentence;

    public Sentence(String s) {
        this.sentence = s;
    }

    public String getSentence() {
        return this.sentence;
    }



    public boolean equals(String a, String b) {
        boolean c = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                c= true;
            } else {
                c = false;
            }
        }
        return c;
    }
}



