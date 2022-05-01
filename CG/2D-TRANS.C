#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
void shear(float tr[3][3],float shx,float shy)
{
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
{
tr[i][j]=1;
}
else
{
tr[i][j]=0;
}
}
}
tr[0][1]=shy;
tr[1][0]=shx;
}
void reflect(float tr[3][3])
{
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
{
tr[i][j]=-1.0;
}
else
{
tr[i][j]=0.0;
}
}
}
tr[2][2]=1.0;
}
void rotate(float tr[3][3],float theta)
{
int i,j;
float rad=3.14/180.0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
{
tr[i][j]=1.00;
}
else
{
tr[i][j]=0.00;
}
}
}
tr[0][0]=cos(rad*theta);
tr[0][1]=sin(rad*theta);
tr[1][0]=sin(rad*theta);
tr[1][1]=cos(rad*theta);
}
void scale(float tr[3][3], float sx, float sy)
{
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
{
tr[i][j]=1.0;
}
else
{
tr[i][j]=0.0;
}
}
}
tr[0][0]=sx;
tr[1][1]=sy;
}
void translate(float tr[3][3],float tx,float ty)
{
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
{
tr[i][j]=1.0;
}
else
{
tr[i][j]=0.0;
}
}
}
tr[2][0]=tx;
tr[2][1]=ty;
}
void display(float arr[3][3])
{
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
printf("%0.2f\t",arr[i][j]);
}
printf("\n");
}
printf("\n");
}
void result(float obj[3][3],float tr[3][3],float res[3][3])
{
int i,j,k;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
res[i][j]=0;
for(k=0;k<3;k++)
{
res[i][j]+=obj[i][k]*tr[k][j];
}
}
}
}
void createobj(float obj[3][3])
{
float x1,y1,x2,y2,x3,y3;
printf("Enter cordinates of triangle:");
scanf("%f%f%f%f%f%f",&x1,&y1,&x2,&y2,&x3,&y3);
obj[0][0]=x1;
obj[0][1]=y1;
obj[0][2]=1.0;
obj[1][0]=x2;
obj[1][1]=y2;
obj[1][2]=1.0;
obj[2][0]=x3;
obj[2][1]=y3;
obj[2][2]=1.0;
line(320+x1,240-y1,320+x2,240-y2);
line(320+x2,240-y2,320+x3,240-y3);
line(320+x3,240-y3,320+x1,240-y1);
}
void plotres(float res[3][3])
{
line(320+res[0][0],240-res[0][1],320+res[1][0],240-res[1][1]);
line(320+res[1][0],240-res[1][1],320+res[2][0],240-res[2][1]);
line(320+res[2][0],240-res[2][1],320+res[0][0],240-res[0][1]);
}
void main()
{
int gd=DETECT,gm,choice;
float obj[3][3],tr[3][3],res[3][3],tx,ty,sx,sy,shx,shy;
initgraph(&gd,&gm,"C:\\TC\\BGI");
line(320,0,320,480);
line(0,240,640,240);
createobj(obj);
printf("1.Translation 2.Scaling 3.Rotation 4.Reflection about origin 5.Shear\n");
printf("Choose a transformation:");
scanf("%d",&choice);
switch(choice)
{
case 1:
printf("Enter translation distance for x and ycoordinates:");
scanf("%f%f",&tx,&ty);
translate(tr,tx,ty);
break;
case 2:
printf("Enter scaling factors for x and y coordinates:");
scanf("%f%f",&sx,&sy);
scale(tr,sx,sy);
break;
case 3:
{
float theta;
printf("Enter angle for ACW rotation about origin:");
scanf("%f",&theta);
rotate(tr,theta);
break;
}
case 4:
reflect(tr);
break;
case 5:
printf("Enter shear factors for x and y coordinates:");
scanf("%f%f",&shx,&shy);
shear(tr,shx,shy);
break;
default:
printf("Invalid choice");
}
printf("The object matrix is:\n");
display(obj);
printf("The transformation matrix is:\n");
display(tr);
result(obj,tr,res);
printf("The resultant matrix is:\n");
display(res);
plotres(res);
getch();
}
