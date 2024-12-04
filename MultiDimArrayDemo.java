public class MultiDimArrayDemo {

    public static void main(String[] args) {

        int TwoD[][]=new int[3][4];

	int i,j,k=0;

        //Assign Values

        //Row index

        for(i=0; i<3; i++){

            // Third 1=2

            //Column Index

            for(j=0; j<4; j++)

		{

                    TwoD[i][j]=k;

                    k=k+1;

		}

        }

        

        //Print Values

	for(i=0; i<3; i++){

            for(j=0; j<4; j++){

		System.out.print(TwoD[i][j]+" ");

            }

            System.out.println();

	}					

    }

}