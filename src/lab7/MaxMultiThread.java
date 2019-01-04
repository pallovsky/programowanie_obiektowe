package lab7;

public class MaxMultiThread {

    public static void main(String[] args) throws InterruptedException {
        GenerateRandoms a = new GenerateRandoms();
        GenerateRandoms.fill();

    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for( int i=0; i<10; i++ )
            System.out.println("Nowy wątek!");
    }

}