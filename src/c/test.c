#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void def()
{
	FILE *fp;
	char name[] = "Carlos";
	int phone = 640669933;
	char email[] = "carlos@gmail.com";

	fp = fopen("contacts.txt", "a");

	if(fp != NULL)
	{
		fprintf(fp, "Name: %s\n", name);
		fprintf(fp, "Phone: %d\n", phone);
		fprintf(fp, "e-Mail: %s\n", email);
		fprintf(fp,"\n");

		fclose(fp);
	}
	else 
	{
		printf("Error while opening file...\n");
		exit(1);
	}
}

int contains_digit(char s[])
{
	int a = 0;

	for(int i = 0; i < strlen(s); i++)
	{
		if(s[i] >= 65 && s[i] <= 90 || s[i] >= 97 && s[i] <= 122)
		{
			printf("Error: enter digits only\n");
			exit(1);
		}
	}
}

void menu()
{
	printf("--------------Menu--------------\n");
	printf("1. Add new contact\n");
	printf("2. Display contacts\n");
	printf("3. Exit\n");
	printf("--------------------------------\n");
	printf("Enter menu number: ");
}

void add()
{
	FILE *fp;
	char name[100];
	char phone[20];
	char email[100];

	printf("\n----------------New Contact----------------\n");
	printf("Name: ");
	scanf("%99s", name);	
	printf("Phone: ");
	scanf("%19s", phone);
	contains_digit(phone);
	printf("e-Mail: ");
	scanf("%99s", email);

	fp = fopen("contacts.txt", "a");

	if(fp != NULL)
	{
		fprintf(fp, "Name: %s\n", name);		
		fprintf(fp, "Phone: %s\n", phone);		
		fprintf(fp, "e-Mail: %s\n\n", email);		
		fclose(fp);
	}
	else 
	{
		printf("Error while opening file...\n");
		exit(1);
	}
}

void display()
{
	FILE *fp;
	char buffer[100];
	char *result;

	fp = fopen("contacts.txt", "r");

	if(fp != NULL)
	{
		result = fgets(buffer, 100, fp);
		while(result != NULL)
		{
				printf("%s", buffer);
				result = fgets(buffer, 100, fp);
		}
		fclose(fp);
	}
	else 
	{
		printf("Error while opening file\n");
		exit(1);
	}
}

int main(int argc, char **argv)
{
	int n;

	if(argc == 2)
	{
		if(strcmp(argv[1], "-d") == 0)
		{
			def();
			exit(0);
		}
		else if(strcmp(argv[1], "1") == 0)
		{
			add();
			exit(0);
		}
		else if(strcmp(argv[1], "2") == 0)
		{
			display();
			exit(0);
		}
		else if(strcmp(argv[1], "3") == 0)
		{
			exit(0);
		}
	}

	menu();
	scanf("%d", &n);

	switch(n)
	{
		case 1:
			add();
			break;
		case 2:
			display();
			break;
		case 3:
			exit(0);
		default:
			printf("Error: invalid number\n");
			exit(1);
	}
	
	return 0;
} 
