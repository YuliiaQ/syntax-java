package homework18_06;

//Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

//Write program to inherit class A that has method printF which is static and call or reuse that method into class B

public class A {
    String word;
    A(String word){
        this.word = word;
    }
    String printF(){
        return "This method prints word any word : " + this.word;
    }
}

class B extends A {

    public B(String word) {
        super(word);
    }
}
class C extends B {

    public C(String word) {
        super(word);
    }
}
