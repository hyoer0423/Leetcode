// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int si=gas.length;
//         for(int i=0; i<si;i++){
//             if(gas[i]>=cost[i]){
//                if(calcu(gas,cost,i)==true) {
//                    return i;
//                }
//             }

//         }
//         return -1;
//     }
//     private boolean calcu(int[] gas,int[] cost,int i){
//         int s=0;
//         s=s+gas[i];
//         for(int j=0;j<gas.length-1;j++){
//             s=s-cost[(i+j)%gas.length];
//             if (s<0) return false;
//             s+=gas[(i+j+1)%gas.length];

//         }
//         s=s-cost[(i + gas.length - 1) % gas.length];
//         if(s>=0) return true;
//         return false;
//     }

// }
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int station = 0;
        int current = 0;
        int tank = 0;
        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            current += gas[i] - cost[i];

            if (current < 0) {
                current = 0;
                station = i + 1;

            }
        }
        if (tank < 0)
            return -1;
        return station;
    }
}