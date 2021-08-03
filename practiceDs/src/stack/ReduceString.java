package stack;
import java.util.Scanner;
import java.util.Stack;
public class ReduceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack=new Stack<>();
        String ch=scanner.next();
        for(int i=0;i<ch.length();i++){
       if(stack.isEmpty()){
           stack.push( ch.charAt(i));
       }else if(stack.peek()==ch.charAt(i)){
           stack.pop();

       }else{
           stack.push(ch.charAt(i));

       }
        }
        StringBuffer stringBuffer =new StringBuffer();
        while (!stack.isEmpty()){
            stringBuffer.append(stack.pop());
        }if(stringBuffer.length()==0){
            System.out.println("Empty String");
        }else {
            System.out.println(stringBuffer.reverse().toString());
        }
    }
}
