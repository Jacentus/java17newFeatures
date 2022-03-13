
record Point(double x, double y) {

    public String distance(Point p){
        String distance = String.format("distance() called for %s taking as argument %s", this.toString(), p.toString());
        return distance;
    }


}
