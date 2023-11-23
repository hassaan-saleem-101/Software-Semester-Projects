
% roll number 24 
clc
clear all
close all

syms t

k = -2:2;
T = 2*pi;
w = (2*pi)/T;

x = cos(24*t);
y = sin(24*t);

xy = x*y;

left = (1/T)*int(xy*exp(-j*k*w*t),t,0,T);

subplot 211
plot(k,abs(left))
title('Left Hand Side')

xk = (1/T)*int(x*exp(-j*k*w*t),t,0,T);
yk = (1/T)*int(y*exp(-j*k*w*t),t,0,T);

right = xk.*yk;
subplot 212
plot(k,abs(right))
title('Right Hand Side')