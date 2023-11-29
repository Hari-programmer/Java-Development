package snippet;
public class Sam {
		
		
		public static void main(String[] args){
            int n=16;
			int rem,quo;
			String s="";  
			while(n>0) {
				rem=(n-1)%26;
				quo=(n-1)/26;
				s=(char)(rem+97)+s;
				
				if(quo==1) {
					s=(char)(97)+s;
					break;
				}else
					n=(n-1)/26;
			}
			System.out.println(s);
			
			
		}
			  
			
			
			
		}


