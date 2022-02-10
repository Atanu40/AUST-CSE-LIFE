#include <stdio.h>
#include <stdlib.h>
#define SIZE 10
int G[SIZE][SIZE] , distance[SIZE] , inSet[SIZE] , q[SIZE] , parent[SIZE] ;
void printpaths(int Q)
{
    int i ;
    for ( i = 0 ; i < Q ; i++ )
        printf("i = %d parent = %d distance from source = %d \n", i+1 , parent[i] , distance[i] ) ;
}
int phi(int Q)
{
    int sum = 0 , i ;
    for( i = 0 ; i < Q ; i++ )
        sum += q[i] ;
    return sum ;
}
int extractMin(int Q)
{
    int i , idx , min = 1000 ;
    for ( i = 0 ; i < Q ; i++ )
    {
        if ( distance[i] <= min && inSet[i] == 0 )
            min = distance[i] , idx = i ;
    }
    q[idx] = 0 ;
    return idx ;
}
void dijkstra(int G[SIZE][SIZE], int Q, int S)
{
    int u , i , check_empty = phi(Q);

    while(check_empty >0)
    {
        u = extractMin(Q) ;

        inSet[u] = 1 ;
        q[u] = 0 ;
        for( i = 0 ; i < Q ; i++ )
        {
            if( G[u][i] > 0 )
            {
                if( distance[u] + G[u][i] < distance[i] )
                    distance[i] = distance[u] + G[u][i] , parent[i] = u + 1 ;
            }
        }
        check_empty = phi(Q);
    }

    printpaths(Q);
}
int main()
{
    int Q , i , j , S;
    freopen("Input3.txt", "r", stdin);
    scanf ( "%d" , &Q ) ;
    for ( i = 0 ; i < Q ; i++ )
    {
        for( j = 0 ; j < Q ; j++ )
            scanf( "%d" , &G[i][j] );
    }
    scanf ( "%d" , &S ) ;
    for ( i = 0 ; i < Q ; i++ )
        distance[i] = 1000 , inSet[i] = 0 , q[i] = 1 , parent[i] = -1 ;
    distance[ S - 1 ] = 0 ;
    dijkstra (G, Q, S) ;
    return 0;
}
