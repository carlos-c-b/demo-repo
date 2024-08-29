#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
	FILE *wrt;
	FILE *read;
	char *message;
	char c; // Character for reading 
	message = "This is a message\n";

	wrt = fopen("file.txt","a");

	if(wrt != NULL)
	{
		fputs(message, wrt);
	}
	else
	{
		printf("Error while opening file\n");
		exit(0);
	}	

	fclose(wrt);

	read = fopen("file.txt", "r");

	if(read != NULL)
	{
		c = getc(read);
		while(c != EOF)
		{
			printf("%c", c);
			c = getc(read);
		}
		fclose(read);
	}
	else
	{
		printf("Error while opening file\n");
		exit(0);
	}

	return 0;
}
