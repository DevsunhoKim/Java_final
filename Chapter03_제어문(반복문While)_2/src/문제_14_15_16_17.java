/*
 *     15.
 *        1 1 1 1 1
 *        2 2 2 2 2
 *        3 3 3 3 3
 *        4 4 4 4 4
 *        5 5 5 5 5
 *     16.
 *        1####
 *        #2###
 *        ##3##
 *        ###4#
 *        ####5
 *     17. 
 *        A B C D E
 *        A B C D E
 *        A B C D E
 *        A B C D E
 *        A B C D E
 *     18.
 *        A A A A A
 *        B B B B B
 *        C C C C C
 *        D D D D D
 *        E E E E E
 *     
 */
public class 문제_14_15_16_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         *   1 1 1 1 1
 *           2 2 2 2 2
 *           3 3 3 3 3
 *           4 4 4 4 4
 *           5 5 5 5 5
         */
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 *   1####
 *           #2###
 *           ##3##
 *           ###4#
 *           ####5
		 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * A B C D E
 *        A B C D E
 *        A B C D E
 *        A B C D E
 *        A B C D E
		 */
		char c='A';
		for(int i=1;i<=5;i++)
		{
			c='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * A A A A A
 *        B B B B B
 *        C C C C C
 *        D D D D D
 *        E E E E E
		 */
		c='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
	}

}
