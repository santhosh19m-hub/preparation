package java8;

public class Demo {
public int findMax(int[] a) {
	int max=0;
for(int i=0;i<a.length;i++) {
	if(a[i]>max)
		max=a[i];
}
return max;
}
public static int findMin(int[] b) {
	int min=0;
	for(int i=0;i<b.length;i++) {
		if(b[i]<min)
			min=b[i];
	}
	return min;
}
}
