//Program for finding the given array is same from front and back.
package Assignment;

public class HomeQue5 {
	public static void main(String[] args) {
		int[] a= {2,3,15,15,3,2};
		boolean read=true;
		int j =a.length-1;
		for(int i=0;i<a.length/2;i++) {
			if(a[i]!=a[j]) {
				read=false;
				break;
			}
			else {j--;
		}
	}
System.out.println(read);
	}
}
