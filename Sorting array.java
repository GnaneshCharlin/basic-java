import java.util.Arrays;
public class hello {
    public static void main(String[] args) {
        int numbers[] = {45, 12, 78, 34, 23};
        Arrays.sort(numbers);
        System.out.println("Sorted Array:");
       for (int charlie : numbers) {
           System.out.print(charlie + " ");
        }
    }
}
