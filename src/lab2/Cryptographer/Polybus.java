package lab2.Cryptographer;

public class Polybus implements Algorithm {

    private static char alphabet[] = {'a','b','c','d','e','f','g','h','i', 'k','l','m','n','o','p','q','r','s','t','u','v','w','x', 'y','z'};

    @Override
    public String crypt(String word) {
        word=word.replace('j', 'i');
        StringBuilder result = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            for (int j=0; j<25; j++){
                if(alphabet[j]==word.charAt(i)){
                    int number;
                    if (j<5) {
                        number = j+11;
                    }
                    else if (j<10){
                        number = j%5+21;
                    }
                    else if (j<15){
                        number = j%5+31;
                    }
                    else if (j<20){
                        number = j%5+41;
                    }
                    else {
                        number = j%5+51;
                    }
                    result.append(number);
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }

    @Override
    public String decrypt(String word) {
        String splitedWord[] = word.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i=0; i<splitedWord.length; i++){
            int number = Integer.parseInt(splitedWord[i]);
            int newNumber=0;
            if (number<16){
                newNumber = number%10;
            }
            else if (number<26){
                newNumber = number % 10 + 5;
            }
            else if (number<36){
                newNumber = number % 10 + 10;
            }
            else if (number<46){
                newNumber = number % 10 + 15;
            }
            else if (number<56){
                newNumber = number % 10 + 20;
            }
            result.append(alphabet[newNumber-1]);
        }
        return result.toString();
    }
}
