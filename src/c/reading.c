#include <stdio.h>

int main()
{
	FILE *fp;
	char c;
	fp = fopen("file.txt", "r");
	if(fp != NULL)
	{
		c = getc(fp);
		while(c != EOF)
		{
			printf("%c",c);
			c = getc(fp);
		}
		fclose(fp);
		printf("\n");
	}
	else 
		printf("Error while opening file...\n");

	return 0;
}
