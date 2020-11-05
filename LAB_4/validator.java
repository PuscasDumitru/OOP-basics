import java.io.*;
import java.util.*;

public class validator
{
    Stack<Character> stack = new Stack<Character>();

    public void check(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(')
                stack.push('(');

            else if (s.charAt(i) == ')' && stack.isEmpty())
            {
                System.out.println("Invalid expression");
                return;
            }

            else if (s.charAt(i) == ')')
                stack.pop();

        }

        if (stack.isEmpty())
            System.out.println("Valid expression");

        else
            System.out.println("Invalid expression");
    }

}
