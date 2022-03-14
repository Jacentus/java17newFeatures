public class Main {

    public static void main(String[] args) {

        Point p = new Point(2, 5);
        Point p1 = new Point(5, 10);
        Point p2 = new Point(4, 2);

        Circle c1 = new Circle(p, 10);

        Section section1 = new Section(p, p2);

        Triangle triangle = new Triangle(p, p2, p2);

        System.out.println(p.distance(p2));

        System.out.println(c1.getArea());
        System.out.println(section1.getArea());
        System.out.println(triangle.getArea());

        //Circle c2 = new Circle(p2, -10);

        System.out.println(c1.getDiameter());

        System.out.println(section1.getDiameter());

        System.out.println(triangle.getDiameter());

    }

}
