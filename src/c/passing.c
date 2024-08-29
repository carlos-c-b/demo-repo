#include <stdio.h>

void swap(int a, int b);

int main()
{
	int a,b;
	a = 5;
	b = 19;
	swap(5,19);
	printf("a=%d b=%d\n",a,b);
	return 0;
}

 void swap(int a, int b)
 {
 	int z;
	z = a;
	a = b;
	b = a;
 }
