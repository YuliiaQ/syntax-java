package homework01_07;

class A extends Marks{
    A(int mark1, int mark2, int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    int getAverage() {
        return (mark1+mark2+mark3)/3;
    }
}
