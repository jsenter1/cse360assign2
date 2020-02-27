package cse360assign2;

/**
 * 
 * This class represents an array and its operations. The size of the array is
 * set to 10. The operations include for an array are add, remove, search, count
 * and toString.
 * 
 * @author Jerrel Senter Class ID: 181 Assignment Number: 1
 */
public class SimpleList {

	private int[] list;
	private int count;

	/**
	 * Default Constructor
	 */
	public SimpleList() {

		list = new int[10];
		count = 0;

	}

	/**
	 * This method is used to add a number in the start of the array and the rest of
	 * the array is pushed forward. If the array is full, the last element is
	 * dropped from the list and new is added at the start. It also increments the
	 * count when a new element is added. The maximum count will remain 10 as size
	 * of array cannot exceeds 10.
	 * 
	 * @param number - The number which needs to be added in the array.
	 */

	public void add(int number) {

		if (count == list.length) {
			alloc50();
		}

		for (int integer = (count - 1); integer >= 0; integer--) {
			if (integer == list.length - 1) {
				list[integer] = list[integer];
			} else {
				list[integer + 1] = list[integer];
			}
		}

		list[0] = number;

		if (count < list.length) {
			count++;
		}

	}

	/**
	 * This method is used to remove a number from the array and the rest of the
	 * array is pushed backward. It also decrement the count when the element is
	 * removed (if found). The minimum count will remain 0 as size of array cannot
	 * be less than 0. If passed number is not found. Nothing happens
	 * 
	 * @param number - The number which needs to be removed from the array.
	 */

	public void remove(int number) {

		boolean numberFound = false;

		for (int integer = 0; integer < count; integer++) {

			if (!numberFound && list[integer] == number) {
				numberFound = true;
			}

			if (numberFound && integer < count) {

				if (integer == list.length - 1) {
					list[integer] = list[integer];
				} else {
					list[integer] = list[integer + 1];
				}

			}
		}

		if (numberFound) {
			count--;
		}

		int half = list.length / 2;
		int quarter = half / 2;
		if (count < quarter) {
			remove25();
		}
	}

	/**
	 * This method is used to return the count i.e. the current number of elements
	 * in the array.
	 * 
	 * @return count - Number of elements in array.
	 */

	public int count() {

		return count;

	}

	/**
	 * This method is used to make a string representation of the array separated by
	 * a space. The space does not come after the last element.
	 * 
	 * @param string representation of the array.
	 */

	public String toString() {

		String arrayRepresentationAsString = "";

		for (int integer = 0; integer < count; integer++) {

			if (integer == count - 1) {
				arrayRepresentationAsString += list[integer];
			} else {
				arrayRepresentationAsString += list[integer] + " ";
			}

		}

		return arrayRepresentationAsString;

	}

	/**
	 * This method is used to search the passed number in the array and return the
	 * index of this number if found otherwise it will return -1.
	 * 
	 * @param number - which need to be searched.
	 * @return index of number if found other -1.
	 */

	public int search(int number) {

		int index = -1;

		for (int integer = 0; integer < count; integer++) {

			if (list[integer] == number) {
				return integer;
			}

		}

		return index;
	}

	/**
	 * This method is used to increase the size of the array by 50%.
	 */
	private void alloc50() {
		int halfLength = list.length / 2;
		int[] tempArray = new int[list.length + halfLength];
		for (int i = 0; i < list.length; i++) {
			tempArray[i] = list[i];
		}
		list = tempArray;
	}

	/**
	 * This method is used to increase the size of the array by 50%.
	 */
	private void remove25() {
		int halfLength = list.length / 2;
		int quarterLength = halfLength / 2;
		int[] tempArray = new int[quarterLength];
		for (int i = 0; i < count; i++) {
			tempArray[i] = list[i];
		}
		list = tempArray;
	}

	/**
	 * This method is used to get the first element in the list
	 * 
	 * @return first element
	 */
	public int first() {
		if (count == 0) {
			return -1;
		}
		return list[0];
	}

	/**
	 * This method is used to get the last element in the list
	 * 
	 * @return last element
	 */
	public int last() {
		if (count == 0) {
			return -1;
		}
		return list[count - 1];
	}

	/**
	 * This method is used to return the possible locations in the list
	 * 
	 * @return size
	 */
	public int size() {
		return list.length;
	}

	/**
	 * This method is used to append the element to the end of the list.
	 * 
	 * @param element to be appended.
	 */
	public void append(int element) {
		list[count] = element;
		count++;
	}
}