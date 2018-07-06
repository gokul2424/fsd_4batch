package com.cts.exceptions;

public class GCDemo {

	public static void main(String[] args) {
		
		String str = "";
		StringBuffer sb = new StringBuffer("");
		
		for(long i=0;i<10000000;i++)
		{
//			str = str+ i;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sb.append(i);
		}
		System.out.println(sb.toString());
	}

}
