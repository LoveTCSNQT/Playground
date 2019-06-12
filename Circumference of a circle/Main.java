#include <stdio.h>
#define PI 3.14
int main()
{
  float r,c;
  scanf("%f", &r);
  c=PI*r*r;
  printf("%0.2f", c);
  return 0;
}