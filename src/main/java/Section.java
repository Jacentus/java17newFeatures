public final class Section extends Polygon{

    private Point p1;
    private Point p2;

    public Section(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String getArea() {
        String area = String.format("area calculated for Section");
        return area;
    }
}
