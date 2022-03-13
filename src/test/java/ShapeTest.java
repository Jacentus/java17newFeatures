import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void shouldReturnValidTypeAsDiamater(){
            assertEquals("Circle", new Circle(new Point(2, 5), 10).getDiameter());
            assertEquals("Triangle", new Triangle(new Point(2, 5), new Point(10, 7), new Point(1, 5)).getDiameter());
            assertEquals("Section", new Section(new Point(2,6), new Point(4, 6)).getDiameter());
    }

}