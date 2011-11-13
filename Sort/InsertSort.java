/**
 * Program sortujacy zawartosc tablicy w kolejnosci niemalejacej 
 * @author byebye
 */
public class InsertSort 
{
	/**
	 * Sortowanie przez wstawianie - algorytm klasy O(N^2)
	 */
	public static void Sort(int[] TAB)
	{
		for(int i=1; i<TAB.length; i++)
		{
			int j=i;
			int temp=TAB[j];
			while(j>0 && TAB[j-1]>temp)
				TAB[j] = TAB[--j];
			TAB[j]=temp;
		}
	}
	
	/**
	 * @param args
	 */
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
