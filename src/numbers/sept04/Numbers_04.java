// 04 September 2024
//Prime Numbers in a given range
package numbers.sept04;

import numbers.Num;

public class Numbers_04 extends Num {
    public static void main(String[] args) {
        Numbers_04 n04 = new Numbers_04();

        int start = Num.enterNumber();
        int end = Num.enterNumber();
        n04.printPrime(start, end);

    }

    void printPrime(int start, int end) {
        for (int i = start; i <= end; i++) {
            this.checkPrime(i);
        }
    }
    void checkPrime(int num){
        int count=0;
        for (int i=1;i*i<=num;i++){
            if (num%i==0){
                count++;
                if (num/i!=i){
                    count++;
                }
            }
        }
        if (count==2){
            System.out.println(num+"  ");
        }
    }
}