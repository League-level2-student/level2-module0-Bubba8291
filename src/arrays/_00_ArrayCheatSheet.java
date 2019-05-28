package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] size = {"Apple", "Samsung", "Google", "Microsoft", "Cherry"};
		//2. print the third element in the array
		System.out.println(size[2]);
		//3. set the third element to a different value
		size[2] = "Music";
		//4. print the third element again
		System.out.println(size[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int length = size.length - 1; length>=0; length--) {
			System.out.println(size[length]);
		}
		//6. make an array of 50 integers
		int[] num = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int length2 = num.length - 1; length2>=0; length2--) {
			double x = Math.random() * 100;
			num[length2] = (int)x;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 101;
		for(int length2 = num.length - 1; length2>=0; length2--) {
			if(num[length2] < smallest) {
				smallest = num[length2];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for(int length2 = num.length - 1; length2>=0; length2--) {
			System.out.println(num[length2]);
		}
		//10. print the largest number in the array.
		int largest = -1;
		for(int length2 = num.length - 1; length2>=0; length2--) {
			if(num[length2] > largest) {
				largest = num[length2];
			}
		}
		System.out.println(largest);
	}
}
