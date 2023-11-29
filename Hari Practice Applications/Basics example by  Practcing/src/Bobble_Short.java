import java.util.Arrays;
public class Bobble_Short {

	public static int sort(int [] arr) 
	{
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr= {5,44,55,3,6,1,66,3,3,44,55,6,77,88,99,0,11,33,344};
		Bobble_Short.sort(arr);		
				System.out.print("sorted arrays in ascending oerder  ");
				System.out.println(Arrays.toString(arr));
				
			
			}
		

	}


