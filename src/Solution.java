class Solution {
    public int[] plusOne(int[] digits) {



//        for (int n: digits) {
//            //System.out.println(n);
//        }

        //it needs to be on revers
        for(int i = digits.length-1;i>=0;i--){
           // System.out.println("\t"+i);
            //System.out.println("\t\t"+digits[i]);
            //if the current is
            if (digits[i]==9){
                digits[i]=0;
                //digits[i-1]= digits[i-1]+1;
                //TODO if i=0 thn need to make an extra alement
                if(i==0){
                    int[] outNew = new int[digits.length+1];
                   // System.out.println("the length is "+ digits.length);
                    //will populate new array
                    int index = 1;
                    for( int in : digits){
                        outNew[index]= 0;
                    }
                    outNew[0] = 1;
                    return outNew;
                }
            }
            else {
                //System.out.println("adding 1 to \t"+ digits[i]);
                digits[i]=digits[i]+1;
                //System.out.println("exiting");

                return digits;
            }

            //9 9 9 9 9

            //so


        }

        return digits;
    }
}
