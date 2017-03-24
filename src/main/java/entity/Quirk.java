package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
public class Quirk {
    private int quirkId;
    private String quirkString;

    @Id
    @Column(name = "Quirk_Id", nullable = false)
    public int getQuirkId() {
        return quirkId;
    }

    public void setQuirkId(int quirkId) {
        this.quirkId = quirkId;
    }

    @Basic
    @Column(name = "Quirk_String", nullable = true, length = 255)
    public String getQuirkString() {
        return quirkString;
    }

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
