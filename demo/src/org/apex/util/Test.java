package org.apex.util;

public class Test {
	public static void main(String[] args) {
		int arr1[]={10,20,80};
		int arr2[]={2,5,40,60};
		int arr1length=arr1.length;
		int arr2length=arr2.length;
		int arr3Length=arr1length+arr2length;
		int[] arr3=new int[arr3Length];
		int count=0;
		for(int i=0;i<=arr1length-1;i++)
		{
		arr3[i]=arr1[i];
		count++;
		}
		for(int j=0;j<=arr2length-1;j++)
		{
		arr3[count]=arr2[j];
		count++;
		}
	}
		//Arrays.sort(arr3);
	//	for(int k=0;k eB a doog namuh.

		//Write below method and call from main class

		public static void reverseWords(String sentence)
		{
		String[] words=sentence.split(" ");
		int wordCount=words.length;
		for(int i=0;i<wordCount;i++)
		{
		StringBuilder strbuilder=new StringBuilder();
		strbuilder.append(words[i]);
		String revWord=strbuilder.reverse().toString();
		System.out.print(revWord+ " ");
		}
		System.out.println();
		}
		//3. Replace a special character with %20. eg: http://www.amazon.com—-&gt; www%20amazon%20com.

		public static void replaceSpecialChar(String str)
		{

		String newstr=str.replaceAll("[!@#$%^&*.|?]", "%20");
		System.out.println(newstr);
		}
}
