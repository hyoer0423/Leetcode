public /* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class Solution extends VersionControl {
public int firstBadVersion(int n) {
//         if (n<=0) return 0;
//         if (n==1) return isBadVersion(1) ? 1:0;
//         int left=1,right=n;
//         while (left+1<right){
//             int mid=(left+right)/2;
      
//             if(isBadVersion(mid)==false){
//                 left=mid;
//             }else{
//                 right=mid;
//             }
      
      
//         }
  
  
//         if (isBadVersion(left)==true) return left;
//         return right;
  
//     }
  
int start=1;
  int end=n;

  while(start<=end)
  {
      int mid=start+(end-start)/2;
      if(isBadVersion(mid)) // IF MID IS BAD VERSION SEARCH IN LEFT FOR PREVIOUS BAD VERSION AS WE WANT FIRST BAND VERSION
          end=mid;
      else
         start=mid+1;;    // ELSE CHECK ON RIGHT SIDE
      
         
          if(start==end && isBadVersion(start))
              return start;
  }
  return -1;   
}
}class 278 {
    
}
