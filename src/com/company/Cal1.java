package com.company;

public class Cal1 {
    public static void Add(String str){

        int res = 0;

        str = str.replaceAll("\\\\n",",");


        if(str.matches("^([0-9]*+\\W*)*$") == false){ //
            System.out.println("Ваш ввод был неправельным ");
        }else{
            String[] value = str.split("\\W*"); //разделяем строку по ","
            for(int i=0;i<value.length;i++){
                int strtoint = 0;
                try{
                    strtoint = Integer.parseInt(value[i]);  //делает из типа стр тип инт
                    res+=strtoint;
                }catch (NumberFormatException e){
                }
            }

            System.out.println(res);

        }
    }
}