// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  
  public double getWidth(){
    return width;
  }

  public void setWidth(double width){
    this.width = width;
  }

  public double getHeight(){
    return height;
  }

  public void setHeight(double height){
    this.height = height;
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



  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }


  // second constructor: 
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  public Rectangle() {
    this.width = 1.0;
    this.height = 1.0;
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public void scale(double ScaleX, double ScaleY){
    width *= ScaleX;
    height *= ScaleY;
  }
  
  public void scale(double scaleFactor){
    scale(scaleFactor, scaleFactor);
  }

  public boolean isOverlappedWith(Rectangle r){
    if(this.originX + this.width < r.originX) {
      return false;
    }
    
    if(this.originX > r.width + r.originX) {
      return false;
    }

    if(this.originY + this.height < r.originY) {
      return false;
    }

    if(this.originY > r.height + r.originY) {
      return false;
    }
    else {
      return true;
    }
  }

  public double calcRatio(){
    return width/height;

  }

  public boolean isSquare(){
    if (calcRatio() > 0.999 && calcRatio() < 1.001) {
      return true; 
    }
    else{
      return false;
    }

  }

}
