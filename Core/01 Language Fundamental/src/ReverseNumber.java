package com.company.module.submodule;

public class ReverseNumber {
public static void main(String[] args) {
	ReverseNumber rn=new ReverseNumber();
	rn.numberReversor(12345);
}

private void numberReversor(int number) {
//String str=String.valueOf(number);
//solution1
//System.out.println(new StringBuffer(str).reverse());
//solution2
/*char[] ch=str.toCharArray();
for(int j=ch.length-1;j>=0;j--) {
	System.out.print(ch[j]);
}*/
	//solution3
	//int reverse=0;
	/*while(number!=0) {
		reverse=reverse*10+number%10;
		System.out.println(reverse);
		number=number/10;
		System.out.println(number);*/

		
		
	//}
	//System.out.println(reverse);
//solution4
	int[] ar=new int[String.valueOf(number).length()];
	int index=0;
	while(number>0) {
	ar[index++]=number%10;
	number=number/10;
	}
	for(int i=0;i<index;i++)
		System.out.print(ar[i]);
}
}
