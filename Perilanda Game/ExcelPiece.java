import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ExcelPiece {
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    
    public ExcelPiece(int x, int y, String name){
        perilandaBoardTiles[x][y].setBackground(Color.BLUE);
        
        if(name == "player1excel"){
            if(perilandaBoardTiles[x][y].get_X() != 0 && perilandaBoardTiles[x][y].get_Y() != 0){
                int topLeftX = x;
                int topLeftY = y;
                boolean topLeftEdge = false;
                while(topLeftEdge == false){
                    if(perilandaBoardTiles[topLeftX-1][topLeftY-1].getPieceName() == "blankTile" || perilandaBoardTiles[topLeftX-1][topLeftY-1].getPiecePlayer() == 2){
                        perilandaBoardTiles[topLeftX-1][topLeftY-1].setBackground(Color.CYAN);
                        perilandaBoardTiles[topLeftX-1][topLeftY-1].setState(true);
                        if(perilandaBoardTiles[topLeftX-1][topLeftY-1].getPieceName() != "blankTile"){
                            topLeftEdge = true;
                        }
                        topLeftX = topLeftX - 1;
                        topLeftY = topLeftY - 1;
                        if(topLeftX == 0 || topLeftY == 0){
                            topLeftEdge = true;
                        }
                    } else{ topLeftEdge = true; }
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 0 && perilandaBoardTiles[x][y].get_Y() != 6){
                int topRightX = x;
                int topRightY = y;
                boolean topRightEdge = false;
                while(topRightEdge == false){
                    if(perilandaBoardTiles[topRightX-1][topRightY+1].getPieceName() == "blankTile" || perilandaBoardTiles[topRightX-1][topRightY+1].getPiecePlayer() == 2){
                        perilandaBoardTiles[topRightX-1][topRightY+1].setBackground(Color.CYAN);
                        perilandaBoardTiles[topRightX-1][topRightY+1].setState(true);
                        if(perilandaBoardTiles[topRightX-1][topRightY+1].getPieceName() != "blankTile"){
                            topRightEdge = true;
                        }
                        topRightX = topRightX - 1;
                        topRightY = topRightY + 1;
                        if(topRightX == 0 || topRightY == 6){
                            topRightEdge = true;
                        }
                    } else{ topRightEdge = true; }
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 6 && perilandaBoardTiles[x][y].get_Y() != 0){
                int botLeftX = x;
                int botLeftY = y;
                boolean botLeftEdge = false;
                while(botLeftEdge == false){
                    if(perilandaBoardTiles[botLeftX+1][botLeftY-1].getPieceName() == "blankTile" || perilandaBoardTiles[botLeftX+1][botLeftY-1].getPiecePlayer() == 2){
                        perilandaBoardTiles[botLeftX+1][botLeftY-1].setBackground(Color.CYAN);
                        perilandaBoardTiles[botLeftX+1][botLeftY-1].setState(true);
                        if(perilandaBoardTiles[botLeftX+1][botLeftY-1].getPieceName() != "blankTile"){
                            botLeftEdge = true;
                        }
                        botLeftX = botLeftX + 1;
                        botLeftY = botLeftY - 1;
                        if(botLeftX == 6 || botLeftY == 0){
                            botLeftEdge = true;
                        }
                    } else{ botLeftEdge = true; }
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 6 && perilandaBoardTiles[x][y].get_Y() != 6){
                int botRightX = x;
                int botRightY = y;
                boolean botRightEdge = false;
                while(botRightEdge == false){
                    if(perilandaBoardTiles[botRightX+1][botRightY+1].getPieceName() == "blankTile" || perilandaBoardTiles[botRightX+1][botRightY+1].getPiecePlayer() == 2){
                        perilandaBoardTiles[botRightX+1][botRightY+1].setBackground(Color.CYAN);
                        perilandaBoardTiles[botRightX+1][botRightY+1].setState(true);
                        if(perilandaBoardTiles[botRightX+1][botRightY+1].getPieceName() != "blankTile"){
                            botRightEdge = true;
                        }
                        botRightX = botRightX + 1;
                        botRightY = botRightY + 1;
                        if(botRightX == 6 || botRightY == 6){
                            botRightEdge = true;
                        }
                    } else{ botRightEdge = true; }
                }
            }
            
            
        } else if(name == "player2excel"){
            if(perilandaBoardTiles[x][y].get_X() != 0 && perilandaBoardTiles[x][y].get_Y() != 0){
                int topLeftX = x;
                int topLeftY = y;
                boolean topLeftEdge = false;
                while(topLeftEdge == false){
                    if(perilandaBoardTiles[topLeftX-1][topLeftY-1].getPieceName() == "blankTile" || perilandaBoardTiles[topLeftX-1][topLeftY-1].getPiecePlayer() == 1){
                        perilandaBoardTiles[topLeftX-1][topLeftY-1].setBackground(Color.CYAN);
                        perilandaBoardTiles[topLeftX-1][topLeftY-1].setState(true);
                        if(perilandaBoardTiles[topLeftX-1][topLeftY-1].getPieceName() != "blankTile"){
                            topLeftEdge = true;
                        }
                        topLeftX = topLeftX - 1;
                        topLeftY = topLeftY - 1;
                        if(topLeftX == 0 || topLeftY == 0){
                            topLeftEdge = true;
                        }
                    } else{ topLeftEdge = true; }
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 0 && perilandaBoardTiles[x][y].get_Y() != 6){
                int topRightX = x;
                int topRightY = y;
                boolean topRightEdge = false;
                while(topRightEdge == false){
                    if(perilandaBoardTiles[topRightX-1][topRightY+1].getPieceName() == "blankTile" || perilandaBoardTiles[topRightX-1][topRightY+1].getPiecePlayer() == 1){
                        perilandaBoardTiles[topRightX-1][topRightY+1].setBackground(Color.CYAN);
                        perilandaBoardTiles[topRightX-1][topRightY+1].setState(true);
                        if(perilandaBoardTiles[topRightX-1][topRightY+1].getPieceName() != "blankTile"){
                            topRightEdge = true;
                        }
                        topRightX = topRightX - 1;
                        topRightY = topRightY + 1;
                        if(topRightX == 0 || topRightY == 6){
                            topRightEdge = true;
                        }
                    } else{ topRightEdge = true; }
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 6 && perilandaBoardTiles[x][y].get_Y() != 0){
                int botLeftX = x;
                int botLeftY = y;
                boolean botLeftEdge = false;
                while(botLeftEdge == false){
                    if(perilandaBoardTiles[botLeftX+1][botLeftY-1].getPieceName() == "blankTile" || perilandaBoardTiles[botLeftX+1][botLeftY-1].getPiecePlayer() == 1){
                        perilandaBoardTiles[botLeftX+1][botLeftY-1].setBackground(Color.CYAN);
                        perilandaBoardTiles[botLeftX+1][botLeftY-1].setState(true);
                        if(perilandaBoardTiles[botLeftX+1][botLeftY-1].getPieceName() != "blankTile"){
                            botLeftEdge = true;
                        }
                        botLeftX = botLeftX + 1;
                        botLeftY = botLeftY - 1;
                        if(botLeftX == 6 || botLeftY == 0){
                            botLeftEdge = true;
                        }
                    } else{ botLeftEdge = true; }
                }
            }
            
            if(perilandaBoardTiles[x][y].get_X() != 6 && perilandaBoardTiles[x][y].get_Y() != 6){
                int botRightX = x;
                int botRightY = y;
                boolean botRightEdge = false;
                while(botRightEdge == false){
                    if(perilandaBoardTiles[botRightX+1][botRightY+1].getPieceName() == "blankTile" || perilandaBoardTiles[botRightX+1][botRightY+1].getPiecePlayer() == 1){
                        perilandaBoardTiles[botRightX+1][botRightY+1].setBackground(Color.CYAN);
                        perilandaBoardTiles[botRightX+1][botRightY+1].setState(true);
                        if(perilandaBoardTiles[botRightX+1][botRightY+1].getPieceName() != "blankTile"){
                            botRightEdge = true;
                        }
                        botRightX = botRightX + 1;
                        botRightY = botRightY + 1;
                        if(botRightX == 6 || botRightY == 6){
                            botRightEdge = true;
                        }
                    } else{ botRightEdge = true; }
                }
            }
        
        }
        tileObject.setCurrentMoveInAction(true);
    }
    
    public static void ExcelMove(int previousX, int previousY, int currentX, int currentY, String pn){
        perilandaBoardTiles[previousX][previousY].setIcon(null);
        perilandaBoardTiles[previousX][previousY].setPieceName("blankTile");
        perilandaBoardTiles[previousX][previousY].setPiecePlayer(0);
        
        if(pn == "player1excel"){
            Icon b = new ImageIcon(PerilandaBoard.player1excel);
            perilandaBoardTiles[currentX][currentY].setIcon(b);
            perilandaBoardTiles[currentX][currentY].setPieceName("player1excel");
            perilandaBoardTiles[currentX][currentY].setPiecePlayer(1);
        } else if(pn == "player2excel"){
            Icon b = new ImageIcon(PerilandaBoard.player2excel);
            perilandaBoardTiles[currentX][currentY].setIcon(b);
            perilandaBoardTiles[currentX][currentY].setPieceName("player2excel");
            perilandaBoardTiles[currentX][currentY].setPiecePlayer(2);
        }
    }
}
