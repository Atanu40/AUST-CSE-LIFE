%a:
a = imread('cameraman.png');


b=size(a);


%b:
histval = zeros(1,256);
for i=1:b(1)
    for j=1:b(2)
        for k=0:255
            if a(i,j)==k
                histval(k+1)=histval(k+1)+1;
            end
        end
    end
end

%c:
pdf=histval/sum(histval);


%d:
cdf = zeros(1,256);
cdf(1)=pdf(1);
for i=2:256
    cdf(i)=cdf(i-1)+pdf(i);
end

%e:
cdf = 255*cdf;

%f:
cdf = round(cdf);

eq = zeros(b);
for i=1:b(1)                                       
    for j=1:b(2)                                    
        eq(i, j) = cdf(a(i, j));                         
    end                                             
end

%g:
%h:
subplot(2,2,1);
imshow(uint8(a));
subplot(2,2,3);
imshow(uint8(eq));
subplot(2,2,2);
imhist(a);
subplot(2,2,4);
imhist(uint8(eq));