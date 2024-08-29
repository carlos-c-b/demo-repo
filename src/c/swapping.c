#include <stdio.h>

void swap(int *a, int *b);

int main()
{
	int a,b;
	a = 20;
	b = 100;
	printf("a=%d\tb=%d\n", a, b);
	swap(&a, &b);
	printf("a=%d\tb=%d\n", a, b);
	return 0;
}

void swap(int *a, int *b)
{
	int z;
	z = *a;
	*a = *b;
	*b = z;
}
