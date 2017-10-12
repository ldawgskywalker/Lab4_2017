
public class ListUtility {
	
	public static Lis<T> findUnion(List<T> list1, List<T> list2) {
		// Create and return a third list that contains
		// the items that are either in list1 or in list2 or both.
		// Do not add duplicates.
	}

	public static List<T> findIntersection(List<T> list1, List<T> list2) {
		// Create and return a third list that contains the items
		// that are common to both list1 and list2.
		// Do not add duplicates.
	}

	public static List<T> interleave(List<T> list1, List<T> list2) {
		// Create and return a third list that contains the items
		// in list1 interleaved with the items in list2.
		// For example, list1={A, C}, list2={B, P, M, N, Z}
		// list3 = {A, B, C, P, M, N, Z}
	}

	public static List<T> chopSkip(List<T> list1) {
		// Create and return a list that has the items in list1
		// with every second item removed.
		// For example, if list1={A, B, C, D, E}
		// the list returned is {A, C, E}
	}
}
