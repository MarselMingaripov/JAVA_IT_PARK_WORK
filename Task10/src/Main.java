import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {


        Square square = new Square("Square1");
        Rectangle rectangle = new Rectangle("Rectangle1");
        Triangle triangle = new Triangle("Triangle1");

        OutputStream outputStream = new FileOutputStream("output.txt");
        byte message1[] = (square.toString() + '\n').getBytes();
        outputStream.write(message1);

        byte message2[] = (triangle.toString() + '\n').getBytes();
        outputStream.write(message2);

        byte message3 [] = rectangle.toString().getBytes();
        outputStream.write(message3);

    }

}
