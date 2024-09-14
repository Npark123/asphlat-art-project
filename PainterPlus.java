import org.code.neighborhood.*;

public class PainterPlus extends Painter {

//turns left 3 times to turn right 
      public void turnRight()   {
  turnLeft();
  turnLeft();
 turnLeft();
    }
  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
    }
  //moves untill it cant anymore 
    public void moveFast(){
      while(canMove()){
        move();
      }
    }

  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }
    
  }
  public void paintDonut(String color){
   while(hasPaint()){
    move();
paint(color);
    turnRight();
    move();
    paint(color);
     
  }
  }
    
  }
