package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

//Push , pop , top,getMax , popMax

public class Main1 {
	
	public static void main(String[] args) {
		//
		Main1.Stack<Integer> stack = new Main1().new Stack<Integer>();
		stack.push(10);
		stack.push(5);
		stack.push(2);
		stack.push(4);
		stack.push(8);
		System.out.println("pop-->"+stack.pop());
		System.out.println("top-->"+stack.top());
		System.out.println("getMax-->"+stack.getMax());
		System.out.println("popMax-->"+stack.popMax());
		
	}
	
	
	public class Stack<E>{
		
		List<E> finalSet = new LinkedList<E>();

		public void push(E e) {
			if(Objects.nonNull(e)) {
				finalSet.add(e);
			}
		}
		
		public E pop() {
			E element = null;
			if(finalSet.size()>0) {
				element = finalSet.get(finalSet.size()-1);
				finalSet.remove(finalSet.size()-1);
			}
			return element;
		}
		
		public E top() {
			E element = null;
			if(finalSet.size()>0) {
				element = finalSet.get(finalSet.size()-1);
			}
			return element;
		}
		
		public E getMax() {
			E element = null;
			if(finalSet.size()>0) {
				Object[] arrayElements = finalSet.toArray();  //O(n)
				Arrays.sort(arrayElements);
				element = (E)arrayElements[arrayElements.length-1];
			}
			
			return element;
			
		}
		
		public E popMax() {
			E element = null;
			if(finalSet.size()>0) {
				Object[] arrayElements = finalSet.toArray();  //O(n)
				Arrays.sort(arrayElements);
				finalSet.remove(finalSet.indexOf(arrayElements.length-1));
				element = (E)arrayElements[arrayElements.length-1];
			}
			return element;
			
		}
		
		
	}
}


