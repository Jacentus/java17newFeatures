import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void shouldCalculateTheDistance(){
    Point p1 = new Point(2, 6);
    Point p2 = new Point(8, 10);
    assertEquals(p1.distance(p2), "distance() called for Point[x=2.0, y=6.0] taking as argument Point[x=8.0, y=10.0]");
    }

}