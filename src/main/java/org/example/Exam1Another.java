package org.example;
/*Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/
public class Exam1Another {
    StringBuilder sqlRequest = new StringBuilder("select * from students where");

    public void addSql(){
        String parametr = ("{name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\",\"age\":\"null\"}");
        int startIndex = 0;
        if(parametr.contains("null")){
            startIndex = parametr.indexOf("null");
        }
        char [] arr = parametr.toCharArray();
        int index = 0;
        for (int i = startIndex; i > 0; i--) {
            if(arr[i] == ','){
                index = i;
                break;
            }
        }
        System.out.println(index);
        StringBuilder newParametr = new StringBuilder(parametr.substring(0, index));
        sqlRequest.append(newParametr + "}");
        System.out.println(sqlRequest);
    }
    public static void main(String[] args) {
        Exam1Another exam1 = new Exam1Another();
        exam1.addSql();







    }
}
