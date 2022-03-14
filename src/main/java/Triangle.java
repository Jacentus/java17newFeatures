import lombok.*;

import javax.management.ConstructorParameters;

@AllArgsConstructor
@ToString
public final class Triangle extends Polygon {

    private Point p1;
    private Point p2;
    private Point p3;

    @Override
    public String getArea() {
        String area = String.format("area calculated for %s", this.toString());
        return area;
    }


}
