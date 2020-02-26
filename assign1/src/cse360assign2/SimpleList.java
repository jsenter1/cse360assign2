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

		for (int integer = (count - 1); integer >= 0; integer--) {
			if (integer == 9) {
				list[integer] = list[integer];
			} else {
				list[integer + 1] = list[integer];
			}
		}

		list[0] = number;

		if (count < 10) {
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

				if (integer == 9) {
					list[integer] = list[integer];
				} else {
					list[integer] = list[integer + 1];
				}

			}
		}

		if (numberFound) {
			count--;
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
				System.out.println(integer);
				return integer;
			}

		}

		return index;
	}

}