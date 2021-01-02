
import java.awt.Color;


public class ClearStates {
    static tileObject[][] perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    public ClearStates(){
        tileObject.setCurrentMoveInAction(false);
        for(int i = 0; i < perilandaBoardTiles.length; i++){
            for(int j = 0; j < perilandaBoardTiles.length; j++){
                perilandaBoardTiles[i][j].setState(false);
                perilandaBoardTiles[i][j].setBackground(Color.WHITE);
            }
        }
    }
}
