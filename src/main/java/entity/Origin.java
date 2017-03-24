package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
public class Origin {
    private int originId;
    private String originString;

    @Id
    @Column(name = "Origin_Id", nullable = false)
    public int getOriginId() {
        return originId;
    }

    public void setOriginId(int originId) {
        this.originId = originId;
    }

    @Basic
    @Column(name = "Origin_String", nullable = true, length = 255)
    public String getOriginString() {
        return originString;
    }

    public void setOriginString(String originString) {
        this.originString = originString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Origin origin = (Origin) o;

        if (originId != origin.originId) return false;
        if (originString != null ? !originString.equals(origin.originString) : origin.originString != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = originId;
        result = 31 * result + (originString != null ? originString.hashCode() : 0);
        return result;
    }
}
