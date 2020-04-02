package v1ch05.abstractClasses;

public abstract class Person
{
   /**
    * 定义抽象方法获取描述信息
    *
    * @return
    */
   public abstract String getDescription();
   private String name;

   public Person(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }
}
