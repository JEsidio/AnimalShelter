import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

public class Tests {
	
	@Test
	public void isEmpty() {
		Shelter queue = new Shelter();
		assertEquals("A fila deve estar vazia",true,queue.isEmpty());
	}
	
	@Test
	public void size() {
		Shelter queue = new Shelter();
		assertEquals("O tamanho da fila deve ser zero",0,queue.size());
	}
	
	@Test
	public void enqueue() {
		Shelter queue = new Shelter();
		Cat cat = new Cat("Animal " + 1 + ", cat");
		queue.enqueue(cat);
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeue() throws Exception {
		Shelter queue = new Shelter();
		Cat cat = new Cat("Animal " + 1 + ", cat");
		Dog dog = new Dog("Animal " + 1 + ", dog");
		queue.enqueue(cat);
		queue.enqueue(dog);
		assertEquals("Front deve retornar o elemento gato",(Animal)cat,queue.dequeueAny());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeueCat() throws Exception {
		Shelter queue = new Shelter();
		Dog dog = new Dog("Animal " + 1 + ", dog");
		Cat cat = new Cat("Animal " + 1 + ", cat");
		queue.enqueue(cat);
		queue.enqueue(dog);
		assertEquals("Front deve retornar o elemento gato",(Animal)cat,queue.dequeueCat());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeueDog() throws Exception {
		Shelter queue = new Shelter();
		Cat cat = new Cat("Animal " + 4 + ", cat");
		Dog dog = new Dog("Animal " + 1 + ", dog");
		queue.enqueue(cat);
		queue.enqueue(dog);
		assertEquals("Front deve retornar o elemento cachorro",(Animal)dog,queue.dequeueDog());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}

}