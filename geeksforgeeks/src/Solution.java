import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack; 
  
class Solution 
{ 
    static double evaluatePostfix(String expression) 
    { 
        //create stack to store values
        Stack<Double> values = new Stack<>(); 
        
        //save the sign of the number
        double sign = 1;
        
        for(int i = 0; i < expression.length(); i++) 
        { 
            char c = expression.charAt(i); 
            if (c == ' ') continue; 
            //if the character is '-' and the character after that is a number then the sign is changed to -
            if (c =='-' && i < expression.length() -1 && Character.isDigit(expression.charAt(i+1)))
            	sign = -1;
            //if the character is a digit, push it to stack
            else if(Character.isDigit(c)) 
            { 
            	double value = 0; 
                while(Character.isDigit(c)) 
                { 
                    value = value*10 + (double)(c-'0'); 
                    c = expression.charAt(++i); 
                } 
                i--; 
                values.push(value*sign); 
                sign = 1;
            } 
            //if the character is a operator, apply operator too two numbers in stack
            else
            { 
            	double number1 = values.pop(); 
            	double number2 = values.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    	values.push(number2+number1); 
                    	break; 
                      
                    case '-': 
	                    values.push(number2- number1); 
	                    break; 
                      
                    case '/': 
	                    values.push(number2/number1); 
	                    break; 
                      
                    case '*': 
	                    values.push(number2*number1); 
	                    break; 
            } 
            } 
        } 
        return values.pop();  
    } 
      
    // Driver program to test above functions 
    public static void main(String[] args)  
    { 
    	//use a Buffer reader to read file line by line
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/Users/phuphanmbp17/Desktop/myfile.txt"));
			String line = reader.readLine();
			while (line != null) {
//				System.out.print(line + " = ");
				if (line.equals("q")) System.exit(0);
				System.out.println(evaluatePostfix(line));
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    } 
} 
  

