
% roll number 24
%static or dynamic

clc
clear all
close all

n=-24:24;
x=24*n;
x1=24*-n;
y1=x1;
subplot 411
stem(n,y1,'g');

%Causal or Non Causal
subplot 412
stem(n,y1,'r');
xlabel('Time [n]');
ylabel('Amplitude y[n]');
title('Graph of Output [dynamic and non Causal]');

%Linear not Linear
a1=2;
a2=4;
x2=x;
s = a1*x1+a2*x2;
y1=s;
subplot 413
stem(n,y1);
title('Graph of S{a1x1[n] + a2x2[n]}');

s1 = 2.^x1;

s2 = 2.^x2;
y1 = a1*s1 + a2*s2; 
subplot 414
stem(n,y1);
title('Graph of a1S[a1x1[n]] + a2S[x2[n]] ');

%shift variant or shift invariant
no = 2; %let 
 
%Delay the output by no
figure;
subplot(2,1,1);
stem(-n+no,y1);
xlabel('Time [n]');

ylabel('Amplitude y[n]');
title('Graph of Output y[n-no]');
 
 
%Delay the input
 
subplot(2,1,2);
stem(-(n+no),x); 
xlabel('Time [n]');
ylabel('Amplitude y[n]');
title('Graph of Output S[x[n-no]] ');

