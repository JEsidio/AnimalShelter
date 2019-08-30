import java.util.LinkedList;
import java.util.ListIterator;

public class Shelter{
  
  private LinkedList <Animal> queue;
  
  Shelter(){
     queue = new LinkedList <Animal>();
  }
  
  public int size(){
    return queue.size();
  }
  
  public boolean isEmpty() {
	  return queue.isEmpty();
  }
  
  public Animal get(int index){
    return queue.get(index);
  }
  
  public void enqueue(Animal animal){
    queue.add(animal);
  }
  
  public Animal dequeueAny() throws Exception {
    if(!queue.isEmpty()){
      return queue.removeFirst();
    } else {
       throw new Exception("Sem animais no Abrigo");
    }
  }
  
  public Cat dequeueCat() throws Exception {
    if(!queue.isEmpty()){
      LinkedList<Dog> dogs = new LinkedList<Dog>();
      Cat firstCat;
      Animal animal;
      do {
        animal = queue.removeFirst();
        if(animal instanceof Dog){
          dogs.add((Dog) animal);
        }
      } while(!(animal instanceof Cat || queue.isEmpty()));
      
      if(queue.isEmpty() && animal instanceof Dog){
         throw new Exception("Sem Gatos no Abrigo");
      } else {
        firstCat = (Cat) animal;
        ListIterator<Dog> iterator = dogs.listIterator(dogs.size());
            while(iterator.hasPrevious()){
                queue.addFirst(iterator.previous());
            }
        return firstCat;
      }
    } else {
      throw new Exception("Sem animais no Abrigo");
    }
  }
  
  public Dog dequeueDog() throws Exception {
    if(!queue.isEmpty()){
      LinkedList<Cat> cats = new LinkedList<Cat>();
      Dog firstDog;
      Animal animal;
      do{
        animal = queue.removeFirst();
         if(animal instanceof Cat){
            cats.add((Cat) animal);
         }
      } while (!(animal instanceof Dog || queue.isEmpty()));
      if(queue.isEmpty() && animal instanceof Cat){
         throw new Exception("Sem Cachorros no Abrigo");
      } else {
        firstDog = (Dog) animal;
        ListIterator<Cat> iterator = cats.listIterator(cats.size());
            while(iterator.hasPrevious()){
                queue.addFirst(iterator.previous());
            }
        return firstDog;
      }
    } else {
      throw new Exception("Sem animais no Abrigo");
    }
  }
}