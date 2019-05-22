/*
 * Aabhas Mehta
 * Student ID: 991 542 302
 * SYST10199 - Web Programming
 */
package sw_week3;

/**
 *
 * @author User
 */
public class Student {
    private int id;
    private String firstName;
    public int maxCourse;
    private boolean partTime;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the partTime
     */
    public boolean isPartTime() {
        return partTime;
    }

    /**
     * @param partTime the partTime to set
     */
    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }
}
