package com.mo.hello.main;

public class Main2 {

	public static void main(String[] args) {
//		int []p = {9,1,4,6,7};
		int []p = {2,1,4,6,5,122,12,131,13,12,40,0};
		
		for(int i = 0; i<p.length-1; i++){
			System.out.print("\n外循环："+i);
			for(int j =1+i; j<p.length; j++){
				if(p[i]>p[j]){
					int a = p[i];
					p[i] = p[j];
					p[j] = a;
				}
				System.out.print("  内循环："+j);
			}
		}
		for(int i=0;i<p.length;i++){
			System.out.print("\n"+p[i]);
		}
	}

}
