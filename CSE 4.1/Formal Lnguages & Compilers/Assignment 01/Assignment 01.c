#include<stdio.h>
#include<conio.h>

int main()
{

    FILE *input, *output;
    char c;
    int check;

    input = fopen("inputFile.c","r");
    output = fopen("170204003_Asm1.txt","w");

    if(!input)
    {
        printf("\n file can't be opened");
    }
    else
    {
        while((c = fgetc(input)) !=EOF)
        {
            check=0;
            if(c=='/'){
                c=fgetc(input);

                if(c=='/'){
                    check=1;
                    while((c=fgetc(input))!='\n');
                }
                else if(c=='*'){
                    check=1;
                    while((c=fgetc(input))!=EOF){
                        if((c=fgetc(input))=='*' &&(c=fgetc(input))=='/'){
                            break;
                        }
                    }
                }
            }
            else if((c =='\n')||(c =='  '))
            {
                check=1;
            }
            else if(check==0){
                fputc(c,output);
            }

        }
}
    fclose(input);
    fclose(output);

    output = fopen("170204003_Asm1.txt","r");
    while((c=fgetc(output))!=EOF )
    {
        printf("%c",c);
    }
    fclose(output);

    return 0;
}
