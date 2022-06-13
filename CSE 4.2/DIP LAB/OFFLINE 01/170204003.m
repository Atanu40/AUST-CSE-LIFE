image1 = 'Atanu01.jpg';
image2 = 'Atanu02.jpeg';

img1=imread(image1);
img2=imread(image2);
A = 6;
B = 80;
C = A * B;

figure;
imshow(img1);
figure;
imshow(img2);
output = img1;
for i = 2 : 2 : A
    output(B * (i - 1) + 1 : B * i, :, :) = img2(B * (i - 1) + 1 : B * i, :, :);
end
figure;
imshow(output);
imwrite(output, 'output.jpg');