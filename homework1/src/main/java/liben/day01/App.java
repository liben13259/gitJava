package liben.day01;

/**
 * Hello world!
 *
 */

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("<");
    	List list = new ArrayList();
		int j;
		for(int i=101;i<=200;i+=2){
			boolean flag=true;
			for(j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				list.add(i);
				
			}
		}
		for (int k=0;k<list.size();k++){
			if(k<list.size()-1){
				System.out.print(list.get(k));
				System.out.print(",");
			}else {
				System.out.print(list.get(k));
			}
		}
		System.out.print(">");
    }
}