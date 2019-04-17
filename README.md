For EqualsAndHashcode Branch:

Steps to implement Equals():
 1) compare objects using == operator;
 2) check, whether the Object o parameter is not null. If yes, return false;
 3) check, whether the Object o parameter has the same type, as our instance. If no, return false;
 4) cast the Object o to the current class type;
 5) compare the chosen fields values.

Hashcode():
Is used for the hashing purposes — to provide the int value for the object;
Rules of the method:
- each invocation of hashCode() method on the same object that hasn’t been changed must produce the same result each time;
 - if 2 objects are equal through the equals() method, then invoking the hashCode() method on each of these 2 objects must produce the same result;
 - but if invoking the hashCode() method on 2 objects produces the same result, it doesn’t mean that they are equal (through the equals() method).
The last 2 rules are also known as a contract between equals() and hashCode() methods.

HashMap and equals()/hashCode() method usage:
HashMap is the collection for storing key-value pair elements, that uses hashing under the hood to provide extremely fast get operations;
The elements of the HashMap are stored into buckets;
hashCode() results are used to compute the number of the bucket, where the element will be stored;
equals() is used to compare elements keys to find the needed element;
If the hashCode() is implemented in a hardcoded way, all the instances of the same class will be stored in one bucket, that will lead to the performance issues (n operations instead of 1 for the get process);
Also, the element could be lost, if the hashCode() returns new value each time or isn’t compliant with the contract between equals() and hashCode().
