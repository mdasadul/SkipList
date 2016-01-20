import java.util.*;

public class Insert {

	LinkedList<Integer> firstList = new LinkedList<Integer>(); 
	void insert(int item){
		
		firstList.add(item);
	}
	void traverse(){
		for(int item:firstList){
			System.out.println(item);
		}
	}
	public static void main(String args[]){
		
	}
}
