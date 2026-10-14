class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            p.add(i);
        }

        while(p.size()>1){

           
                int a=p.poll();
                int b=p.poll();
                if(a!=b){
                    p.add(Math.abs(a-b));
                    
                }
            
        }
        if(p.size()==1){
            return p.poll();
        }
        int a=0;
        return a;
        
    }
}