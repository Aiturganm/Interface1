public class Main {
    public static void main(String[] args) {
        Swimable[] oceanarium = {new Shark(), new Duck(), new Turtle()};
        for (Swimable ocnrm:oceanarium) {
            ocnrm.method();
        }
    }
}