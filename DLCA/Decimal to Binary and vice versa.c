#include <stdio.h>
void main()
{
int a[10], number, i, j;
printf("\nEnter the Number You want to Convert  :  ");
scanf("%d", &number);
for(i = 0; number > 0; i++)
{
a[i] = number % 2;
number = number / 2;
}
printf("\nBinary Number of a Given Number = 0 ");
for(j = i - 1; j >= 0; j--)
{
printf(" %d ", a[j]);
}
printf("\n");


int num, binary, decimal = 0, base = 1, rem;
printf (" Enter a binary number with the combination of 0s and 1s \n");
scanf (" %d", &num);
binary = num;
while ( num > 0)
{
rem = num % 10;
decimal = decimal + rem * base;
num = num / 10;
base = base * 2;
}
printf ( " The binary number is %d \t", binary);
printf (" \n The decimal number is %d \t", decimal);
}
