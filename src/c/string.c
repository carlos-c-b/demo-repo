#include <stdio.h>

int main()
{
	char *a;
	a = "Hello World!";
	printf("String: %s\n", a);
	printf("First Character: %c\n", *a);
	printf("%c\n", *(a+12));
	return 0;
}
