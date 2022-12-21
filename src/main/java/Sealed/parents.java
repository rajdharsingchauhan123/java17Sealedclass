package Sealed;

public sealed class parents permits Child1 ,child2 {


    void parentsmethod() {
        System.out.println("hello bachho");
    }
}