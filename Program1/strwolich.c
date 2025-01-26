#include <stdio.h>
#include <string.h>

void main()
{
 char str[100];
 int words=0,lines=0,characters=0;
 scanf("%[^~]",str);
 for(int i=0;str[i]!='\0';i++)
 {
   if(str[i]==' ')
   {
    words++;
    }
    else if(str[i]=='\n')
    {
     lines++;
     words++;
    }
    else if(str[i]!=' ' && str[i]!='\n')
   {
    characters++;
    }
  }
    if(characters > 0)
   {
    words++;
    lines++;
    }
    printf("Total number of words : %d\n",words);
    printf("Total number of lines : %d\n",lines);
    printf("Total number of characters : %d\n",characters);
}
