#include <stdio.h>
#include <math.h>

// ax² + bx + c = 0
int main(char argv, char **argc)
{
	double a, b, c, x_1, x_2;
	printf("a=");
	scanf("%lf",&a);
	printf("b=");
	scanf("%lf",&b);
	printf("c=");
	scanf("%lf",&c);
	
	// If b²-4ac >= 0, x is real; otherwise, x is complex
	if(pow(b,2)-4*a*c >= 0)
	{
		x_1 = (-pow(b,2)+sqrt(pow(b,2)-4*a*c))/2;
		x_2 = (-pow(b,2)-sqrt(pow(b,2)-4*a*c))/2;
	}
	else
	{
		double i_1, i_2;
		x_1 = (-pow(b,2)+sqrt(pow(b,2)-4*a*c))/2;
		i_1 = (pow(b,2)-4*a*c);
		i_2 = (pow(b,2)-4*a*c);
		x_2 = (-pow(b,2)-sqrt(pow(b,2)-4*a*c))/2;
	}
		printf("x_1=%lf\n", x_1);
		printf("x_2=%lf\n", x_2);
	return 0;
}
