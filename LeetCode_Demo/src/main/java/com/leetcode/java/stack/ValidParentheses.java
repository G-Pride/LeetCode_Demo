/**
   guozh
 * 2019年12月2日
 */
package com.leetcode.java.stack;
import java.util.Stack;
/**
 * @author guozh
 *
 *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
      有效字符串需满足：
- 左括号必须用相同类型的右括号闭合。
- 左括号必须以正确的顺序闭合。
- 注意空字符串可被认为是有效字符串。
 *
 * 创建时间：2019年12月2日 下午7:50:02
 */
public class ValidParentheses {
	
	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='(' || c=='[' || c=='{') {
				stack.push(c);//入栈：先把左边括号存进栈
			}else {//判断右边括号
				if(stack.isEmpty()) {//如果字符串没有一个左边括号返回false
					return false;
				}else {//开始匹配
					
					char topChar = stack.pop();//出栈
					if(c==')' && topChar!='(' ) {
						return false;
					}if(c==']' && topChar!='[' ) {
						return false;
					}if(c=='}' && topChar!='{' ) {
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		System.out.println((new ValidParentheses()).isValid("([])"));
		
		 // creating stack
	      Stack st = new Stack();
	      
	      // populating stack
	      st.push("Java");
	      st.push("Source");
	      st.push("code");

	      // searching 'code' element
	      System.out.println("Searching 'code' in stack: "+st.search("Java"));//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/java/util/stack_search.html


	}
}
