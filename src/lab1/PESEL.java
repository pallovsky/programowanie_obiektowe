package lab1;

public class PESEL {
    private static String pesel;

    public PESEL(String pesel){
        this.pesel = pesel;
    }

    public static boolean checkPesel(String pesel){
            int[] wagi =  {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
            int expectedLastNumber=0;
            for (int i=0; i<10; i++){
                int peselToInt = Character.getNumericValue(pesel.charAt(i));
                expectedLastNumber=expectedLastNumber + wagi[i]*peselToInt;
        }
            expectedLastNumber = Math.abs((expectedLastNumber%10 - 10)%10);

            if ( Character.getNumericValue(pesel.charAt(10)) == expectedLastNumber){
                return true;}
            else
                return false;

    }
    public static void main(String[] argv){

        PESEL przyklad = new PESEL("98051905497");
        if(przyklad.checkPesel(przyklad.pesel)){
        System.out.print("dziala");}
    }

}
