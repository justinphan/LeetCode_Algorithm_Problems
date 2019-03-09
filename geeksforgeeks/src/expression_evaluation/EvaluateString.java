package expression_evaluation;
import java.util.*;

public class EvaluateString {
    public static int evaluate(String expression) {
    	char[] tokens = expression.toCharArray();
    	Stack<Character> ops = new Stack();
    	Stack<Integer> value = new Stack();
    	
    	for(int i = 0; i < tokens.length; i++) {
    		if (tokens[i]==' ') continue;
    		else if (tokens[i]>='0' && tokens[i]<='9') {
    			StringBuffer str = new StringBuffer();
    			while(i<tokens.length && tokens[i]>='0' && tokens[i]<='9') 
        			str.append(tokens[i++]);
        		value.push(Integer.parseInt(str.toString()));
    		}
    		else if (tokens[i]=='(') ops.push(tokens[i]);
    		else if (tokens[i]== ')') {
    			while (ops.peek()!='(') {
    				int b = value.pop();
    				int a = value.pop();
    				int res = applyOperation(ops.pop(),a,b);
    				value.push(res);
    			}
    			ops.pop(); //pop '('
    		}
    		else {
    			while (!ops.isEmpty() && hasPrecedence(tokens[i],ops.peek()))
    				value.push(applyOperation(ops.pop(), value.pop(),value.pop()));
    			ops.push(tokens[i]);
    		}
    	}
    	while (!ops.empty()) 
            value.push(applyOperation(ops.pop(), value.pop(), value.pop())); 
    	return value.pop();
    }
    
    // Driver method to test above methods 
    public static void main(String[] args) 
    { 
        System.out.println(EvaluateString.evaluate("10 + 2 * 6")); 
        System.out.println(EvaluateString.evaluate("100 * 2 + 12")); 
        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 )")); 
        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 ) / 14")); 
    } 
    
    //return true if operation2 has greater or equal to operation1 
    public static boolean hasPrecedence(char operation1, char operation2) {
    	if ((operation1 == '*'||operation1=='/' ) && (operation2 == '+'||operation2=='-' ))
    			return false;
    	else if (operation2=='('||operation2==')') return false;
    	else return true;
    }
    
    public static int applyOperation(char op, int b, int a) {
    	switch(op)
    	{
	    	case'+': return a+b;
	    	case'-': return a-b;
	    	case'*': return a*b;
	    	case'/': return a/b;
    	}
    	return 0;	
    }
}
