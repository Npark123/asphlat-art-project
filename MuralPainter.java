import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class MuralPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLinesForBackground(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLinesForBackground(color, size);https://studio.code.org/s/csa1-2024/lessons/15/levels/1/sublevel/4#
        turnToEast();
      }
    }

    paintLinesForBackground(color, size);
    turnAround();
    moveToCorner();
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLinesForBackground(String color, int spaces) {
    setPaint(spaces);

    while (canMove()) {
      paint(color);

      if (canMove()) {
        move();
      }
    
    }
    paint(color);
  }

  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the MuralPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the MuralPainter to the bottom right corner
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
 //*Jacob P Code: moves how many spaces integer says
  public void moveFar(int move){
    for(int i = 0; i < move; i++){
      move();
    }
  }
    //paints line however many spaces the integer is
    public void paintLine(String color, int move) {
    
    for(int i = 0; i < move; i++){
     paint(color);
      move();
  }
}
  //Makes the painter move diagonally on its left side
  public void moveDiagonalLeft(){
    move();
    turnLeft(); 
    move(); 
  }
  //Makes the paint move diagonally on its right side 
  public void moveDiagonalRight(){
    move();
    turnRight();
    move();

  }
  //Makes the paint move diagonally on its left side and then paint chosen color 
  public void paintDiagonalLeft(String color){
     moveDiagonalLeft();
    paint(color);
    
  }
 // Makes the paint move diagonally on its right side and then paint chosen color 
  public void paintDiagonalRight(String color){
   moveDiagonalRight();
    paint(color);
  }
  //Painter moves right and then turns Right 
  public void moveRightTurnRight(){
    turnRight();
    move();
    turnRight();
    
  }
  //Painter moves Left and then turns Left 
  public void moveLeftTurnLeft(){
    turnLeft();
    move();
    turnLeft();
  }
  // Colors a 2x2 black square and around it to make and eye
  public void drawEye(String color){
    paint(color);
      move();
    turnRight();
    paint(color);
      move();
    turnRight();
    paint(color);
      move();
    turnRight();
    paint(color);
    move();
    paintDiagonalRight(color);
    paintDiagonalRight(color);
    move();
    paint(color); 
    paintDiagonalRight(color);
      move();
    paint(color); 
    paintDiagonalRight(color);
    move();
    paint(color); 
    paintDiagonalRight(color);
    
  }
}