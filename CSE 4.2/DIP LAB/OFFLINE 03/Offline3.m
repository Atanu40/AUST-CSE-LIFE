clear;
I = imread('Atanu.jpeg');
I = im2double(I);
gray = rgb2gray(I);
gray = im2double(gray);

Sigma = 'Enter the Sigma value = '
in = input(Sigma)

figure;
imshow(gray);

data = -5:5;

%X , Y matrix for 11*11 Kernel
gau_x = zeros(11,11);
gau_y = zeros(11,11);

%making 11*11 gausian kernel for X
for i = 1:11
    for j = 1:11
        gau_x(i,j) = data(j);
    end
end


%making 11*11 gausian kernel for Y
for i = 1:11
    for j = 1:11
        gau_y(j,i) = data(j);
    end
end

%calculating as per given equation
% -(X^2 + Y^2)
up = -(gau_x .* gau_x + gau_y .* gau_y);

% 2 * sigma^2
down = 2 * in * in;

% dividing this -(X^2 + Y^2) matrix by 2 * sigma^2 
up = up /down ;

% calculating e^{-(X^2 + Y^2) /(2 * sigma^2 )}
e = exp(up);

% calculating 2*r*sigma^2 
new_down = down * pi;

% calculating for making the final filter
filter = e/new_down;

% As i have to use 11*11 kernel so making an zero matrix having 10 row and
% 10 colum more from my input image
z = zeros(730,1290);
z = im2double(z);

%Doing zero padding
for i = 1:size(gray,1)
    for j = 1 : size(gray,2)
        z(i+5,j+5) = gray(i,j);
    end
end

final = z;
final = im2double(final);

for i = 1:730-11
    for j = 1:1290-11
        a = z(i:i+10,j:j+10);
        val = a .* filter;
        center_pixel_val = sum(val(:));
        final(i+5,j+5) = center_pixel_val;
    end
end

figure;
imshow(final);

