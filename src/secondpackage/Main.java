package secondpackage;

public class Main {
    public static void main(String[] args) {
            Baked[] baked = {new Bread(), new Pie(), new Bun()};
            for (int i = 0; i < baked.length; i++) {
                baked[i].methodBaked();
            }
    }
}
