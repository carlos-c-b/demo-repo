#include <stdio.h>

int main()
{
	int marks[5] = {1,2,3,4,5};
	printf("%d\n", *(&marks[0]));
	return 0;
}
