package page.entity;

public class Portfolio{
    String name;
    String Birthday;
    String Gender;
    String experience;
    String speciality;
    String lastWork;

    public Portfolio(String name, String birthday, String gender, String experience, String speciality, String lastWork) {
        this.name = name;
        Birthday = birthday;
        Gender = gender;
        this.experience = experience;
        this.speciality = speciality;
        this.lastWork = lastWork;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLastWork() {
        return lastWork;
    }

    public void setLastWork(String lastWork) {
        this.lastWork = lastWork;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "name='" + name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Gender='" + Gender + '\'' +
                ", experience='" + experience + '\'' +
                ", speciality='" + speciality + '\'' +
                ", lastWork='" + lastWork + '\'' +
                '}';
    }
}
