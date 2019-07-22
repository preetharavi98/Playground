#include<stdio.h>
int main()
{
 char ch;
  scanf("%c",&ch);
  if((ch=='a')||(ch=='u')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='A')||(ch=='U')||(ch=='E')||(ch=='I')||(ch=='O'))
  {
    printf("Vowel",ch);
  }
  else
  {
    printf("Consonant",ch);
  }
  return 0;
}