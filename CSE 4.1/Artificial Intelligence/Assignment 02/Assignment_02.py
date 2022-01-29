graph=[
    ('i','a',35), 
    ('i','b',45), 
    ('a','c',22), 
    ('a','d',32),
    ('b','d',28),
    ('b','e',36),
    ('b','f',27),
    ('c','d',31),
    ('c','g',47),
    ('d','g',30),
    ('e','g',26),
]

visited = [0] * len(graph)
all_paths = []

def pathFind(start,end, weight=[]):
    
    if start == end:
        all_paths.append(list(weight))
        
    i = 0
    child = ''
    while i <= len(graph)-1:
        if  visited[i] == 0 and graph[i][0] == start:
            visited[i] = 1
            child = graph[i][1]
            weight.append(( start,child,graph[i][2] , i))
            pathFind(child,end)
                 
        i+=1

    if len(weight) >= 1:
        visited[weight[len(weight)-1][3]] = 0
        weight.pop()
    

start = 'i'
end = 'g'
pathFind(start,end)

print(f"\nStart node = {start} and End node = {end} \n")
for i,target_list in enumerate( all_paths ,1):
    print(
        f"Path {i} = {target_list} Length = { sum( [ p[2] for p in target_list] ) }"
        )   
