def minMoves(arr):
    n=len(arr)
    dp=[]
    for i in range(n):
        dp.append([0 for i in range(n)])
    for i in range(n):
        x=0
        y=i-1
        while(y<n):
            if(x==1):
                dp[x][y]=1
            else:
                dp[x][y]=1+dp[x+1][y]
                for k in range(x+1,y+1):
                    if arr[x]==arr[k]:
                        n=0
                        if x + 1 == k :
                            n=1
                        
                        dp[x][y] = min(dp[x][y], dp[x + 1][y- 1] + dp[k + 1][y] + n);
            x+=1
            y+=1
    return dp[0][n-1]