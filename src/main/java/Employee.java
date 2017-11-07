/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param somename .
     * @param somemanager .
     */
    public Employee(final String somename, final String somemanager) {
        this.name = somename;
        this.manager = somemanager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param somename .
     */
    public void setName(final String somename) {
        this.name = somename;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param somemanager .
     */
    public void setManager(final String somemanager) {
        this.manager = somemanager;
    }
}
