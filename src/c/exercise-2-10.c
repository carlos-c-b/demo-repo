#include <stdio.h>
int main()
{
	float a, b, sum;
	printf("Enter first number: ");
	scanf("%f", &a);
	printf("Enter second number: ");
	scanf("%f", &b);
	sum = a + b;
	printf("%.2f+%.2f=%.2f\n",a, b, sum);
	return 0;
}
