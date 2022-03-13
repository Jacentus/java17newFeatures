import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectionTest {

    @Test
    void shouldCalculateTheArea(){
        Section section = new Section(new Point(5, 10), new Point (15, 20));
        assertEquals("area calculated for class Section", section.getArea());
    }

}