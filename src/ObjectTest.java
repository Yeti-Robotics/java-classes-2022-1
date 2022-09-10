import java.util.Arrays;

public class ObjectTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers));
        int value = numbers[1];
        System.out.println(value);
        if(value % 2 == 0) {
            System.out.println(value + " is even");
        } else if(value % 2 == 1) {
            System.out.println(value + " is odd");
        }

        Weather currentWeather = Weather.CLOUDY;
        switch(currentWeather) {
            case CLEAR:
                System.out.println("the weather is nice");
                break;
            case CLOUDY:
                System.out.println("the weather is ok");
                break;
            case STORMY:
                System.out.println("the weather is not great");
                break;
        }

    }

    enum Weather {
        CLEAR,
        CLOUDY,
        STORMY
    }
}
