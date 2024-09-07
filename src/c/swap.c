#include <stdio.h>

// Program to test the passing of arguments
void swap(int *pa, int *pb)
{
	int aux;
	aux = *pa;
	*pa = *pb;
	*pb = aux;
}

// Try it now with char and string

void swap_char(char *pa, char *pb)
{
	char aux;
	aux = *pa;
	*pa = *pb;
	*pb = aux;
}

void swap_string(char **pa, char **pb)
{
	char *aux = *pa;
	*pa = *pb;
	*pb = aux;
}

int main()
{
	char *a = "aaa";
	char *b = "bbb";
	printf("Before swapping: a = %s, b = %s\n", a, b);


	swap_string(&a, &b);

	printf("After swapping: a = %s, b = %s\n", a, b);
	return 0;
}
