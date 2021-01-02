import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckWinner extends JFrame {
    static tileObject[][] perilandaBoardTiles = PerilandaBoard.getBoardTiles();
    public CheckWinner(String chiefName){
        boolean chiefAlive = false;
        for(int x = 0; x < 7; x++){
            for(int y = 0; y < 7; y++){
                if(perilandaBoardTiles[x][y].getPieceName() == chiefName){
                    chiefAlive = true;
                }
            }
        }
        if(chiefAlive == false){
            String winner;
            if(chiefName == "player2chief"){
                winner = "Player 1";
            } else{ winner = "Player 2"; }
            JDialog d = new JDialog(this, "GAME OVER", true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            d.getContentPane().add(new JLabel(winner + " has won the game. Congratulations!"), BorderLayout.CENTER);
            JButton close = new JButton("ok");
            close.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            d.getContentPane().add(close, BorderLayout.SOUTH);
            d.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            d.pack();
            setVisible(true);
            d.setVisible(true);
        }
    }
}
