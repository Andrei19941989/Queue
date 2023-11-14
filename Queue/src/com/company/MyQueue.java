package com.company;

public class MyQueue {
  private int[] myArray;//массив хранения элементов в очереди
  int lastindex=-1;//индекс послденего доьавленого элемента

  public MyQueue(int n) {
     myArray=new int[n];
  }//n-максимальная вместимость очереди
  public void Add(int m)//m-новый элемент в очереди
  {
      if(lastindex<myArray.length-1)//проверка есть ли в массиве место для ноовго элемента
      {

          myArray[++lastindex] = m;
      }
      else
      {
          System.out.println("no place");
      }
  }
  public String toString(){
      String h="";
      for(int i=0;i<=lastindex;i++)//вернуть элементы ввиде строки
      {
          h +=myArray[i] + " ";
      }
      return h;
  }

  public  int Get()//доложен брать первый элемент из очереди
  {
      int r=myArray[0];//сохраняем первый элемент
      if(lastindex==-1)//нет ли в очереди элементов
      {
       System.out.println("нет элементов");
       return -1;
      }
      else
      {
          for(int i=1;i<myArray.length;i++)//сдвигает все элементы влево
          {
              myArray[i-1]=myArray[i];
          }
          lastindex--;
          return r;
      }

  }
  public int Peek()//вовзращает первый эжлемент в очереди
  {
      return myArray[0];
  }
}