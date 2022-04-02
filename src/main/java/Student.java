import java.awt.*;

public class Student {
    public Student(String firstName, String secondName, float maths, float physics, float programming) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.maths = maths;
        this.physics = physics;
        this.programming = programming;
        this.averageScore = (this.maths + this.physics + this.programming) / 3;
    }
    private void updateAverage() {
        averageScore = (maths + physics + programming) / 3;
    }
    protected String firstName;
    protected String secondName;
    protected float maths = 0;
    protected float physics = 0;
    protected float programming = 0;
    protected float averageScore = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
        updateAverage();
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
        updateAverage();
    }

    public float getProgramming() {
        return programming;
    }

    public void setProgramming(float programming) {
        this.programming = programming;
        updateAverage();
    }

    public  float getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + averageScore + "\n";
    }
}
