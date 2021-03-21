import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	/**
	 * Constructor
	 * 
	 * @param array     
	 * @param b       the array we want to check.
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
/**
 * 
 * @return the indexes of the organs we sum together(set as '1',the organs we didn't take set as '0').
 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
/**
 * update the winArray.
 * @param winArray
 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
/**
 * 
 * @return ArrayList<Integer>
 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
/**
 * Get a given array
 * @return the given array.
 */
	public int getB() 
	{
		return b;
	}
/**
 * @return flag.
 */
	public boolean getFlag() 
	{
		return flag;
	}
/**
 * update flag.
 * @param flag
 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
