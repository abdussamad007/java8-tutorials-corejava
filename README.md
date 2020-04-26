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
        
