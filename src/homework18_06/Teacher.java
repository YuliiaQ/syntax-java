package homework18_06;

class Teacher {
    String name;
    String typeOfTeacher;

    public void teach() {
        System.out.println(name + " Teaches " + typeOfTeacher);
    }
}

class MathTeacher extends Teacher {
    String favoriteMathSubject;

    public void teachesMath() {
        System.out.println(name + " Teaches Math and his favorite math subject is " + favoriteMathSubject);
    }
}

class ChemistryTeacher extends Teacher {
    String favoriteChemSubject;

    public void teachesChemistry() {
        System.out.println(name + " Teaches Chemistry and his favorite Chemistry subject is " + favoriteChemSubject);
    }
}

class PianoTeacher extends Teacher {
    String favoriteModelOfPiano;

    public void teachesPiano() {
        System.out.println(name + " Teaches Piano and his favorite Piano Model is " + favoriteModelOfPiano);
    }
}