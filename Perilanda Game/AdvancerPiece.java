import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AdvancerPiece {
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    public AdvancerPiece(int x, int y, String name){
        perilandaBoardTiles[x][y].setBackground(Color.BLUE);
        if(name == "player1advancerup" || name == "player2advancerup"){
            if(name == "player1advancerup"){
                if(perilandaBoardTiles[x-1][y].get_X() != 0){
                    if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 2){
                        perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x-1][y].setState(true);
                        
                        if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile"){
                            if(perilandaBoardTiles[x-2][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-2][y].getPiecePlayer() == 2){
                            perilandaBoardTiles[x-2][y].setBackground(Color.CYAN);
                            perilandaBoardTiles[x-2][y].setState(true);
                            }
                        }
                    } 
                } else{
                    if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 2){
                        perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x-1][y].setState(true);
                    }
                }
            } else{
                if(perilandaBoardTiles[x-1][y].get_X() != 0){
                    if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 1){
                        perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x-1][y].setState(true);
                        
                        if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile"){
                            if(perilandaBoardTiles[x-2][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-2][y].getPiecePlayer() == 1){
                            perilandaBoardTiles[x-2][y].setBackground(Color.CYAN);
                            perilandaBoardTiles[x-2][y].setState(true);
                            }
                        }
                    } 
                } else{
                    if(perilandaBoardTiles[x-1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x-1][y].getPiecePlayer() == 1){
                        perilandaBoardTiles[x-1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x-1][y].setState(true);
                    }
                }

            }
        }
        
        if(name == "player1advancerdown" || name == "player2advancerdown"){
            if(name == "player1advancerdown"){
                if(perilandaBoardTiles[x+1][y].get_X() != 6){
                    if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 2){
                        perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x+1][y].setState(true);
                        
                        if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile"){
                            if(perilandaBoardTiles[x+2][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+2][y].getPiecePlayer() == 2){
                            perilandaBoardTiles[x+2][y].setBackground(Color.CYAN);
                            perilandaBoardTiles[x+2][y].setState(true);
                            }
                        }
                    } 
                } else{
                    if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 2){
                        perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x+1][y].setState(true);
                    }
                }
            } else{
                if(perilandaBoardTiles[x+1][y].get_X() != 6){
                    if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 1){
                        perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x+1][y].setState(true);
                        
                        if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile"){
                            if(perilandaBoardTiles[x+2][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+2][y].getPiecePlayer() == 1){
                            perilandaBoardTiles[x+2][y].setBackground(Color.CYAN);
                            perilandaBoardTiles[x+2][y].setState(true);
                            }
                        }
                    } 
                } else{
                    if(perilandaBoardTiles[x+1][y].getPieceName() == "blankTile" || perilandaBoardTiles[x+1][y].getPiecePlayer() == 1){
                        perilandaBoardTiles[x+1][y].setBackground(Color.CYAN);
                        perilandaBoardTiles[x+1][y].setState(true);
                    }
                }

            }
        }
        
        tileObject.setCurrentMoveInAction(true);
    }
    public static void AdvancerMove(int previousX, int previousY, int currentX, int currentY, String pn){
        perilandaBoardTiles[previousX][previousY].setIcon(null);
        perilandaBoardTiles[previousX][previousY].setPieceName("blankTile");
        perilandaBoardTiles[previousX][previousY].setPiecePlayer(0);
        
        if(pn == "player1advancerup"){
            if(perilandaBoardTiles[currentX][currentY].get_X() == 0){
                Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1advancerdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1advancerup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            }
        } else if(pn == "player1advancerdown"){
            if(perilandaBoardTiles[currentX][currentY].get_X() == 6){
                Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1advancerup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player1advancerdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
            }
        } else if(pn == "player2advancerup"){
            if(perilandaBoardTiles[currentX][currentY].get_X() == 0){
                Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2advancerdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2advancerup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            }
        } else if(pn == "player2advancerdown"){
            if(perilandaBoardTiles[currentX][currentY].get_X() == 6){
                Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2advancerup");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            } else{
                Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                perilandaBoardTiles[currentX][currentY].setIcon(b);
                perilandaBoardTiles[currentX][currentY].setPieceName("player2advancerdown");
                perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
            }
        }
        
    }
}

