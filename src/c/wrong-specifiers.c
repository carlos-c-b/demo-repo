#include <stdio.h>

int main()
{
	/*
	%c Character
	%d Decimal integer
	%e or %E Scientific notation
	%f Floating point
	%g or %G Scientific notation or floating point (whichever shorter)
	%i Decimal integer
	%o Octal number
	%p Pointer
	%s String of characters
	%u Unsigned decimal integer
	%x or %X Hexadecimal number
	%% Display the % sign
	*/
	
	printf("%d\n", 128); // Correct usage
	printf("%f\n", 128.0); // Correct usage

	printf("%d\n", 128.0); // Incorrect usage
	printf("%f\n", 128); // Incorrect usage

	return 0;
}
