import javax.swing.JButton;

public class tileObject extends JButton {
    private int X;
    private int Y;
    private String pieceName;
    private boolean isNextValidMove;
    private static int player1TurnNumber = 0;
    private static int player2TurnNumber = 0;
    private static boolean currentMoveInAction = false;
    private static String playerTurn = "player1";
    private int piecePlayer;
    
    public void set_X(int xValue){
        X = xValue;
    }
    public void set_Y(int yValue){
        Y = yValue;
    }
    public int get_X(){
        return X;
    }
    public int get_Y(){
        return Y;
    }
    public tileObject(){
        set_X(0);
        set_Y(0);
        setPieceName("blankTile");
        setState(false);
        setPiecePlayer(0);
    }
    public void setPieceName(String pn){
        pieceName = pn.toString().trim();
    }
    public String getPieceName(){
        return pieceName;
    }
    public void setState(boolean valid){
        isNextValidMove = valid;
    }
    public boolean getState(){
        return isNextValidMove;
    }
    public static void setCurrentMoveInAction(boolean valid){
        currentMoveInAction = valid;
    }
    public static boolean getCurrentMoveInAction(){
        return currentMoveInAction;
    }
    public static void setPlayerTurn(String pt){
        playerTurn = pt;
    }
    public static String getPlayerTurn(){
        return playerTurn;
    }
    public void setPiecePlayer(int pp){
        piecePlayer = pp;
    }
    public int getPiecePlayer(){
        return piecePlayer;
    }
    public static void setPlayer1MovesMade(int n){
        player1TurnNumber = n;
    }
    public static int getPlayer1MovesMade(){
        return player1TurnNumber;
    }
    public static void addPlayer1MovesMade(){
        player1TurnNumber = player1TurnNumber + 1;
    }
    public static void setPlayer2MovesMade(int n){
        player2TurnNumber = n;
    }
    public static int getPlayer2MovesMade(){
        return player2TurnNumber;
    }
    public static void addPlayer2MovesMade(){
        player2TurnNumber = player2TurnNumber + 1;
    }
    public tileObject(tileObject a){
        this.X = a.X;
        this.Y = a.Y;
        this.pieceName = a.pieceName;
        this.isNextValidMove = a.isNextValidMove;
        this.piecePlayer = a.piecePlayer;
    }
}
