package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
public class Description {
    private int descriptionId;
    private String descriptionString;

    @Id
    @Column(name = "Description_Id", nullable = false)
    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    @Basic
    @Column(name = "Description_String", nullable = true, length = 255)
    public String getDescriptionString() {
        return descriptionString;
    }

    public void setDescriptionString(String descriptionString) {
        this.descriptionString = descriptionString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Description that = (Description) o;

        if (descriptionId != that.descriptionId) return false;
        if (descriptionString != null ? !descriptionString.equals(that.descriptionString) : that.descriptionString != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = descriptionId;
        result = 31 * result + (descriptionString != null ? descriptionString.hashCode() : 0);
        return result;
    }
}
