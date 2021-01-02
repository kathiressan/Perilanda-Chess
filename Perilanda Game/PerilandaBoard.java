import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


public class PerilandaBoard extends JFrame{
    private static tileObject[][] perilandaBoardTiles = new tileObject[7][7];
    private JButton[] menuTiles = new JButton[3];
    /* String names[] = {"00", "01", "02", "03", "04", "05", "06", 
                         "10", "11", "12", "13", "14", "15", "16",
                         "20", "21", "22", "23", "24", "25", "26",
                         "30", "31", "32", "33", "34", "35", "36",
                         "40", "41", "42", "43", "44", "45", "46",
                         "50", "51", "52", "53", "54", "55", "56",
                         "60", "61", "62", "63", "64", "65", "66",}; */
    
    public static tileObject[][] getBoardTiles(){
        return perilandaBoardTiles;
    }
    
    public static String player1advancerup = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player1advancerup.PNG";
    public static String player1advancerdown = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player1advancerdown.PNG";
    public static String player2advancerup = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player2advancerup.PNG";
    public static String player2advancerdown = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player2advancerdown.PNG";
    public static String player1tercel  = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player1tercel.PNG";
    public static String player2tercel = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player2tercel.PNG";
    public static String player1excel = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player1excel.PNG";
    public static String player2excel = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player2excel.PNG";
    public static String player1tridentup = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player1tridentup.PNG";
    public static String player1tridentdown = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player1tridentdown.PNG";
    public static String player2tridentup = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player2tridentup.PNG";
    public static String player2tridentdown = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player2tridentdown.PNG";
    public static String player1chief = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player1chief.PNG";
    public static String player2chief = "C:\\Users\\kathi\\OneDrive\\Desktop\\Perilanda Pieces\\player2chief.PNG";
    
    public PerilandaBoard(){
        JFrame frame = new JFrame("Perilanda Chess");
        JPanel menupanel = new JPanel();
        JPanel chesspanel = new JPanel();
        frame.add(menupanel, BorderLayout.NORTH);
        frame.add(chesspanel, BorderLayout.SOUTH);
        
        int c = 1;
        for(int i = 0; i < perilandaBoardTiles.length; i++){
            for(int j = 0; j < perilandaBoardTiles[i].length; j++){
                perilandaBoardTiles[i][j] = new tileObject();
                perilandaBoardTiles[i][j].set_X(i);
                perilandaBoardTiles[i][j].set_Y(j);
                perilandaBoardTiles[i][j].setBackground(Color.WHITE);
                perilandaBoardTiles[i][j].addMouseListener(new PerilandaPieceListener());
                if(c == 4){
                    perilandaBoardTiles[i][j].setPiecePlayer(2);
                    perilandaBoardTiles[i][j].setPieceName("player2chief");
                    try {
                        Icon b = new ImageIcon(player2chief);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if(c == 46){
                    perilandaBoardTiles[i][j].setPiecePlayer(1);
                    perilandaBoardTiles[i][j].setPieceName("player1chief");
                    try {
                        Icon b = new ImageIcon(player1chief);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                
                } else if(c == 3 || c == 5){
                    perilandaBoardTiles[i][j].setPiecePlayer(2);
                    perilandaBoardTiles[i][j].setPieceName("player2tridentdown");
                    try {
                        Icon b = new ImageIcon(player2tridentdown);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    } 
                } else if(c == 45 || c == 47){
                    perilandaBoardTiles[i][j].setPiecePlayer(1);
                    perilandaBoardTiles[i][j].setPieceName("player1tridentup");
                    try {
                        Icon b = new ImageIcon(player1tridentup);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    } 
                } else if(c == 2 || c == 6){
                    perilandaBoardTiles[i][j].setPiecePlayer(2);
                    perilandaBoardTiles[i][j].setPieceName("player2excel");
                    try {
                        Icon b = new ImageIcon(player2excel);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if(c == 44 || c  == 48){
                    perilandaBoardTiles[i][j].setPiecePlayer(1);
                    perilandaBoardTiles[i][j].setPieceName("player1excel");
                    try {
                        Icon b = new ImageIcon(player1excel);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                
                } else if(c == 1 || c == 7){
                    perilandaBoardTiles[i][j].setPiecePlayer(2);
                    perilandaBoardTiles[i][j].setPieceName("player2tercel");
                    try {
                        Icon b = new ImageIcon(player2tercel);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if(c == 43 || c == 49){
                    perilandaBoardTiles[i][j].setPiecePlayer(1);
                    perilandaBoardTiles[i][j].setPieceName("player1tercel");
                    try {
                        Icon b = new ImageIcon(player1tercel);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                
                } else if(c == 8 || c == 9 || c == 10 || c == 11 || c == 12 || c == 13 || c == 14){
                    perilandaBoardTiles[i][j].setPiecePlayer(2);
                    perilandaBoardTiles[i][j].setPieceName("player2advancerdown");
                    try {
                        Icon b = new ImageIcon(player2advancerdown);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if(c == 36 || c == 37 || c == 38 || c == 39 || c == 40 || c == 41 || c == 42){
                    perilandaBoardTiles[i][j].setPiecePlayer(1);
                    perilandaBoardTiles[i][j].setPieceName("player1advancerup");
                    try {
                        Icon b = new ImageIcon(player1advancerup);
                        perilandaBoardTiles[i][j].setIcon(b);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
                
                chesspanel.add(perilandaBoardTiles[i][j]);
                c = c + 1;
                
            }
        }
        
        JButton saveGame = new JButton("Save Game");
        JButton loadGame = new JButton("Load Game");
        saveGame.addMouseListener(new SaveGameListener());
        loadGame.addMouseListener(new LoadGameListener());
        menupanel.add(saveGame);
        menupanel.add(loadGame);
        menupanel.setLayout(new GridLayout(1,3));
        chesspanel.setLayout(new GridLayout(7,7));
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
}