#include <stdio.h>
#include <stdlib.h>
void example();

int main()
{
    example();
    return 0;
}

void pelda() {
    FILE *file;
    char ch;
    char fnev[30];
    printf("Fajlneve (30 karakter hosszu): ");
    scanf("%s", fnev);
    fp = fopen(fnev, "w");
    printf("Message: ");
    while((ch=getchar()) != '#')
    {
        putc(ch, fp);

    }
    fclose(fp);

    fp = fopen(fnev, "r");
    while ((ch=getc(fp)) != EOF) {
        printf("%c",ch);
    }
    fclose(fp);
}
