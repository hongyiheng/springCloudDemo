package com.example.Test;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

import static org.junit.Assert.*;


public class TestTest {
    @Test
    public void main(){
        List lis = new ArrayList();
        lis.add(new woker("林狗","25","3000"));
        lis.add(new woker("林狗2","25","3000"));
        lis.add(new woker("林狗3","25","3000"));

        lis.add(2,new woker("洪优秀","24","3300"));
        lis.remove(1);

//        for(Object obj : lis){
//            woker w = (woker) obj;
//            System.out.println(w.getName()+","+w.getAge()+","+w.getWages());
//        }

        Iterator li =lis.iterator();
		while(li.hasNext()){
			woker w =(woker)li.next();
			System.out.println(w.toString());
		}

    }
}