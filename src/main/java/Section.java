public final class Section extends Polygon{

    private Point p1;
    private Point p2;

    public Section(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override //getClass() used instead of overwritting toString()
    public String getArea() {
        String area = String.format("area calculated for %s", this.getClass());
        return area;
    }
}
