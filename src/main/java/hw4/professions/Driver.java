//Driver містить:
//        поле name
//        поле experience

package hw4.professions;

public class Driver extends Person {
    String name = "Default";
    int experience = 4;


    public Driver(int age, String fullName, String name, int experience) {
        super(age, fullName);
        this.name = name;
        this.experience = experience;
    }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getExperience() {
                return experience;
        }

        public void setExperience(int experience) {
                this.experience = experience;
        }

        @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}



