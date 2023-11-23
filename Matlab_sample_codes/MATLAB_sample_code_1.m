
clc
clear all

syms t;
x1 =  exp(0.5.* 24.* t).* heaviside(-t); % in time 
x2 = t.*exp(2 .* t - 24.*pi) .*heaviside(-t-24);  % in time 

y1= fourier(x1);  % in fourier 
y2 = fourier(x2);  % in fourier 

w = -24:0.01:24;

subplot 211
plot(w,subs(abs(y1)),'b')
title('Frequency Domain (y1(w)) function')
xlabel('Omega')
ylabel('Degrees')

subplot 212
plot(w,subs(abs(y2)),'r')
title('Frequency Domain (y2(w)) function')
xlabel('Omega')
ylabel('Degrees')