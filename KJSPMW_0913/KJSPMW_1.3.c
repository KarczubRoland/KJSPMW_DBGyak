#include <stdio.h>
#include <stdlib.h>
void example();

int main()
{
    example();
    return 0;
}

void example() {
    FILE *fp1, *fp2;
    char ch;
    char fnev[30];
    printf("Olvas fajlneve (30 karakter): ");
    scanf("%s", fnev);
    fp1 = fopen(fnev, "r");

    if(!fp1) {
        printf("Error.");
        exit(0);
    }

    printf("Iras fajlneve (30 karakter): ");
    scanf("%s", fnev);
    fp2 = fopen(fnev, "w");
    while ((ch=getc(fp1)) != EOF) {
        fputc(ch, fp2);
    }
    printf("Done.");
    fclose(fp1);
    fclose(fp2);
}

