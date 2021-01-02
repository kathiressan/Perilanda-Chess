import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class PerilandaPieceListener implements MouseListener {
    static String previousPieceName = "";
    static int previousPieceX = 0;
    static int previousPieceY = 0;
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        Object source = e.getSource();
        tileObject currentButton = (tileObject) source;
        String pieceName = currentButton.getPieceName();
        String player = currentButton.getPlayerTurn();
        
        if(player == "player1"){
            if(tileObject.getCurrentMoveInAction() == false){
                if(pieceName == "player1chief"){
                    new ChiefPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                    
                } else if(pieceName == "player1tridentup"){
                    new TridentPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player1tridentdown"){
                    new TridentPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player1excel"){
                    new ExcelPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                    
                } else if(pieceName == "player1tercel"){
                    new TercelPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player1advancerup"){
                    new AdvancerPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player1advancerdown"){
                    new AdvancerPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                }
            } else{
                if(currentButton.getState() == true){
                    if(previousPieceName == "player1chief"){
                        ChiefPiece.ChiefMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                        
                    } else if(previousPieceName == "player1tridentup"){
                        TridentPiece.TridentMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player1tridentdown"){
                        TridentPiece.TridentMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player1excel"){
                        ExcelPiece.ExcelMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                        
                    } else if(previousPieceName == "player1tercel"){
                        TercelPiece.TercelMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player1advancerup"){
                        AdvancerPiece.AdvancerMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                        
                    } else if(previousPieceName == "player1advancerdown"){
                        AdvancerPiece.AdvancerMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                    }
                    new CheckWinner("player2chief");
                    currentButton.addPlayer1MovesMade();
                    new ExcelTercelSwitch(player);
                    currentButton.setPlayerTurn("player2");
                    //new FlipBoard();
                } else{
                    new ClearStates();
                }
            }
        }
        
        if(player == "player2"){
            if(tileObject.getCurrentMoveInAction() == false){
                if(pieceName == "player2chief"){
                    new ChiefPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player2tridentup"){
                    new TridentPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player2tridentdown"){
                    new TridentPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player2excel"){
                    new ExcelPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player2tercel"){
                    new TercelPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player2advancerup"){
                    System.out.println(currentButton.get_X() + " " + currentButton.get_Y());
                    new AdvancerPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                
                } else if(pieceName == "player2advancerdown"){
                    new AdvancerPiece(currentButton.get_X(), currentButton.get_Y(), pieceName);
                    previousPieceName = pieceName;
                    previousPieceX = currentButton.get_X();
                    previousPieceY = currentButton.get_Y();
                }
            } else{
                if(currentButton.getState() == true){
                    if(previousPieceName == "player2chief"){
                        ChiefPiece.ChiefMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player2tridentup"){
                        TridentPiece.TridentMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player2tridentdown"){
                        TridentPiece.TridentMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player2excel"){
                        ExcelPiece.ExcelMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player2tercel"){
                        TercelPiece.TercelMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                
                    } else if(previousPieceName == "player2advancerup"){
                        AdvancerPiece.AdvancerMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                        
                    } else if(previousPieceName == "player2advancerdown"){
                        AdvancerPiece.AdvancerMove(previousPieceX, previousPieceY, currentButton.get_X(), currentButton.get_Y(), previousPieceName);
                        new ClearStates();
                    }
                    new CheckWinner("player1chief");
                    currentButton.addPlayer2MovesMade();
                    new ExcelTercelSwitch(player);
                    currentButton.setPlayerTurn("player1");
                    //new FlipBoard();
                } else{
                    new ClearStates();
                }
            }
        }
    }
    public void mouseReleased(MouseEvent e){}
}
