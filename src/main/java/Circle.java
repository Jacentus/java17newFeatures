record Circle(Point point, double radius) implements Shape {

    public Circle(Point point, double radius) {
        if(radius<0) throw new IllegalArgumentException();
        else {
            this.point = point;
            this.radius = radius;
        }
    }

    @Override
    public String getArea() {
        String area = String.format("area calculated for %s", this.toString());
        return area;
    }
}
