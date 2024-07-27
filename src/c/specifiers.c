#include <stdio.h>
int main()
{
	printf("This prints well: %d\n", 65*2);
	printf("This does not print well: %d\n", 65/2);
	printf("This prints well: %f\n", 65.0/2);
	printf("This should print well: %f\n", 65/2);
	printf("This prints well: %c\n", 65);
	printf("This prints well: %x\n", 255);
	return 0;
}
