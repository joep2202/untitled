package MainClass;

public class Main {


    private void run() {
        System.out.println("hello joep");

        SayBye();
    }

    public void SayBye() {
        System.out.println("kbye");
    }


    public static void main(String[] args) {
        new Main().run();
    }

}

