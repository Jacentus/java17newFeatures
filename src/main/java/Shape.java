sealed interface Shape permits Circle, Polygon {

    String getArea();

    default String getDiameter(){
        Shape shape = this;
        String type;
        switch (shape){
            case Triangle t -> { return "Triangle";}
            case Circle c -> { return "Circle";}
            case Section s -> { return "Section";}
            default -> { return "Error, no such shape has been found";}
        }
    }

}
