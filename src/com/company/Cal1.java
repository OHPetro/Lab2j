package com.company;

public class Cal1 {
    public static void Add(String str){

        int res = 0;
        str = str.replaceAll("\\\\n",",");

        if(str.contains("-") == true) {
            System.out.println("\nВы ввели отрицательные числа ");

            String [] minus = str.split("(?=-)|\\D");
            for(int a=0;a<minus.length;a++) {
                if(minus[a].contains("-")){
                    System.out.println(minus[a]);
                }

            }
            System. exit(0);

        }



        if(str.matches("^([0-9]*+\\W*)*$") == false){ //
            System.out.println("Ваш ввод был неправельным ");
        }else{
            String[] value = str.split("\\W"); //разделяем строку по ","
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