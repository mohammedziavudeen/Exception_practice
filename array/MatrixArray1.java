package array;

public class MatrixArray1 {

	public static void main(String[] args) {       //sample output
		int minCol=0,maxCol=3,minRow=0,maxRow=3;
		int no=1;
		int[][]  arr=new int[4][4];
		while(no<14) {
			for(int col=maxCol;col>=minCol;col--) {
				arr[minRow][col]=no;
				no++;
			}	minRow++;
			for(int row=minRow;row<=maxRow;row++) {
			arr[row][minCol]=no;
				no++;
//				if(no==15 || no==10)
//					break;
			}	minCol++;
			for(int col=minCol;col<=maxCol;col++) {
				arr[maxRow][col]=no;
				no++;
			}	maxRow--;
			for(int row= maxRow;row>=minRow;row--) {
				arr[row][maxCol]=no;
				no++;
			}	maxCol--;
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
			
		}
	}
}
