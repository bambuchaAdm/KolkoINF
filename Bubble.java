/**
 * Program sortujacy zawartosc tablicy w kolejnosci niemalejacej *
 * @author byebye
 */

public class Bubble 
{
	
	/**
	 * Sortowanie babelkowe - bez warunku wykonania zamiany
	 */
	public static void Sort(int[] TAB)
	{
		for(int i=0; i<TAB.length-1; i++)
			for(int j=0; j<TAB.length-1-i; j++)
				if(TAB[j+1] < TAB[j])
				{
					int temp = TAB[j+1];
					TAB[j+1] = TAB[j];
					TAB[j] = temp;
				}
	}
	
	
	public static void main(String[] args) 
	{
		int[] Tab = {409, 2384, 832, -13, 848, 84, -423, 0, 342, 1110, 13, 41, 134, 743, 714, -747, -1, 99, 9991, 324, 1, 1, 1, 3, 542, 34, 17, 97};
		Sort(Tab);
		for(int i=0; i<Tab.length ; i++)
		{
			System.out.print(Tab[i]);
			System.out.print(" ");
		}


	}

}
