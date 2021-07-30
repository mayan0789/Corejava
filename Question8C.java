package collectionss;

import java.util.Stack;

public class Question8C {

	public static void main(String[] args) {
		
		
		Stack po = new Stack();
		Stack ry = new Stack();
		Stack re =new Stack();
		
		
		po.push('A');   po.push('B');   po.push('C');  po.push('D');
		po.push('E');   po.push('F');   po.push('G');  po.push('H');
		po.push('I');   po.push('J');   po.push('K');  po.push('L');
		po.push('M');   po.push('N');   po.push('O');  po.push('P');
		po.push('Q');   po.push('R');   po.push('S');  po.push('T');
		po.push('U');   po.push('V');   po.push('W');  po.push('X');
		po.push('Y');   po.push('Z');
	
		System.out.println(po);
        
		System.out.println(po.size());
	
		while(po.isEmpty()==false) {
			ry.push(po.pop());
			}
		System.out.println(ry.size());
		
		System.out.println(ry);
	
		while(ry.isEmpty()==false) {
			
		
	System.out.println(ry.pop());
		}
	}

}
