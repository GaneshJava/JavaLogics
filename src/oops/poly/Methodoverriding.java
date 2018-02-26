package oops.poly;


class Animal
 {
  int height=10;
  int weight=20;

 void talk()
  {
   System.out.println("Animals shoutings");
//   System.out.println("Animals Biting");
//   System.out.println("Animals running");
  }

  void food()
  {
    System.out.println("Animals eating..");

  }
 }

class Cat extends Animal                   
 {                                         
   void talk()                             
   {                                       
	  System.out.println("cats souting: meo... meo");
   }                                        

   void food()
   {
	   System.out.println("cats Drink milk");

   }

 }

class Dog extends Animal                   
{                                         
  void talk()                             
  {                                       
	  System.out.println("dogs souting Bow... Bow");
  }                                        

  void food()
  {
	   System.out.println("dogs are Eating non-veg");

  }

}

class Methodoverriding
{

  public static void main(String[] args)
  {
   Animal a = new Animal();
   Cat c = new Cat();
   Dog d = new Dog();
   /* c.height=20 */;
   
   a.talk();
   a.food();
   System.out.println("--------------------------------");
   c.talk();
   c.food();
   System.out.println("--------------------------------");
   d.talk();
   d.food();
   System.out.println("--------------------------------");
   

   System.out.println("Height:"+c.height);
   System.out.println("Height:"+c.weight);
  }
}