import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ChiefPiece {
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    
    public ChiefPiece(int x, int y, String name){
        perilandaBoardTiles[x][y].setBackground(Color.BLUE);
        
        if(name == "player1chief"){
            if(perilandaBoardTiles[x][y].get_X() != 0){
                if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 2){
                    perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                    perilandaBoardTiles[x-1][y].setState(true);
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 6){
                if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 2){
                    perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                    perilandaBoardTiles[x+1][y].setState(true);
                }
            }
            
            if(perilandaBoardTiles[x][y].get_Y() != 0){
                if(perilandaBoardTiles[x][y-1].getPieceName() == "blankTile" || perilandaBoardTiles[x][y-1].getPiecePlayer() == 2){
                    perilandaBoardTiles[x][y-1].setBackground(Color.CYAN);
                    perilandaBoardTiles[x][y-1].setState(true);
                }
            }
            
            if(perilandaBoardTiles[x][y].get_Y() != 6){
                if(perilandaBoardTiles[x][y+1].getPieceName() == "blankTile" || perilandaBoardTiles[x][y+1].getPiecePlayer() == 2){
                    perilandaBoardTiles[x][y+1].setBackground(Color.CYAN);
                    perilandaBoardTiles[x][y+1].setState(true);
                }
            }
        } else if(name == "player2chief"){
            if(perilandaBoardTiles[x][y].get_X() != 0){
                if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 1){
                    perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                    perilandaBoardTiles[x-1][y].setState(true);
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 6){
                if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 1){
                    perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                    perilandaBoardTiles[x+1][y].setState(true);
                }
            }
            
            if(perilandaBoardTiles[x][y].get_Y() != 0){
                if(perilandaBoardTiles[x][y-1].getPieceName() == "blankTile" || perilandaBoardTiles[x][y-1].getPiecePlayer() == 1){
                    perilandaBoardTiles[x][y-1].setBackground(Color.CYAN);
                    perilandaBoardTiles[x][y-1].setState(true);
                }
            }
            
            if(perilandaBoardTiles[x][y].get_Y() != 6){
                if(perilandaBoardTiles[x][y+1].getPieceName() == "blankTile" || perilandaBoardTiles[x][y+1].getPiecePlayer() == 1){
                    perilandaBoardTiles[x][y+1].setBackground(Color.CYAN);
                    perilandaBoardTiles[x][y+1].setState(true);
                }
            }
        }
        
        tileObject.setCurrentMoveInAction(true);
    }
    
    public static void ChiefMove(int previousX, int previousY, int currentX, int currentY, String pn){
        perilandaBoardTiles[previousX][previousY].setIcon(null);
        perilandaBoardTiles[previousX][previousY].setPieceName("blankTile");
        perilandaBoardTiles[previousX][previousY].setPiecePlayer(0);
        
        if(pn == "player1chief"){
            Icon b = new ImageIcon(PerilandaBoard.player1chief);
            perilandaBoardTiles[currentX][currentY].setIcon(b);
            perilandaBoardTiles[currentX][currentY].setPieceName("player1chief");
            perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
        } else if(pn == "player2chief"){
            Icon b = new ImageIcon(PerilandaBoard.player2chief);
            perilandaBoardTiles[currentX][currentY].setIcon(b);
            perilandaBoardTiles[currentX][currentY].setPieceName("player2chief");
            perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
        }
    }
}
