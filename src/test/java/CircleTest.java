import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldThrowIllegalArgumentExceptionWhenRadiusIsNegative(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, ()-> {
            new Circle(new Point(-1,5), -10);
        });
        assertEquals(thrown.getClass(), IllegalArgumentException.class);
    }

    @Test
    void shouldCalculateTheArea(){
        Circle circle = new Circle(new Point(5, 10), 10);
        assertEquals("area calculated for Circle[point=Point[x=5.0, y=10.0], radius=10.0]", circle.getArea());
    }
}