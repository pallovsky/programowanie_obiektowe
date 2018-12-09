package lab2.Cryptographer;

public class ROT11 implements Algorithm{

    private static int rotation=11;
    private static char alphabet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','w', 'y','z'};

    @Override
    public String crypt(String word) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            int count=0;
            for (int j=0; j<26; j++){
                if (alphabet[j]==word.charAt(i)){
                    if (count > 10){
                        count=count-rotation;
                    }
                    else {
                        count=count+26-rotation;
                    }
                    result.append(alphabet[count]);
                    break;
                }
                count=count+1;
            }
        }
        return result.toString();
    }

    @Override
    public String decrypt(String word) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            int count=0;
            for (int j=0; j<26; j++){
                if (alphabet[j]==word.charAt(i)){
                    if (count > 14){
                        count=count+rotation-25;
                    }
                    else {
                        count=count+rotation;
                    }
                    result.append(alphabet[count]);
                    break;
                }
                count=count+1;
            }
        }
        return result.toString();
    }
}

