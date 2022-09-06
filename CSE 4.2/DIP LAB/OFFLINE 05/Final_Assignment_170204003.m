%Step-1
Input_img=imread('Image1.jpg');
Input_img= im2double(Input_img);

[row,col]=size(Input_img);
I=zeros(row+2,col+2);
I(2:row+1,2:col+1)= Input_img;

%Step-2
I1=zeros(row,col);
Lp=[0 -1 0;-1 4 -1;0 -1 0];
for u=2:row+1
    for v=2:col+1
       I1(u-1,v-1)= I(u-1,v)*Lp(1,2)+I(u,v-1)*Lp(2,1)+ I(u,v)*Lp(2,2)+ I(u,v+1)*Lp(2,3)+I(u+1,v)*Lp(3,2);
    end
end

%Step-3
I2=(Input_img-I1);

%Step-4
I3_a=zeros(row,col);
I3_b=zeros(row,col);
Sb_x=[-1 0 1; -2 0 2; -1 0 1];
Sb_y=[-1 -2 -1; 0  0  0; 1  2  1];
for u=2:row+1
    for v=2:col+1
       I3_a(u-1,v-1)= I(u-1,v-1)*Sb_x(1,1)+I(u-1,v+1)*Sb_x(1,3)+I(u,v-1)*Sb_x(2,1)+I(u,v+1)*Sb_x(2,3)+I(u+1,v-1)*Sb_x(3,1)+I(u+1,v+1)*Sb_x(3,3);
       I3_b(u-1,v-1)= I(u-1,v-1)*Sb_y(1,1)+I(u-1,v)*Sb_y(1,2)+I(u-1,v+1)*Sb_y(1,3)+I(u+1,v-1)*Sb_y(3,1)+I(u+1,v)*Sb_y(3,2)+I(u+1,v+1)*Sb_y(3,3);
    end
end
I3= sqrt(I3_a.*I3_a+I3_b.*I3_b);
        
%Step-5
I4=zeros(row,col);
F=zeros(row+4,col+4);
F(3:row+2,3:col+2)= Input_img;
kernel= zeros(5,5);
for i=3:(row+2)
    for j=3:(col+2)
        kernel=F(i-2:i+2,j-2:j+2);
        I4(i-2,j-2)= sum(kernel(:))/25;    
    end
end

%Step-6
I5= I2 .* I4;

%Step-7
I6= Input_img+I5;

%Step-8
I7=zeros(row,col);
c=1;
Gamma=0.5;
for i=1:row
    for j=1:col
         I7(i,j)= c* (Input_img(i,j)^Gamma);
    end
end

subplot(2,4,1);imshow(Input_img);title('a');
subplot(2,4,2);imshow(I1,[]);title('b');
subplot(2,4,3);imshow(I2);title('c');
subplot(2,4,4);imshow(I3);title('d');
subplot(2,4,5);imshow(I4);title('e');
subplot(2,4,6);imshow(I5);title('f');
subplot(2,4,7);imshow(I6);title('g');
subplot(2,4,8);imshow(I7);title('h');