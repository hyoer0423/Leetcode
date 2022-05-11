n=2
#注意res matrix的定义方法
res=[]
for i in range(n):
    res.append([0 for i in range(n)])
i,j=0,0
m=0
z=1
fj,fi=0,0
while z<=n*n:
    
    if m%2==0:
        
        while(j<n and res[i][j]==0):
            print(i,j,m,"\n")
            print(res)
            res[i][j]=z
            z=z+1
            fj=j
            fi=i
            #i=(i+(-1)**(m/2))%n
            j=(j+(-1)**(m/2))%n
    else:
        print(res)
        print(m,i,j)
        
        while(i<n and res[i][j]==0):
            
            res[i][j]=z
            z=z+1
            fi=i
            fj=j
            #j=(j+(-1)**((m-1)/2))%n
            i=(i+(-1)**((m-1)/2))%n
            
    
    
    m=m+1
    if m%2==1:
        i=fi+(-1)**(m/2)
        j=fj
    else:
        i=fi
        j=fj+(-1)**(m/2)
        
    
    
print(res)

###法2⃣：
rowBegin=0
rowEnd=n-1
colBegin=0
colEnd=n-1
number=0
while rowBegin<=rowEnd and colBegin<=colEnd:
    for i in range(colBegin,colEnd+1):
        res[rowBegin][i]=number
        number=number+1
    rowBegin+=1
    for i in range(rowBegin,rowEnd+1):
        res[i][colBegin]=number
        number=number+1
    colEnd-=1
    if rowBegin<=rowEnd:
        for i in range(colEnd,colBegin-1,-1):
            res[rowEnd][i]=number
            number=number+1
        
        rowEnd-=1
    if colBegin<=colEnd:
        for i in range(rowEnd,rowBegin-1,-1):
            res[i][colBegin]=number
            number=number+1
        colBegin+=1
print(res)
        
    
        