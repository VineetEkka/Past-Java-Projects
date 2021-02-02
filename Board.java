
public class Board {
    private char board [][]=new char[3][3];
    private char x;
    private char o;
     public Board(){
         for(int i=0;i<board.length;i++){
             for(int j=0;j<board[i].length;j++){
                 board[i][j]='-';
             }
         }

     }
     public void PrintBoard() {

         for (int i = 0; i < board.length; i++) {
             for (int j = 0; j < board[i].length; j++) {
                 if (board[i][j] != 'x' && board[i][j] != 'o') {
                     System.out.print('-');
                 }
                 if(board[i][j] =='x' || board[i][j]=='o'){
                     System.out.print(board[i][j]);
                 }
                 if(j <=1){

                     System.out.print("|");
                 }
                 else{
                     System.out.print((i + 1));
                     System.out.println();
                 }
             }

         }
     }
    /* public int Computa(int row,int col, char xoro){
         if(board[row][col]=='-'){
             board[row][col]=xoro;
         }

     }*/
     public void ResetBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]='-';
            }
        }

    }



     public boolean add(int row,int col,char xoro) {
         if (board[row][col] == '-') {
             board[row][col] = xoro;

         }
         return true;
         }






        public char CheckWin() {
            int counter = 0;
            int x = 0;
            int o = 0;
            char winner='-';


            for (int i = 0; i < board.length; i++) {
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]=='x'){
                        x++;
                        counter++;

                    }
                    else if(board[i][j]=='o'){
                        o++;
                        counter++;
                    }
                    if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                        winner=board[i][0];
                }
                    if(board[0][j]!='-'&& board[0][j]==board[1][j]&&board[1][j]==board[2][j]){
                        winner=board[0][j];

                }
                if(board[0][0]== board[1][1]&&board[1][1]==board[2][2]){
                    winner=board[0][0];
                }
                    if(board[0][2]== board[1][1]&&board[1][1]==board[2][0]){
                        winner=board[0][2];
                    }



                if((x==5&& o==4)||(x==4&&o==5)||(counter==9)){
                        winner='d';
                    }
            }
                }
                return winner;

                }

                    }











