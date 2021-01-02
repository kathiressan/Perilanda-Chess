import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TridentPiece {
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    
    public TridentPiece(int x, int y, String name){
        perilandaBoardTiles[x][y].setBackground(Color.BLUE);
        if(name == "player1tridentup"){
            if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 2){
                perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                perilandaBoardTiles[x-1][y].setState(true);
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
        } else if(name == "player2tridentup"){
            if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 1){
                perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                perilandaBoardTiles[x-1][y].setState(true);
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
        
        } else if(name == "player1tridentdown"){
            if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 2){
                perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                perilandaBoardTiles[x+1][y].setState(true);
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
        
        } else if(name == "player2tridentdown"){
            if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 1){
                perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                perilandaBoardTiles[x+1][y].setState(true);
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
    
    public static void TridentMove(int previousX, int previousY, int currentX, int currentY, String pn){
        perilandaBoardTiles[previousX][previousY].setIcon(null);
        perilandaBoardTiles[previousX][previousY].setPieceName("blankTile");
        perilandaBoardTiles[previousX][previousY].setPiecePlayer(0);
        
        if(pn == "player1tridentup"){
            if(perilandaBoardTiles[currentX][currentY].get_X() != 0){
                Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1tridentup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1tridentdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            }
        } else if(pn == "player2tridentup"){
            if(perilandaBoardTiles[currentX][currentY].get_X() != 0){
                Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2tridentup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2tridentdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            }
        } else if(pn == "player1tridentdown"){
            if(perilandaBoardTiles[currentX][currentY].get_X() != 6){
                Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1tridentdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1tridentup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            }
        } else if(pn == "player2tridentdown"){
            if(perilandaBoardTiles[currentX][currentY].get_X() != 6){
                Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2tridentdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2tridentup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            }
        }
    }
}
