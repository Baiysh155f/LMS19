import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<< Daytime for study>>> ");
        Weekable[] weekable = Weekable.values();
        for (Weekable w:weekable ) {
            System.out.print(w);
            System.out.println(" :"+w.getTimetable());
        }

    }
}