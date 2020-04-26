# java8-tutorials-corejava
Java8 Lambda Expression tutorials

## Lambda Expression

### Functional Interface:
    One of the important concept to learn functional interface.
        * Interface with one abstract method is called functional interface.Later, you use an inner class
        to define an instance of the class that implements this interface.
        
        Example: 
        ```
        // this is an example of functional interface
        interface DogQueries{
            public boolean test(Dog g);
        } 
        
        //Now implement this functional Interface.
        DogQueries dq = new DogQueries() {
            public boolean test(Dog g){
                return d.getAge() >9;
            }
                
        };
        
        // Same implementation in Lambda expression
        DogQueries dq = (d) -> d.getAge() > 9;
        
        // Check if Doggy is a older ?
        
        System.out.println("Is the Dog name Doggy is older than 9? " + dq.test(doggyInstance));
        
        
        ```
        
        
        Think of a lambda expression as a shorthand way of writing an instance of a class that
        implements a functional interface.
        
### Some inbuild bunctional interface Comparator and in Java 8, we have list of functional interfaces in 
java.util.function
 #### Lets find some implementation from java.util.function. 
### Method reference written as :: (double colon) 
    
 * Print the below list as List<String> trees = Arrays.asList("First","Second","Third");
    trees.forEach(t->System.out.println(t)); // print using lambda expression
    trees.forEach(System.out::println);// print using Method Reference.
    
    Above two statements print the same results.
    
    This method reference is a shorthand way of writing the lambda expression.
    
## Stream 
    ### Anotehr important concept of Java 8. Stream is isued to create a continuous flow of 
    data from a source . Stream is not a datastructure. 
    
    In Java, a stream is an object that gets its data from a source, but it doesn’t store any
    data itself. The data flowing through the stream can be operated on, multiple times if we
    want.

    ### Once we’ve used a stream, we can’t reuse it.
    
    * There are a variety of ways you can create a stream.
    * Streams are for data processing.
    * You’ll probably find you most often create streams from collections, arrays, and
      files.
