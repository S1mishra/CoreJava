package ObjectInitializationConceptInJava;

public class CorrectSequencePrintedB {
    static CorrectSequencePrintedA s1 = new CorrectSequencePrintedA(1);
    CorrectSequencePrintedA a = new CorrectSequencePrintedA(2);
    
    public static void main(String[] args){
        CorrectSequencePrintedB B = new CorrectSequencePrintedB();
        CorrectSequencePrintedA A = new CorrectSequencePrintedA(3);
    }
    static CorrectSequencePrintedA s2 = new CorrectSequencePrintedA(4);
}

//Order of execution:
//1. static variables and static blocks in the order they are written (s1, s2)
//2. instance variables and instance blocks in the order they are written (a)
//3. constructor (main method creates two objects of CorrectSequencePrintedB and CorrectSequencePrintedA)