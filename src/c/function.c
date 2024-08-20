#include <stdio.h>

int foo(int a);

int main()
{
	int a = 10;
	foo(a);
	printf("%d\n",a);
	return 0;
}

int foo(int a)
{
	a++;	
	return 0;
}
