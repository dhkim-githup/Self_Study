package org.example._58_추상클래스;

public class Sample04 {

    public static void main(String[] args) {
        Pet cat = new Cat(false, 4);
        cat.run(getPetName(cat));

        cat = new Parrot(true, 2);
        cat.run(getPetName(cat));

        Parrot parrot = (Parrot) cat;
        parrot.fly(getPetName(parrot));

        Pet pet = parrot;
        //pet.fly(getPetName(pet));

    }

    public static String getPetName(Pet pet){
        String str = "";

        if(pet instanceof Cat){
            str = "고양이";
        } else if (pet instanceof Parrot) {
            str = "앵무새";
        }

        return str;
    }

}
