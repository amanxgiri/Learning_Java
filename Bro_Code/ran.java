import java.util.Random;

public class ran {
    public static void main(String[] args) {

        Random random = new Random();

        int num;
        num = random.nextInt(1, 60);

        System.out.println(num);
    }

}
