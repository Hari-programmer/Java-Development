import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int num=756;
		String str=String.valueOf(num);
		List<Integer> res=new ArrayList<>();
		permute(res,new StringBuilder(),str);
		System.out.println(res);
		System.out.println(Collections.min(res));
	}
		// TODO Auto-generated method stub
		
	
	public static void permute(List<Integer> res,StringBuilder path,String str)
	{
		if(str.length()==path.length()) {
			res.add(Integer.parseInt(path.toString()));
			return;
		}
		for(int i=0;i<str.length();i++) {
			if(path.indexOf(String.valueOf(str.charAt(i)))!=-1||(path.length()>0&&path.charAt(0)=='0')){
				continue;
			}
			path.append(String.valueOf(str.charAt(i)));
			permute(res,path,str);
			path.deleteCharAt(path.length()-1);
		}

	}

}
