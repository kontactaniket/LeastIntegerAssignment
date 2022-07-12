1. The application will find the least integer from an array formed by 2 sorted array. One array ascending and other descending so the resulting array is v-shaped array.
   Example array1={9,7,5,3,1} Array2={2,4,6,7} Resulting array={9,7,5,3,1,2,4,6,7}
2. LOGIC:
	The method findLeastNumber() is called recursively which start comparing elements from the middle index of the array. It compares addition of middle element and next with middle element and previous element.
	This comparison gives the direction in which we least number should be found. This logic eliminates half of the array in each iteration so time complexity becomes O(log n)
3. There are few test cases which covers different scenarios.	