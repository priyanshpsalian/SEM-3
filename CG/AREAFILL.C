#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void flood(int,int,int,int);
void Boundary(int,int,int,int);
void main()
{
int gdriver=DETECT,gmode;
int choice,i;
initgraph(&gdriver,&gmode,"C:\\TC\\BGI");
rectangle(250,250,300,300);
printf("1.Flood fill\n 2.Boundary fill\n Enter your choice:");
scanf("%d",&choice);
switch(choice)
{
case 1:
printf("Enter the fill colour:");
printf("1.Blue\n2.Green\n3.Yellow:");
scanf("%d",&i);
switch(i)
{
case 1:
flood(260,260,BLUE,0);
break;
case 2:
flood(260,260,GREEN,0);
break;
case 3:
flood(260,260,YELLOW,0);
break;
default:
printf("Invalid Choice");
}
break;
case 2:
printf("Enter colour which you want to fill the square");
printf("\n 1.Blue\n 2.Yellow\n 3.Red");
scanf("%d",&i);
switch(i)
{
case 1:
Boundary(260,260,BLUE,15);
break;
case 2:
Boundary(260,260,YELLOW,15);
break;
case 3:
Boundary(260,260,RED,15);
break;
default:
printf("Invalid choice");
}
break;
default:
printf("Invalid choice");
}
getch();
}
void flood(int x,int y,int fillcolor, int defaultcolor)
{
if(getpixel(x,y)==defaultcolor)
{
putpixel(x,y,fillcolor);
flood(x+1,y,fillcolor,defaultcolor);
flood(x-1,y,fillcolor,defaultcolor);
flood(x,y+1,fillcolor,defaultcolor);
flood(x,y-1,fillcolor,defaultcolor);
}
}
void Boundary(int x,int y,int newcolor,int edge)
{
int current =getpixel(x,y);
if(current !=edge&& current !=newcolor)
{
putpixel(x,y,newcolor);
Boundary(x+1,y,newcolor,edge);
Boundary(x+1,y+1,newcolor,edge);
Boundary(x-1,y,newcolor,edge);
Boundary(x-1,y+1,newcolor,edge);
Boundary(x,y+1,newcolor,edge);
Boundary(x,y-1,newcolor,edge);
Boundary(x-1,y-1,newcolor,edge);
Boundary(x+1,y-1,newcolor,edge);
}
}
