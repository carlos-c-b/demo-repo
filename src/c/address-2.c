#include <stdio.h>

int main()
{
	int *p;
	for (int i = 0; i < 10; i++)
	{
		printf("Address %p stores %d\n", p+i, *(p+i));
	}
	return 0;
}
