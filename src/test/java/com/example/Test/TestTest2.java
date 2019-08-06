package com.example.Test;

import org.junit.Test;

    public class TestTest2 {
            int count = 9;
            public void count1(){
                int count =10;
                System.out.println("count1="+count);
            }
            public void count2(){
                System.out.println("count2="+count);
            }
            @Test
            public static void main(String args[]){
                TestTest2 t=new TestTest2();
                t.count1();
                t.count2();
            }
        }
