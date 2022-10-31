package Array;
public class PassingArraytoMethod {
	static void maxVal(int array[]) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max < array[i]) {
				max=array[i];
			}
		}
		System.out.println("The maximum value of an array  is "+max);
		
	}
	
    public static void main(String[] args) {
		int arr[]= {12,-90,56,34,78};
		maxVal(arr);
	}
}
