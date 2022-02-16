import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void print (int v[]) {
		System.out.print("v={");
		for (int x=0; x<v.length; x++) {
			System.out.print(v[x]+",");
		}
		System.out.print("}\n");
	}
	
	public static void main(String[] args) {
		
//		Pair<Integer, int[]> v1 = new OrderedPair<>(0, v);
				
		int[] v = {71, 68, 46, 36, 89, 86, 24, 16, 9, 45, 56, 19, 60, 39, 13, 34, 69, 82, 10, 77, 25, 66, 41, 88, 3, 43, 70, 58, 59, 5, 48, 100, 94, 61, 12, 42, 32, 27, 74, 20, 67, 78, 47, 14, 96, 54, 65, 50, 15, 26, 79, 73, 72, 4, 92, 17, 93, 49, 76, 57, 63, 91, 11, 44, 84, 40, 31, 85, 80, 21, 62, 53, 87, 38, 30, 99, 95, 55, 22, 98, 7, 37, 29, 33, 6, 8, 64, 28, 1, 52, 83, 2, 23, 51, 18, 97, 90, 81, 75, 35};
		
		MergeSort m = new MergeSort();
		MergeSortInsert i = new MergeSortInsert();
		MergeSortOrdered o = new MergeSortOrdered();

  		double i1 =  System.currentTimeMillis();
  		v = m.Divide(v, 0, v.length-1);
  		double i2 =  System.currentTimeMillis();
  		print(v);
  		System.out.println(i2-i1);

	}

}
