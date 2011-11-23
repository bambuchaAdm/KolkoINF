/**
 * Program sortujacy zawartosc tablicy w kolejnosci niemalejacej 
 * @author byebye
 */
public class BubbleSort 
{
	private void swap(int[] tab, int a, int b)
	{
		int temp = tab[a];
		tab[a]=tab[b];
		tab[b]=temp;
	}
	
	/**
	 * Sortowanie babelkowe - bez warunku wykonania zamiany - algorytm klasy O(N^2)
	 */
	public static void Sort(int[] tab)
	{
		for(int i=0; i<tab.length-1; i++)
			for(int j=0; j<tab.length-i-1; j++)
				if(tab[j+1] < tab[j])
					swap(tab,i,j)
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
