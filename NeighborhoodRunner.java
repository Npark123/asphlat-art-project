import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //creates a mural painter for the background 
MuralPainter Bob = new MuralPainter();
  Bob.paintBackground("Steelblue",32);

    
    HollowKnightPainter bob = new HollowKnightPainter();  
    bob.drawHollowKnight();

    
  }
 
}