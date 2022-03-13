import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateTheArea(){
        Triangle triangle = new Triangle(new Point(5, 10), new Point (2, 8), new Point(3, 5));
        assertEquals("area calculated for Triangle{p1=Point[x=5.0, y=10.0], p2=Point[x=2.0, y=8.0], p3=Point[x=3.0, y=5.0]}", triangle.getArea());
    }

}