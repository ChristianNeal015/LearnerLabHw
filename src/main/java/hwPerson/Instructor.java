package hwPerson;

public class Instructor extends Person implements Teacher {
    public Instructor(String name, long id) {
        super(name, id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(int x = 0; x < learners.length; x++){
            learners[x].learn(numberOfHoursPerLearner);
        }
    }
}