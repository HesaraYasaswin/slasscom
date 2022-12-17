import java.io.*;

class challenge2
{

		public boolean valid(String s)
		{
			int length=s.length();
			char [] array=s.toCharArray();
		    if(length==0) return true; 
		    Stack<Character> stack = new Stack();
		    for(int i=0; i<length; i++)
		    {
		        if(array[i]=='(' || array[i]=='{' || array[i]=='[' )
		        {
		          stack.push(array[i]);
		        }
		        if(array[i]==')' ||array[i]=='}' ||array[i]==']')
		        {
		          if(stack.isEmpty()) return false; 
		          char temp=stack.pop(); 
		          if((temp=='(' && array[i]==')' ) || (temp=='{' && array[i]=='}' ) ||(temp=='[' && array[i]==']' )  )
		          {
		              continue;
		          }else
		          {
		              return false; 
		          }
		        }
		    }
		    return stack.isEmpty();
		}
}
