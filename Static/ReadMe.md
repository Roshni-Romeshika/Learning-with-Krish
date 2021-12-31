Implemented simple program is mainly used to demostrate in what order static block, empty block and contructor execute and it gave the execution order as below.

1. Execute the static block
2. Execute the empty block
3. Execute the constructor.

However, no matter how many instances we create in the program, static block is executed for First and only once until that program runs.


Now, Let's see how it happened.
Whenever we declare a block with the 'static' keyword we called that block as a static block.
This static block is get executed only the time where JVM loads the .class file into the memory. Therefore, this static block is getting call even before the main method starts its execution becuase JVM calls the main method after the it loads the .class file. So this static block is called irrespectively of object creation. Now we are clear why static method executes first.
Empty block is a block that has no associated name or data type and is placed outside of any method, another block or a constructor and it just have only a body where as construcor has the same name as the class.
Empty block and constructor both are not get executed before the object creation and this empty block is called before your constructor get called, so preinitialization can be done in this empty block. Therefore both empty block and constructor execute after the static block but empty block execute before the constructor. 


