import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TercelPiece {
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    
    public TercelPiece(int x, int y, String name){
        perilandaBoardTiles[x][y].setBackground(Color.BLUE);
        if(name == "player1tercel"){
           if(perilandaBoardTiles[x][y].get_X() != 0){
               int upX = x;
               boolean upEdge = false;
               while(upEdge == false){
                   if(perilandaBoardTiles[upX-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[upX-1][y].getPiecePlayer() == 2){ 
                       perilandaBoardTiles[upX-1][y].setBackground(Color.CYAN);
                       perilandaBoardTiles[upX-1][y].setState(true);
                       if(perilandaBoardTiles[upX-1][y].getPieceName() != "blankTile"){
                           upEdge = true;
                       }
                       upX = upX - 1;
                       if(upX == 0){
                           upEdge = true;
                       }
                   } else{ upEdge = true; }
               }
           }
           
           if(perilandaBoardTiles[x][y].get_X() != 6){
               int downX = x;
               boolean downEdge = false;
               while(downEdge == false){
                   if(perilandaBoardTiles[downX+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[downX+1][y].getPiecePlayer() == 2){
                       perilandaBoardTiles[downX+1][y].setBackground(Color.CYAN);
                       perilandaBoardTiles[downX+1][y].setState(true);
                       if(perilandaBoardTiles[downX+1][y].getPieceName() != "blankTile"){
                           downEdge = true;
                       }
                       downX = downX + 1;
                       if(downX == 6){
                           downEdge = true;
                       }
                   } else{ downEdge = true; }
               }
           }
           
           if(perilandaBoardTiles[x][y].get_Y() != 0){
               int leftY = y;
               boolean leftEdge = false;
               while(leftEdge == false){
                   if(perilandaBoardTiles[x][leftY-1].getPieceName() == "blankTile" || perilandaBoardTiles[x][leftY-1].getPiecePlayer() == 2){
                       perilandaBoardTiles[x][leftY-1].setBackground(Color.CYAN);
                       perilandaBoardTiles[x][leftY-1].setState(true);
                       if(perilandaBoardTiles[x][leftY-1].getPieceName() != "blankTile"){
                           leftEdge = true;
                       }
                       leftY = leftY - 1;
                       if(leftY == 0){
                           leftEdge = true;
                       }
                   } else{ leftEdge = true; }
               }
           }
           
           if(perilandaBoardTiles[x][y].get_Y() != 6){
               int rightY = y;
               boolean rightEdge = false;
               while(rightEdge == false){
                   if(perilandaBoardTiles[x][rightY+1].getPieceName() == "blankTile" || perilandaBoardTiles[x][rightY+1].getPiecePlayer() == 2){
                       perilandaBoardTiles[x][rightY+1].setBackground(Color.CYAN);
                       perilandaBoardTiles[x][rightY+1].setState(true);
                       if(perilandaBoardTiles[x][rightY+1].getPieceName() != "blankTile"){
                           rightEdge = true;
                       }
                       rightY = rightY + 1;
                       if(rightY == 6){
                           rightEdge = true;
                       }
                   } else{ rightEdge = true; }
               }
           }
            
        } else if(name == "player2tercel"){
            if(perilandaBoardTiles[x][y].get_X() != 0){
               int upX = x;
               boolean upEdge = false;
               while(upEdge == false){
                   if(perilandaBoardTiles[upX-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[upX-1][y].getPiecePlayer() == 1){ 
                       perilandaBoardTiles[upX-1][y].setBackground(Color.CYAN);
                       perilandaBoardTiles[upX-1][y].setState(true);
                       if(perilandaBoardTiles[upX-1][y].getPieceName() != "blankTile"){
                           upEdge = true;
                       }
                       upX = upX - 1;
                       if(upX == 0){
                           upEdge = true;
                       }
                   } else{ upEdge = true; }
               }
           }
           
           if(perilandaBoardTiles[x][y].get_X() != 6){
               int downX = x;
               boolean downEdge = false;
               while(downEdge == false){
                   if(perilandaBoardTiles[downX+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[downX+1][y].getPiecePlayer() == 1){
                       perilandaBoardTiles[downX+1][y].setBackground(Color.CYAN);
                       perilandaBoardTiles[downX+1][y].setState(true);
                       if(perilandaBoardTiles[downX+1][y].getPieceName() != "blankTile"){
                           downEdge = true;
                       }
                       downX = downX + 1;
                       if(downX == 6){
                           downEdge = true;
                       }
                   } else{ downEdge = true; }
               }
           }
           
           if(perilandaBoardTiles[x][y].get_Y() != 0){
               int leftY = y;
               boolean leftEdge = false;
               while(leftEdge == false){
                   if(perilandaBoardTiles[x][leftY-1].getPieceName() == "blankTile" || perilandaBoardTiles[x][leftY-1].getPiecePlayer() == 1){
                       perilandaBoardTiles[x][leftY-1].setBackground(Color.CYAN);
                       perilandaBoardTiles[x][leftY-1].setState(true);
                       if(perilandaBoardTiles[x][leftY-1].getPieceName() != "blankTile"){
                           leftEdge = true;
                       }
                       leftY = leftY - 1;
                       if(leftY == 0){
                           leftEdge = true;
                       }
                   } else{ leftEdge = true; }
               }
           }
           
           if(perilandaBoardTiles[x][y].get_Y() != 6){
               int rightY = y;
               boolean rightEdge = false;
               while(rightEdge == false){
                   if(perilandaBoardTiles[x][rightY+1].getPieceName() == "blankTile" || perilandaBoardTiles[x][rightY+1].getPiecePlayer() == 1){
                       perilandaBoardTiles[x][rightY+1].setBackground(Color.CYAN);
                       perilandaBoardTiles[x][rightY+1].setState(true);
                       if(perilandaBoardTiles[x][rightY+1].getPieceName() != "blankTile"){
                           rightEdge = true;
                       }
                       rightY = rightY + 1;
                       if(rightY == 6){
                           rightEdge = true;
                       }
                   } else{ rightEdge = true; }
               }
           }
        
        }
        
        tileObject.setCurrentMoveInAction(true);
    }
    
    public static void TercelMove(int previousX, int previousY, int currentX, int currentY, String pn){
        perilandaBoardTiles[previousX][previousY].setIcon(null);
        perilandaBoardTiles[previousX][previousY].setPieceName("blankTile");
        perilandaBoardTiles[previousX][previousY].setPiecePlayer(0);
        
        if(pn == "player1tercel"){
            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
            perilandaBoardTiles[currentX][currentY].setIcon(b);
            perilandaBoardTiles[currentX][currentY].setPieceName("player1tercel");
            perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
        } else if(pn == "player2tercel"){
            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
            perilandaBoardTiles[currentX][currentY].setIcon(b);
            perilandaBoardTiles[currentX][currentY].setPieceName("player2tercel");
            perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
        }
    }
}
