import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ExcelTercelSwitch {
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    public ExcelTercelSwitch(String playerName){
        if(playerName == "player1"){
            if((tileObject.getPlayer1MovesMade() % 3) == 0){
                for(int x = 0; x < 7; x++){
                    for(int y = 0; y  < 7; y++){
                        if(perilandaBoardTiles[x][y].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[x][y].setIcon(b);
                            perilandaBoardTiles[x][y].setPieceName("player1tercel");
                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[x][y].setIcon(b);
                            perilandaBoardTiles[x][y].setPieceName("player1excel");
                        }   
                    }
                }
            }
        }
        
        if(playerName == "player2"){
            if((tileObject.getPlayer2MovesMade() % 3) == 0){
                for(int x = 0; x < 7; x++){
                    for(int y = 0; y  < 7; y++){
                        if(perilandaBoardTiles[x][y].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[x][y].setIcon(b);
                            perilandaBoardTiles[x][y].setPieceName("player2tercel");
                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[x][y].setIcon(b);
                            perilandaBoardTiles[x][y].setPieceName("player2excel");
                        }
                    }
                }
            }
        }
    }
}
