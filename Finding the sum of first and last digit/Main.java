#include <stdio.h>
int main() {
	int a,b,c,d,n;
  scanf("%d",&b);
  n=b;
  while(b>=100)
  {
    b=b/10;
  }
  b=b/10;
  c=n%10;
  d= c+b;
  printf("%d",d);
	return 0;
}