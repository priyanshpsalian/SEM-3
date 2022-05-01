#include<stdio.h>
#include<graphics.h>
#include<conio.h>
void main()
{
int x,y,x1,y1,r,p;
int gdriver=DETECT,gmode;
clrscr();
initgraph(&gdriver,&gmode,"C:\\TC\\BGI");
printf("Enter the coordinates:\n");
scanf("%d%d",&x1,&y1);
printf("Enter the radius:\n");
scanf("%d",&r);
x=0;
y=r;
p=1-r;
do{
putpixel(x1+x,y1+y,WHITE);
putpixel(x1+y,y1+x,WHITE);
putpixel(x1-y,y1+x,WHITE);
putpixel(x1-x,y1+y,WHITE);
putpixel(x1-x,y1=y,WHITE);
putpixel(x1-y,y1-x,WHITE);
putpixel(x1+y,y1-x,WHITE);
putpixel(x1+x,y1-y,WHITE);
if(p<0)
{
p=p+(2*x)+1;
}
else
{
y=y-1;
p=p+(2*x)-(2*y)+1;
}
x=x+1;
}
while(y>x);
getch();
closegraph();
}
