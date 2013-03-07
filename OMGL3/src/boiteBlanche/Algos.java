package boiteBlanche;

import java.util.Stack;

public class Algos {

	public String oterSpaces(String phrase){
		String ret = "";
		if(!phrase.isEmpty()){
			int i = 0;
			ret = phrase;
			while(!ret.isEmpty() && i!=ret.length()  && Character.isWhitespace(ret.charAt(i))){
				ret = ret.substring(i+1);
				++i;
			}
		}
		return ret;
	}

	public int dichotomicSearch(int[] tab, int val){
		if(tab.length!=0){
			return actualDichotomicSearch(tab, val, 0, tab.length-1);
		}
		else 
			return -1;
	}

	private int actualDichotomicSearch(int[] tab, int val, int left, int right){
		if (left > right)
			return -1;
		int middle = (left + right) / 2;
		if (tab[middle] == val)
			return middle;
		else if (tab[middle] > val)
			return actualDichotomicSearch(tab, val, left, middle - 1);
		else
			return actualDichotomicSearch(tab, val, middle + 1, right);      
	}

	public boolean correctBracketing(String phrase){
		if(phrase.isEmpty())
			return true;
		else{
			Stack<Character> stack = new Stack<Character>();
			for(int i=0; i!=phrase.length(); i++){
				if(phrase.charAt(i)=='(' ||
						phrase.charAt(i)=='{' ||
						phrase.charAt(i)=='[')
					stack.push(phrase.charAt(i));
				if(phrase.charAt(i)==')')
					if(!stack.isEmpty() && stack.peek()!='(')
						return false;
					else if(!stack.isEmpty())
						stack.pop();
					else
						return false;
				if(phrase.charAt(i)=='}')
					if(!stack.isEmpty() && stack.peek()!='{')
						return false;
					else if(!stack.isEmpty())
						stack.pop();
					else
						return false;
				if(phrase.charAt(i)==']')
					if(!stack.isEmpty() && stack.peek()!='[')
						return false;
					else if(!stack.isEmpty())
						stack.pop();
					else
						return false;
			}
			if(stack.isEmpty())
				return true;
			else
				return false;
		}
	}

}
