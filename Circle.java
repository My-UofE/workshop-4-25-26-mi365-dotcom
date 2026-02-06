public class Circle{

    private double radius;
    private double originX;
    private double originY;

    public static final double pi = 3.14159;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius >= 0){
            this.radius = radius;
        }
    }

    public double getOriginX(){
        return originX;
    }
    
    public void setOriginX(double originX){
        this.originX = originX;
    }

    public double getOriginY(){
        return originY;
    }

    public void setOriginY(double originY){
        this.originY = originY;
    }

    public Circle(double radius, double originX, double originY){
        setRadius(radius);
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius){
        setRadius(radius);
        this.originX = 0.0;
        this.originY = 0.0;
    }

    public Circle(){
        this.radius = 1.0;
        this.originX = 0.0;
        this.originY = 0.0;
    }

    public double getArea(){
        return getRadius() * getRadius() * pi;
    }

    public double getCircumference(){
        return getRadius() * 2 * pi;
    }

    public void move(double dx, double dy){
        originX += dx;
        originY += dy;
    }

    public void scale(double factor){
        if (factor >= 0){
            radius *= factor;
        }
    }

    public boolean isOverlappedWith(Circle other){
        double dx = this.originX - other.originX;
        double dy = this.originY - other.originX;  
        double distance = (dx * dx) + (dy * dy);
        return distance < (this.radius + other.radius);
    }
    public boolean isEnclosedBy(Circle other) {
        double dx = this.originX - other.originX;
        double dy = this.originY - other.originY;
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance + this.radius <= other.radius;
    }

    // Describe circle as string
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", origin=(" + originX + "," + originY + ")]";
    }
}

