
clc

clear all

n1 = -24:24;

x1 = (2*cos(pi.*n1 + pi./(3*24))) .* heaviside(n1);

subplot(2,2,1)

stem(n1,x1,'r');
title('Graph of x1')
xlabel('Time')
ylabel('Amplitude')

subplot(2,2,2)

y=flip(x1);

x_o=0.5.*(x1-y);

stem(x_o);
title('Odd part function ')
xlabel('Time')
ylabel('Amplitude')

subplot(2,2,3)
x_e=0.5.*(x1+y);
stem(x_e);
title('Even part function')
xlabel('Time')
ylabel('Amplitude')

E=sum((abs(x1)).^2);
P=(E*1)./(1+(2*n));
E=E(end);
P=P(end);


