package Board;

public class Board{

	//public static void main(String[] args){
		
	String[][] Board = new String[8][8];
		
	public void Populate(){	
			for (int i=0; i<8; i++){
				for (int j=0; j<8; j++){
					int x = i;
					int y = j;
					if (i % 2 == 0 && j % 2 == 0){
						Board [x][y] = " r";
					}else if (i %2 != 0 && j % 2 != 0){
						Board [x][y] = " r";
					}else{
						Board [x][y] = " b";
					}
			}
		}
		}
	public void printBoard(){
			
		for (int i=0; i<8; i++){
			for (int j=0; j<8; j++){
				System.out.print(Board[i][j]);
			}
		System.out.println("");
		}
	}
	}

	

