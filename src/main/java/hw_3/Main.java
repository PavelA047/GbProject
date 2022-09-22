package hw_3;

public class Main {
    public static void main(String[] args) {
        PingPong pp = new PingPong();

        new Thread(() -> {
            int i = 5;
            while (i > 0) {
                pp.ping();
                i--;
            }
        }).start();

        new Thread(() -> {
            int i = 5;
            while (i > 0) {
                pp.pong();
                i--;
            }
        }).start();
    }
}
