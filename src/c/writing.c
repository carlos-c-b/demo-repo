#include <stdio.h>

void writing(int n, char **s);
void reading();

int main(int argc, char **argv)
{
	writing(argc, argv);
	reading();
	return 0;
}

void writing(int n, char **s)
{
	FILE *wrt;

	wrt = fopen("file.txt", "a");

	if(wrt != NULL)
	{
		for (int i = 1; i < n; i++)
		{
			fputs(s[i],wrt);
			fputs(" ", wrt);
		}
		fputs("\n", wrt);
		fclose(wrt);
	}
	else
		printf("Error while opening file...\n");
}

void reading()
{
	FILE *read;
	char buffer[100];

	read = fopen("file.txt", "r");

	if(read != NULL)
	{
		while(fgets(buffer, 100, read) != NULL)
		{
			printf("%s", buffer);
		}
		fclose(read);
	}
	else
		printf("Error while opening file...\n");
}
