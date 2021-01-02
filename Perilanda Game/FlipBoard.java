import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.*;

public class FlipBoard {
    static tileObject[][] perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    public FlipBoard(){
        int xv = 6;
        int yv = 6;
        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 7; y++){
                int tempX = perilandaBoardTiles[x][y].get_X();
                int tempY = perilandaBoardTiles[x][y].get_Y();
                String tempPieceName = perilandaBoardTiles[x][y].getPieceName();
                int tempPP = perilandaBoardTiles[x][y].getPiecePlayer();
                boolean tempState = perilandaBoardTiles[x][y].getState();
                
                if(x == 0){
                    
                        if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);
                        
                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "blankTile"){
                            perilandaBoardTiles[xv][yv].setIcon(null);

                        }


                        if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "blankTile"){
                            perilandaBoardTiles[x][y].setIcon(null);

                        }

                        perilandaBoardTiles[x][y].setPieceName(perilandaBoardTiles[xv][yv].getPieceName());
                        perilandaBoardTiles[x][y].setPiecePlayer(perilandaBoardTiles[xv][yv].getPiecePlayer());
                        perilandaBoardTiles[x][y].setState(perilandaBoardTiles[xv][yv].getState());
                        //perilandaBoardTiles[x][y].set_X(perilandaBoardTiles[xv][yv].get_X());
                        //perilandaBoardTiles[x][y].set_Y(perilandaBoardTiles[xv][yv].get_Y());
                        
                        perilandaBoardTiles[xv][yv].setPieceName(tempPieceName);
                        perilandaBoardTiles[xv][yv].setPiecePlayer(tempPP);
                        perilandaBoardTiles[xv][yv].setState(tempState);
                        //perilandaBoardTiles[xv][yv].set_X(tempX);
                        //perilandaBoardTiles[xv][yv].set_Y(tempY);
                        
                        yv = yv - 1;
                    
                    
                } else if(x == 1){
                    if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);
                        
                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "blankTile"){
                            perilandaBoardTiles[xv][yv].setIcon(null);

                        }


                        if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "blankTile"){
                            perilandaBoardTiles[x][y].setIcon(null);

                        }

                        perilandaBoardTiles[x][y].setPieceName(perilandaBoardTiles[xv][yv].getPieceName());
                        perilandaBoardTiles[x][y].setPiecePlayer(perilandaBoardTiles[xv][yv].getPiecePlayer());
                        perilandaBoardTiles[x][y].setState(perilandaBoardTiles[xv][yv].getState());
                        //perilandaBoardTiles[x][y].set_X(perilandaBoardTiles[xv][yv].get_X());
                        //perilandaBoardTiles[x][y].set_Y(perilandaBoardTiles[xv][yv].get_Y());
                        
                        perilandaBoardTiles[xv][yv].setPieceName(tempPieceName);
                        perilandaBoardTiles[xv][yv].setPiecePlayer(tempPP);
                        perilandaBoardTiles[xv][yv].setState(tempState);
                        //perilandaBoardTiles[xv][yv].set_X(tempX);
                        //perilandaBoardTiles[xv][yv].set_Y(tempY);
                        
                        yv = yv - 1;
                    
                } else if(x == 2){
                    if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);
                        
                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "blankTile"){
                            perilandaBoardTiles[xv][yv].setIcon(null);

                        }


                        if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "blankTile"){
                            perilandaBoardTiles[x][y].setIcon(null);

                        }

                        perilandaBoardTiles[x][y].setPieceName(perilandaBoardTiles[xv][yv].getPieceName());
                        perilandaBoardTiles[x][y].setPiecePlayer(perilandaBoardTiles[xv][yv].getPiecePlayer());
                        perilandaBoardTiles[x][y].setState(perilandaBoardTiles[xv][yv].getState());
                        //perilandaBoardTiles[x][y].set_X(perilandaBoardTiles[xv][yv].get_X());
                        //perilandaBoardTiles[x][y].set_Y(perilandaBoardTiles[xv][yv].get_Y());
                        
                        perilandaBoardTiles[xv][yv].setPieceName(tempPieceName);
                        perilandaBoardTiles[xv][yv].setPiecePlayer(tempPP);
                        perilandaBoardTiles[xv][yv].setState(tempState);
                        //perilandaBoardTiles[xv][yv].set_X(tempX);
                        //perilandaBoardTiles[xv][yv].set_Y(tempY);
                        
                        yv = yv - 1;
                    
                } else if(x == 3){
                    if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);
                        
                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[xv][yv].setIcon(b);

                        } else if(perilandaBoardTiles[x][y].getPieceName() == "blankTile"){
                            perilandaBoardTiles[xv][yv].setIcon(null);

                        }


                        if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2advancerdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentup"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tridentdown"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player1chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2chief"){
                            Icon b = new ImageIcon(PerilandaBoard.player2chief);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2tercel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player1excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player1excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "player2excel"){
                            Icon b = new ImageIcon(PerilandaBoard.player2excel);
                            perilandaBoardTiles[x][y].setIcon(b);

                        } else if(perilandaBoardTiles[xv][yv].getPieceName() == "blankTile"){
                            perilandaBoardTiles[x][y].setIcon(null);

                        }

                        perilandaBoardTiles[x][y].setPieceName(perilandaBoardTiles[xv][yv].getPieceName());
                        perilandaBoardTiles[x][y].setPiecePlayer(perilandaBoardTiles[xv][yv].getPiecePlayer());
                        perilandaBoardTiles[x][y].setState(perilandaBoardTiles[xv][yv].getState());
                        //perilandaBoardTiles[x][y].set_X(perilandaBoardTiles[xv][yv].get_X());
                        //perilandaBoardTiles[x][y].set_Y(perilandaBoardTiles[xv][yv].get_Y());
                        
                        perilandaBoardTiles[xv][yv].setPieceName(tempPieceName);
                        perilandaBoardTiles[xv][yv].setPiecePlayer(tempPP);
                        perilandaBoardTiles[xv][yv].setState(tempState);
                        //perilandaBoardTiles[xv][yv].set_X(tempX);
                        //perilandaBoardTiles[xv][yv].set_Y(tempY);
                        
                        yv = yv - 1;
                }
            }
            xv = xv - 1;
            yv = 6;
        }
    }
}
