package com.itheima.git;

public class SecondClass {


        public  static void main(){
           SecondClass fs=new SecondClass();
            int result= fs.add(5);
            System.out.println(result);
        }
        public int add(int a ){
            int sum=0;
            for (int i = 0; i < a; i++) {
                sum+=i;
            }

            return sum;

        }
    }


