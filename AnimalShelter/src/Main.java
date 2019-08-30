public class Main {

	public static void main(String [ ] args){
    
		Shelter shelter = new Shelter();
    
		System.out.println("Adicionar Animais");

		Cat cat0 = new Cat("Animal " + 1 + ", cat");
		shelter.enqueue(cat0);
		Cat cat1 = new Cat("Animal " + 2 + ", cat");
		shelter.enqueue(cat1);
		Cat cat2 = new Cat("Animal " + 3 + ", cat");
		shelter.enqueue(cat2);
		Cat cat3 = new Cat("Animal " + 4 + ", cat");
		shelter.enqueue(cat3);


		Dog dog0 = new Dog("Animal " + 1 + ", dog");
		shelter.enqueue(dog0);
		Dog dog1 = new Dog("Animal " + 2 + ", dog");
		shelter.enqueue(dog1);
		Dog dog2 = new Dog("Animal " + 3 + ", dog");
		shelter.enqueue(dog2);
		Dog dog3 = new Dog("Animal " + 4 + ", dog");
		shelter.enqueue(dog3);



		for(int i = 0; i<shelter.size(); i++){
		  System.out.println(shelter.get(i).toString());
		}

		System.out.println("");
		System.out.println("-----------------");
		Animal animal;
		System.out.println("dequeueAny");
		try{
			animal = shelter.dequeueAny();
			System.out.println(animal.toString());
		} catch (Exception ex){
			System.out.println(ex);
		}
		
		System.out.println("dequeueDog");
		try{
			animal = shelter.dequeueDog();
			System.out.println(animal.toString());
		} catch (Exception ex){
			System.out.println(ex);
		}
		
		System.out.println("dequeueCat");
		try{
			animal = shelter.dequeueCat();
			System.out.println(animal.toString());
		} catch (Exception ex){
			System.out.println(ex);
		}


		System.out.println("");
		System.out.println("-----------------"); 
		System.out.println("Animais no Abrigo"); 
		for(int i = 0; i<shelter.size(); i++){
			System.out.println(shelter.get(i).toString());
		}
	}  
}