package by.it.krukouski.jd02_06;

public class Question {

    public enum Animal{
        DOG{
            public String toString(){
                return "Dog";
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(Animal.DOG.name());
        System.out.println(Animal.DOG.toString().equals(Animal.DOG.name()));

    }
}
