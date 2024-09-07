#include <stdio.h>

int main()
{
	int *pa, *pb;
	int x = 10;
	pa = &x;
	pb = pa;
	x = 20;
	printf("%d\n",*pb);
	return 0;
}
