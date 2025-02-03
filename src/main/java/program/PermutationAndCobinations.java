package program;

import java.util.ArrayList;
import java.util.List;

public class PermutationAndCobinations {

	public static void main(String[] args) {
		String conVar = "ABC";
		String variableVar = "xyz";
   List<String> permutations= generatePermutations(variableVar);
   List<String> combinations=new ArrayList<String>();
   
   for(String permutation:permutations) {
	   combinations.add(conVar+" "+permutation);
   }
   System.out.println(combinations);
   
	}
	
	public static List<String> generatePermutations(String s){
		List<String> permutation=new ArrayList<String>();
		permute("",s,permutation);
		return permutation;
	}
	public static void permute(String coats,String s,List<String> permutaion) {
		int n=s.length();
		if(n==0) {
			permutaion.add(coats);
		}else {
			for(int i =0;i<n;i++) {
				permute(coats+s.charAt(i),s.substring(0, i)+s.substring(i+1,n),permutaion);
			}
		}
	}
}
