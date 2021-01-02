import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import static java.lang.System.*;

public class SaveGameListener implements MouseListener {
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        try{
            FileWriter fw = new FileWriter("PerilandaChessSavedGame.txt");
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(tileObject.getPlayer1MovesMade());
            pw.println(tileObject.getPlayer2MovesMade());
            pw.println(tileObject.getPlayerTurn());
            
            for(int x = 0; x < 7; x++){
                for(int y = 0; y < 7; y++){
                    pw.println(perilandaBoardTiles[x][y].get_X());
                    pw.println(perilandaBoardTiles[x][y].get_Y());
                    pw.println(perilandaBoardTiles[x][y].getPieceName());
                    pw.println(perilandaBoardTiles[x][y].getPiecePlayer());
                }
            }
            
            pw.close();
            
        } catch(IOException en){
            System.out.println("fail to save game");
        }
    }
    public void mouseReleased(MouseEvent e){}
}


