package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
@Table(name = "origin")
public class Origin {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name = "Origin_Id", nullable = false)
    private int originId;

    @Column(name = "Origin_String")
    private String originString;

    /**
     * Gets the Origin's Id
     * @return
     */
    public int getOriginId() {
        return originId;
    }

    /**
     * Sets the Origin's Id
     * @param originId
     */
    public void setOriginId(int originId) {
        this.originId = originId;
    }

    /**
     * Gets the Origin's String
     * @return
     */
    public String getOriginString() {
        return originString;
    }

    /**
     * Sets the Origin's String
     * @param originString
     */
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
