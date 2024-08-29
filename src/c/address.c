#include <stdio.h>

int main()
{
	int number;
	int *p;
	number = 20;
	p = &number;
	printf("The number is: %d\n", number);
	printf("The number is stored in address: %p\n", &number);
	printf("The pointer is: %p\n", p);
	printf("The address the pointer points to stores: %d\n", *p);
	printf("The pointer is stored in address: %p\n", &p);
	return 0;
}
