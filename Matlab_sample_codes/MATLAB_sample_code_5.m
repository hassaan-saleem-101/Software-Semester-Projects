
clc 
clear all 


t=-24:24;

x1= exp(2*t-0.5*24*pi);

x2= 24.*exp(2.*t-24*pi);

x3_t=cos(t+(pi/4*pi*24)).*sin(24*t+(24*pi/4));

y1 = x1./(x2+x3_t);
y2 = (x2.*x3_t)./(x3_t+x1);
y3 =  (x1./(x2+x3_t))+exp(-24*pi);

x = input('Enter the Number of funtion u want to display 1 for y1(t) 2 for y2(t) 3 for y3(t) :')

displayingFunctions(y1,y2,y3,x);

