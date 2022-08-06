public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
		int[] Arr1=new int[arr.length];
		int Visited=-1;
		
		System.out.println("Duplicate elements in given array");
		for(int i=0;i<arr.length;i++) {
			int Count=1;
		for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[j]);
			Count++;
			Arr1[i]=Visited;
		}
		}
		if(Arr1[i]!=Visited) {
			Arr1[i]=Count;
		}
	}
		for(int i=0;i<Arr1.length;i++) {
			if(Arr1[i]!=Visited) {
				System.out.println(arr[i+" "+Arr[i]]);
			}
		}
	}
}