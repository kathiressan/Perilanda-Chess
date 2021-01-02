import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class LoadGameListener implements MouseListener{
    static tileObject[][]  perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        try{
            FileReader fr = new FileReader("PerilandaChessSavedGame.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner scan = new Scanner(fr);
            int num;
            int c = 0;
            int i = 1;
            int x = 0;
            int y = 0;
            while(scan.hasNext()){
                String str = scan.next().toString().trim();
                if(c == 0){
                    tileObject.setPlayer1MovesMade(Integer.parseInt(str));
                } else if(c == 1){
                    tileObject.setPlayer2MovesMade(Integer.parseInt(str));
                    
                } else if(c == 2){
                    tileObject.setPlayerTurn(str);
                
                }
                
                if(c > 2){
                    if(i == 1){
                        perilandaBoardTiles[x][y].set_X(Integer.parseInt(str));
                        i = i + 1;
                    } else if(i == 2){
                        perilandaBoardTiles[x][y].set_Y(Integer.parseInt(str));
                        i = i + 1;
                    } else if(i == 3){
                        perilandaBoardTiles[x][y].setPieceName(str.trim());
                        i = i + 1;
                    } else if(i == 4){
                        perilandaBoardTiles[x][y].setPiecePlayer(Integer.parseInt(str));
                        i = 1;
                        y = y + 1;
                    }
                }
                if(y == 7){
                    x = x + 1;
                    y = 0;
                }
                c = c + 1;
            }
        } catch(IOException en){
            System.out.println("fail to load game");
        }
        System.out.println("DONE READING");
        for(int x = 0; x < 7; x++){
            for(int y = 0; y < 7; y++){
                System.out.println(perilandaBoardTiles[x][y].getPieceName());
                if(perilandaBoardTiles[x][y].getPieceName().equals("player1advancerup")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player1advancerup);
                    perilandaBoardTiles[x][y].setIcon(b);
                        
                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player1advancerdown")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player1advancerdown);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player2advancerup")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player2advancerup);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player2advancerdown")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player2advancerdown);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player1tridentup")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player1tridentup);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player1tridentdown")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player1tridentdown);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player2tridentup")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player2tridentup);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player2tridentdown")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player2tridentdown);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player1chief")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player1chief);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player2chief")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player2chief);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player1tercel")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player1tercel);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player2tercel")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player2tercel);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player1excel")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player1excel);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("player2excel")){
                    System.out.println("True");
                    Icon b = new ImageIcon(PerilandaBoard.player2excel);
                    perilandaBoardTiles[x][y].setIcon(b);

                } else if(perilandaBoardTiles[x][y].getPieceName().equals("blankTile")){
                    System.out.println("True");
                    perilandaBoardTiles[x][y].setIcon(null);

                }
            }
        }
    }
    public void mouseReleased(MouseEvent e){}
}


