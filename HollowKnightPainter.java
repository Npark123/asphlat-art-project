import org.code.neighborhood.*;

public class HollowKnightPainter extends MuralPainter {

  public void drawHollowKnight(){
   
  drawBody();
    drawHead();
    colorHead();
    addCloakAndNail();
  }
// draws the body of the character 
  public void drawBody(){
    turnRight();
   moveFar(30);
    turnLeft();
    moveFar(13);
    paintLine("black",2);
    moveFar(3);
    paintLine("black",2);
    moveLeftTurnLeft();
    paintLine("black",4);
    move();
    paintLine("black",4);
  moveRightTurnRight();
    move();
    paintLine("black",4);
    move();
    paintLine("black",4);
    moveLeftTurnLeft();
    move();
    paintLine("black",12);
    moveRightTurnRight();
    move();
    paintLine("black",12);
    moveLeftTurnLeft();
    move();
    paintLine("black",11);
    moveRightTurnRight();
    move();
    
    paintLine("black",11);
    moveLeftTurnLeft();
    move();
    paintLine("black",11);
       moveRightTurnRight();
    paintLine("black",12);
    moveLeftTurnLeft();
    move();
    paintLine("black",12);
    moveRightTurnRight();
    paintLine("black",13);
    moveLeftTurnLeft();
    move();
    paintLine("black",14);
    
  }
  
// draws the outline of the head 
  public void drawHead(){
   turnAround();
    move();
    paintDiagonalLeft("black");
    paintDiagonalLeft("black");
turnRight();
    paintLine("black",8);
    turnRight();
    move();
    paint("black");
    move();
    move();
    paint("black");
    turnLeft();
    paintDiagonalLeft("black");
    paintDiagonalRight("black");
    paintDiagonalLeft("black");
turnRight();
    paintLine("black",5);
   turnRight();
     move();
      paintLine("black",2);
    paint("black");
    turnRight();
    paintDiagonalRight("black");
    turnLeft();
    paintDiagonalLeft("black");
  turnRight();
    paintDiagonalRight("black");
    turnLeft();
    paintLine("black",2);
    turnLeft();
    move();
    paint("black");
    paintDiagonalRight("black");
    paintDiagonalLeft("black");
    paintLine("black",6);
    turnLeft();
    move();
    paint("black");
    paintDiagonalRight("black");
    paintDiagonalLeft("black");
    paintLine("black",2);
    
    turnLeft();
    move();
    paint("black");
      turnRight();
    paintDiagonalRight("black");
    turnLeft();
    moveDiagonalLeft();
    turnAround();
    paintLine("black",2);
    paint("black");
    paintDiagonalRight("black");
    paintLine("black",4);
    paint("black");
    paintDiagonalRight("black");
    paintDiagonalLeft("black");
    paintDiagonalLeft("black");
    paintDiagonalRight("black");
    
    paintLine("black",8);
    turnRight();
    move();
    paint("black");
    
      }
 // colors the head and the eyes 
  public void colorHead(){
    move();
    paintLine("white",10);
    paint("lavender");
    move();
    paint("lavender");
    turnRight();
    move();
    paint("lavender");
    turnLeft();
    move();
    turnRight();
    paintLine("lavender",8);
    turnRight();
    move();
    paint("lavender");
    paintDiagonalLeft("lavender"); 
  
    paintDiagonalLeft("lavender");
    moveDiagonalRight();
    paintLine("white",5);
    moveRightTurnRight();
    move();
    move();
    paint("white");
    move();
    move();
    move();
    paint("white");
    paintDiagonalLeft("white");
    paintDiagonalRight("white");
    move();
    turnLeft();
    paintLine("white",7);
     turnLeft();
    move();
    paint("white");
    paintDiagonalRight("white");
    paintDiagonalLeft("white");
    move();
    move();
    move();
    paint("white");
    paintDiagonalRight("white");
    turnRight();
    paintLine("white",5);
   turnRight();
    move();
    paint("white");
    paintDiagonalLeft("white");
    paintDiagonalRight("white");
    turnAround();
    paintLine("white",3);
      moveRightTurnRight();
    paintLine("white",13);
    moveLeftTurnLeft();
    move();
    paintLine("white",13);
    moveRightTurnRight();
    move();
     paintLine("white",13);
    moveLeftTurnLeft();
    move();
    paintLine("white",13);
    moveRightTurnRight();
    move(); paintLine("white",13);
    moveLeftTurnLeft();
    move();
    paintLine("white",13);
    moveRightTurnRight();
    move();
    paintLine("white",13);
    moveLeftTurnLeft();
    move();
    move();
    paintLine("white",12);
    turnLeft();
    move();
   
    move();
    turnLeft();
    move();
    
    drawEye("black"); 
    moveFar(5);
    moveDiagonalRight();
    turnLeft();
    drawEye("black");
    
  }
  //colors the body to look like a cloak and nail 
  public void addCloakAndNail(){
    moveFar(7);
    turnLeft();
    moveFar(3);
    paint("silver");
      paintDiagonalLeft("silver");
    move();
    paint("gray");
    turnRight();
    move();
    paint("gray");
    turnLeft();
    move();
    paintDiagonalLeft("Darkslateblue");
    turnRight();
    move();
    move();
    turnRight();
    paintDiagonalRight("Darkslateblue");
      paintDiagonalLeft("Darkslateblue");
    paintDiagonalRight("Darkslateblue");
    paintDiagonalLeft("Darkslateblue");
    move();
    move();
    turnAround();
    paint("Darkslateblue");
    paintDiagonalRight("Darkslateblue");
    paintDiagonalLeft("slateblue");
     paintDiagonalRight("slateblue");
    paintDiagonalLeft("slateblue");
     paintDiagonalRight("darkslateblue");
    turnRight();
    moveFar(2);

    paint("slateblue");
    paintDiagonalRight("slateblue");
        
    paintDiagonalLeft("slateblue");
         paintDiagonalRight("slateblue");
turnAround();
    moveFar(7);
    turnLeft();
    move();

    paint("slateblue");
    move();
    paint("slateblue");
    paintDiagonalLeft("slateblue");
    turnRight();
    paintDiagonalRight("slateblue");
    turnLeft();
    paintDiagonalLeft("slateblue");
    turnRight();
    paintDiagonalRight("darkslateblue");
    turnAround();
    moveFar(3);
    paint("darkslateblue");
    moveFar(2);
    paint("darkslateblue");
    turnLeft();
    moveFar(6);
    
    paint("slateblue");
    turnAround();
    paintDiagonalRight("slateblue");
    paintDiagonalLeft("slateblue");
    move();
    move();
   
    paint("slateblue");
    
    
    

    
  }
}