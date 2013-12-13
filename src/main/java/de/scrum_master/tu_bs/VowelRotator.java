package de.scrum_master.tu_bs;

public class VowelRotator {
	public String encode(String originalText) {
		return rotate(-1, originalText);
	}

	public String decode(String encodedText) {
		return rotate(+1, encodedText);
	}



    char rotateChar(int n, char c) {
        char [] vowelsLow= {'a','e','i','o','u'};

        boolean upperCase=Character.isUpperCase(c);

        c = Character.toLowerCase(c);

        int pos = 0;

        while ( pos < 5 && vowelsLow[pos] != c) pos++;

        if (pos < 5) {

            pos += (5 + n);
            pos %= 5;

            c = vowelsLow[pos];
        }

        if (upperCase) c = Character.toUpperCase(c);

        return c;
    }


    String rotate(int n, String s) {

        String r="";


        for (char c:s.toCharArray()){

            r += rotateChar(n, c);

        }

        return r;
    }



}
