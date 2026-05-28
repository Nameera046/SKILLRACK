import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mask = 0;

        for(int i = 1; i < 10; i += 2)
        {
            mask |= (1 << i);
        }

        System.out.print(n | mask);
    }
}
