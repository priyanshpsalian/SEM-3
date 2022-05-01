#include <stdio.h>
#include <math.h>
void main()
{
int n, absN, i, j, bin[50] = {};
printf("Enter Number\n");
scanf("%d", &n);
absN = abs(n);
for(i = 0; absN != 0; i++)
{
bin[i] = absN % 2;
absN /= 2;
}
printf("Your number in binary is ");
if(n < 0)
{
for(j = 0; j <= i; j++)
{
bin[j] = (bin[j] == 1) ? 0 : 1;
}
for(j = 0; bin[j] == 1; j++)
bin[j] = 0;
bin[j] = 1;
for(; i >= 0; i--)
printf("%d", bin[i]);
}
else
{
printf("0");
for(i = i-1; i >= 0; i--)
printf("%d", bin[i]);
}
}
