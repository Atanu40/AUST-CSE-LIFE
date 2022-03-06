#include <stdio.h>

int r=0;

void HANOI( int n, char source, char temp, char dest )
{
    r++;
	if ( n==1 )
    {
       printf("Move the top disk from pole %c to pole %c\n", source, dest);
    }
    else
    {
		HANOI ( n-1, source, dest, temp );
		printf ( "Move the top disk from pole %c to pole %c\n", source,dest );
		HANOI( n-1, temp, source, dest );
	}
}

int main()
{
	char  source= 'i',temp= 'j', dest= 'k';
	int n;

	printf("Enter Number of Disks: ");
	scanf ( "%d", &n );

	HANOI( n, source, temp, dest );

	printf("Total Steps: %d\n",r);

	return 0;
}
