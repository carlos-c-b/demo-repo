#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
	float degrees;
	float radians;
	printf("\tAngle x\t|sin(x)\n");	
	for (degrees = 0; degrees <= 20; degrees += 5)
	{
		radians = degrees * M_PI / 180;
		printf("\t%.1f\t|%f\n", degrees, sin(radians));	
	}
	return 0;
}
