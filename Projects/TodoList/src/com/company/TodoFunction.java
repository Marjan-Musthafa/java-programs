package com.company;

import java.util.ArrayList;

public class TodoFunction {
    private ArrayList<String> item=new ArrayList<String>();

     public void add(String element){
         item.add(element);

     }
     public void remove(int index){
         String item=this.item.get(index);
         this.item.remove(index);
         System.out.println(item+" Removed ");
     }
     public void print()
     {
         for(int i=0;i< item.size();i++){
             System.out.println(i+1+"."+item.get(i));

         }

     }
     public void update(int index,String element){
         item.set(index,element);
     }
     public String search(String element){
         int index=item.indexOf(element);
         if(index<0){
             return null;
         }
         else{
             return item.get(index);
         }
     }

}
