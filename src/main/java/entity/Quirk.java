package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
@Table(name="quirk")
public class Quirk {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name = "Quirk_Id", nullable = false)
    private int quirkId;

    @Column(name="Quirk_String")
    private String quirkString;

    /**
     * Returns the Quirk's id
     * @return
     */
    public int getQuirkId() {
        return quirkId;
    }

    /**
     * Sets the Quirk's Id
     * @param quirkId
     */
    public void setQuirkId(int quirkId) {
        this.quirkId = quirkId;
    }

    /**
     * Returns the Quirk's string
     * @return
     */
    public String getQuirkString() {
        return quirkString;
    }

    /**
     * Sets the Quirk's String
     * @param quirkString
     */
    public void setQuirkString(String quirkString) {
        this.quirkString = quirkString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quirk quirk = (Quirk) o;

        if (quirkId != quirk.quirkId) return false;
        if (quirkString != null ? !quirkString.equals(quirk.quirkString) : quirk.quirkString != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quirkId;
        result = 31 * result + (quirkString != null ? quirkString.hashCode() : 0);
        return result;
    }
}
