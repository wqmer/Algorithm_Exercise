package crackingCodeThreeStacksAndQueues;

import java.util.LinkedList;

public class AnimalShelter {
	
	abstract class Animal {
		private int timeStamp;
		protected String name ;
		public Animal(String n){ name  = n ; }
		public void setTimeStamp(int a){ timeStamp = a ;}
        public int getTimeStamp() { return timeStamp ;}
        public boolean isOlderThan (Animal temp)
        { 
        	return this.timeStamp < temp.getTimeStamp() ;
        }
     
}
		
	class AnimalQueue {
		LinkedList<Dog> dogs = new LinkedList<Dog>();
		LinkedList<Cat> cats = new LinkedList<Cat>();
		private int timeStamp = 0 ;
		
		public void addAnimal(Animal temp ){
          temp.setTimeStamp(timeStamp);
          timeStamp++;
          
          if (temp instanceof Dog) dogs.addLast((Dog)temp);
          else if (temp instanceof Cat) cats.addLast((Cat)temp);	
		}
		
		public Animal AdoptAny()
		{  
			if (dogs.size() == 0 ){ 
				return AdoptCat(); 
		    } else if (cats.size() == 0 ){
			    return AdoptDog() ; 
			}
	
           if (dogs.peek().isOlderThan(cats.peek()))
           {   return AdoptDog(); }
           else 
           {   return AdoptCat(); }
           
		}

		public Dog AdoptDog(){
			return dogs.poll();	
		}
		
		public Cat AdoptCat(){
			return cats.poll();	
		}
		
	}
	
	
	public class Dog extends Animal {
		public Dog(String n) { super(n);}	
	}
	
	public class Cat extends Animal {
		public Cat(String n) { super(n);}	
	}
	

}
